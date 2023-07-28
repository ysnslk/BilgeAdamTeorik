package com.sosyalmedya.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalAuthentication
public class UserSecurityConfig {

    @Bean
    JwtFilter getJwtFilter(){
        return new JwtFilter();
    }

    /**
     * Spring Application Context, uygulamanız başlatılırken gerekli olan tüm sınıflardan nesneler
     * yaratarak context içine atar, gerekli olduğunda burada kullanılır.
     * Spring Security de SecurityFilterChain nesnesini context içine atar. Bu nesne ile
     * filtreleme işlemlerini yapar. Biz bu sınıf içinde bir SecurityFilterChain nesnesini oluşturarak
     * yani bir Bean yaratacak bu nesnenin özelliklerini değiştireceğiz.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        /**
         * Spring 6.0 ve üzeri için Security Kullanımı
         * permitAll() -> Herkese Açık
         * hasRole() -> Belirtilen rolde olmalı
         * DİKKAT!! kişi kullanıcı adı şifresi ya da jwt ile giriş yapsa bile eğer belirtilen yolu yoksa giriş yapamaz.
         */
        httpSecurity.authorizeHttpRequests(req ->
                req.requestMatchers("/api/v1/user/hello","/swagger-ui/**","/v3/api-docs/**") // requestMatchers isteklern endpoint pathlerin tanımlandığı
                        .permitAll() // Herkese Açık
                        .requestMatchers("/api/v1/user/**") // localhost:9092/api/v1/user/[herhangi bir istek]
                        .hasAuthority("USER") // User Rolüne sahip olmalı
                      //  .requestMatchers("/api/v1/**").hasAnyRole("Admin", "SuperUser", "AhmetAmca", "Ben_De_GELDIM")
                        .anyRequest() // Diğer bütün istekler
                        .authenticated() // Oturum açmış olmayı zorla
        );

        /**
         * DİKKAT!!! RestApı kullanırken farm login işlemleri kullanılmaz. Aynı zamanda fom işlemlerinde
         * gelen isteklerin kendi göndeririğimiz formlar üzerinden gelmesini sağlamak için CSRF token kullanılır.
         * Bu rest api için mümkün değildir bu nedenle kapatmamız gerekir. Aksi takdirde 403 hata kodu alırsınız.
         * _csrf
         *
         * <form action="/login" method="post">
         *           _csrf
         *           username
         *           password
         *     </form>
         *     http://localhost:9090/login -> fetch('http://localhost:9090/login',{username,password});
         */
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        /**
         * Filtreleme işleminden önce devreye girerek filtreleme işlemi manüple ederek değiştiriyoruz.
         * Yani filtreleme yöntemini devralıyoruz.
         */
        httpSecurity.addFilterBefore(getJwtFilter(), UsernamePasswordAuthenticationFilter.class);

        /**
         * Spring 6.0 ve öncesi için Security Kullanımı
         */
        /**
         * httpSecurity
         *  .authorizeRequests()
         *  .antMatchers("/admin/**") // Admin altındaki tüm istekler
         *  .anyRequest() // Herhangi bir istek gelirse
         *  .authenticated(); // Oturum açmış olmaya zorla
         */

        // httpSecurity.formLogin(); // Form login kullan
        // httpSecurity.formLogin("/admni/login");
      //  httpSecurity.formLogin(Customizer.withDefaults()); // Varsayılan form login sayfası kullan

        return httpSecurity.build();
    }
}
