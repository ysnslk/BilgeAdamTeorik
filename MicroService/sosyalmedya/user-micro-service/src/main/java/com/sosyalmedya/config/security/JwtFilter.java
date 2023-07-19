package com.sosyalmedya.config.security;

import com.sosyalmedya.exceptions.ErrorType;
import com.sosyalmedya.exceptions.UserException;
import com.sosyalmedya.utility.JwtTokenManager;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;

public class JwtFilter extends OncePerRequestFilter {
    @Autowired
    JwtTokenManager jwtTokenManager;
    @Autowired
    JwtUser jwtUser;
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        /**
         * RestAPI ye gelen istek türleri şu şekilde ulaşır.
         * fetch('http://localhost:9090/api/v1/user/findAll' {
         * method: 'POST',
         * headers: {
         *      'Content-Type': 'application/json',
         *      'Authorization': 'Bearer' + token
         *      },
         *      body: JSON.stringft({
         *      userid: 223454354,
         *      ip: '122.28.57.54'
         *      })
         *   })
         *   Burada dikkat ederseniz Header içinde token bilgileri Authorization KEY ile gelir bu nedenle header içinde
         *   bu KEY in VALUE bilgisini almamız ve içinden token 2 ayırmamız gereklidir.
         */
        final String authorizationHeader =  request.getHeader("Authorization");
        if(authorizationHeader!= null && authorizationHeader.startsWith("Bearer ")){ // Başlık dolumu ve Bearer ile başlıyor mu?
            String token = authorizationHeader.substring(7); // Token bilgisini çek
            Optional<Long> authId = jwtTokenManager.getByIdFromToken(token);
            if (authId.isEmpty()){
                throw new UserException(ErrorType.INVALID_TOKEN); // Token geçersiz ise hata fırlat
            }
            UserDetails userDetails = jwtUser.getUserByAuthId(authId.get());
            UsernamePasswordAuthenticationToken userSpringToken =
                    new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(userSpringToken);
        }
        filterChain.doFilter(request,response);

    }
}
