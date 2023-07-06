package com.sosyalmedya.service;

import com.sosyalmedya.dto.request.DoLoginRequestDto;
import com.sosyalmedya.dto.request.DoRegisterRequestDto;
import com.sosyalmedya.exceptions.AuthException;
import com.sosyalmedya.exceptions.ErrorType;
import com.sosyalmedya.mapper.IAuthMapper;
import com.sosyalmedya.repository.IAuthRepository;
import com.sosyalmedya.repository.entity.Auth;
import com.sosyalmedya.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth, Long> {
    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }

    /**
     * Register işlemi
     * Login işlemi
     * Not :
     * - Kayıt olurken eğer aynı kullanıcı adı var ise hata döndürsün.
     * - Kayıt başarılı ise olumlu sonuç dönülecek
     * - Giriş yapan kullanıcıya bir JWT token döndürülecek
     * - Girişte sorun olursa sorun bilgisi DTO olarak dönülecek.
     */
    public Boolean register(DoRegisterRequestDto dto) {
        if (!dto.getPassword().equals(dto.getPasswordConfirm())) { // Şifre Doğrulama
            throw new AuthException(ErrorType.REGISTER_PASSWORD_NOT_MATCH);
        }
        repository.findOptionalByUsername(dto.getUsername())
                .ifPresent(auth -> {
                    throw new AuthException(ErrorType.REGISTER_KULLANICIADI_KAYITLI);
                });
        /**
         * Auth auth = Auth.builder()
         *                 .email(dto.getEmail())
         *                 .username(dto.getUsername())
         *                 .password(dto.getPassword())
         *                 .build();
         *         repository.save(auth);
         */
        Auth auth = IAuthMapper.INSTANCE.authFromDto(dto);
        repository.save(auth);
        return true;
    }

    public Boolean login(DoLoginRequestDto dto) {
        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        /**
         * DİKKAT!!! burada iki yolumuz var;
         * 1 - Auth bilgisini sorgulayarak kullanıcı yok ise false dönebiliriz.
         * if(auth.isEmpty()){
         *             return false;
         *         }
         * return auth.isEmpty();
         * 2 - Auth bilgisini sorgulayarak kullanıcı yok ise ya da bilgiler yanlış ise exception fırlatabiliriz.
         */
        if (auth.isEmpty()) throw new AuthException(ErrorType.DOLOGIN_INVALID_USERNAME_PASSWORD);
        return true;
    }

    public Optional<Auth> loginAlternatif(DoLoginRequestDto dto) {
        return repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    }

}
