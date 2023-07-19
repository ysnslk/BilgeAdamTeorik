package com.sosyalmedya.service;

import com.sosyalmedya.dto.request.DoLoginRequestDto;
import com.sosyalmedya.dto.request.DoRegisterRequestDto;
import com.sosyalmedya.dto.request.UserSaveRequestDto;
import com.sosyalmedya.exceptions.AuthException;
import com.sosyalmedya.exceptions.ErrorType;
import com.sosyalmedya.manager.IUserManager;
import com.sosyalmedya.mapper.IAuthMapper;
import com.sosyalmedya.rabbitmq.model.CreateProfile;
import com.sosyalmedya.rabbitmq.producer.CreateProfileProducer;
import com.sosyalmedya.repository.IAuthRepository;
import com.sosyalmedya.repository.entity.Auth;
import com.sosyalmedya.utility.JwtTokenManager;
import com.sosyalmedya.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth,Long> {
    private final IAuthRepository repository;
    private final IUserManager userManager;
    private final CreateProfileProducer createProfileProducer;
    private final JwtTokenManager jwtTokenManager;


    public AuthService(IAuthRepository repository, IUserManager userManager, CreateProfileProducer createProfileProducer, JwtTokenManager jwtTokenManager) {
        super(repository);
        this.repository = repository;
        this.userManager = userManager;
        this.createProfileProducer = createProfileProducer;
        this.jwtTokenManager = jwtTokenManager;
    }
    /**
     * Register a new user
     * Login
     * Not:
     * - Kayıt olurken eğer aynı kullanıcı adı var ise hata döndürülecek
     * - Kayıt başarılı ise olumsu sonuç dönülecek
     * - Giriş yapancı kullanıcıya bir JWT token döndürülecek
     * - Giriş tesorun olursa sorun bilgisi DTO olarak dönülecek.
     */
    public Boolean register(DoRegisterRequestDto dto){
        if(!dto.getPassword().equals(dto.getPasswordConfirm())) // eğer şifre ile şifre doğrulama eşit değiş ise hata fırlat
            throw new AuthException(ErrorType.REGISTER_PASSWORDS_NOT_MATCH);
        repository.findOptionalByUsername(dto.getUsername()) // eğer kullanıcı adı var ise hata fırlat
                .ifPresent(auth -> {
                    throw new AuthException(ErrorType.REGISTER_KULLANICIADI_KAYITLI);
                });
//       Auth auth = Auth.builder()
//               .email(dto.getEmail())
//               .username(dto.getUsername())
//               .password(dto.getPassword())
//               .build();
        Auth auth = IAuthMapper.INSTANCE.authFromDto(dto);
        repository.save(auth);
        /**
         * Auth seervis kullanıcıyı kayıt ettikten sonra user microservisine kullanıcı prıofili oluşturulmamk üzere bilgi gönderir.
         */
        userManager.save(UserSaveRequestDto.builder()
                .authid(auth.getId())
                .email(dto.getEmail())
                .username(dto.getUsername())
                .build());

        /**
         * Auth servis kullanıcıyı kayıt ettikten sonra user microservisine kullanıcı profili oluşturmak üzere bilgi gönderir
         * Dikkat!!!!!
         * auth servis ile user servis arasında tutarlılık gerektiren bir bağlantı vardır. Bu neden
         * auth bir veriyi kayıt ettiğinde mutlaka userserviste oluşmalıdır.
         */
        createProfileProducer.sendCreateProfileMessage(
                CreateProfile.builder()
                        .authId(auth.getId())
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .build()
        );
        return true;
    }
    public String login(DoLoginRequestDto dto){
        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(),dto.getPassword());
        /**
         * DİKKAT!!! burada iki yolumuz var;
         * 1- Auth bilgisini sorgulayarak kullanıcı yok ise false dönebiliriz.
         *     if(auth.isEmpty())
         *             return false;
         *      return auth.isPresent();
         * 2- Auth bilgisini sorgulayarak kullabıcı yok ise ya da bilgileri yanlış ise exception fırlatabiliriz.
         */
        if(auth.isEmpty()) throw new AuthException(ErrorType.DOLOGIN_INVALID_USERNAME_PASSWORD);
        Optional<String> token = jwtTokenManager.createToken(auth.get().getId());
        if(token.isEmpty()){
            throw new AuthException(ErrorType.BAD_REQUEST_ERROR);
        }
        return token.get();
    }

    public Optional<Auth> loginAlternatif(DoLoginRequestDto dto){
        return repository.findOptionalByUsernameAndPassword(dto.getUsername(),dto.getPassword());
    }


}