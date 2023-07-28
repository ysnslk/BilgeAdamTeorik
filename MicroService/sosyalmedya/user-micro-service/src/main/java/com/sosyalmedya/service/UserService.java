package com.sosyalmedya.service;

import com.sosyalmedya.dto.request.UserSaveRequestDto;
import com.sosyalmedya.exceptions.ErrorType;
import com.sosyalmedya.exceptions.UserException;
import com.sosyalmedya.repository.IUserRepository;
import com.sosyalmedya.repository.entity.User;
import com.sosyalmedya.utility.JwtTokenManager;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository repository;
    private final JwtTokenManager jwtTokenManager;

    public void save(UserSaveRequestDto dto) {
        repository.save(User.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
    }

    public List<User> findAll(String token) {
       Optional<Long> id = jwtTokenManager.getByIdFromToken(token);
       if (id.isEmpty()){
           throw new UserException(ErrorType.INVALID_TOKEN);
       }
        return repository.findAll();
    }

    /**
     * ad 0 muhammet -> MUHAMMET
     * Cache -> redis üzerinde
     * @param ad
     * @return
     */
    @Cacheable(value = "upperCase")
    public String toUpper(String ad){
        String upperCaseName = ad.toUpperCase();
        try {
            Thread.sleep(3000L);
        }catch (InterruptedException e){
            System.out.println("HATA");
        }
        return upperCaseName;
    }
}
