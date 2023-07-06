package com.sosyalmedya.controller;

import com.sosyalmedya.dto.request.DoLoginRequestDto;
import com.sosyalmedya.dto.request.DoRegisterRequestDto;
import com.sosyalmedya.dto.response.DoLoginResponseDto;
import com.sosyalmedya.dto.response.DoRegisterResponseDto;
import com.sosyalmedya.repository.entity.Auth;
import com.sosyalmedya.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static com.sosyalmedya.constants.RestApiList.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH)
public class AuthController {

    private final AuthService authService;

    @PostMapping(LOGIN)
    public ResponseEntity<DoLoginResponseDto> doLogin(@RequestBody @Valid DoLoginRequestDto dto) {
       Boolean isLogin = authService.login(dto);

        if(isLogin){
            return ResponseEntity.ok(DoLoginResponseDto.builder()
                            .status(200)
                            .result("Giriş İşlemi Başarılı")
                    .build());
        }
        return ResponseEntity.badRequest().body(
                DoLoginResponseDto.builder()
                        .status(400)
                        .result("Giriş işlemi başarısız oldu . Bilgileri kontorl edin.")
                        .build()
        );
    }

    @PostMapping(REGISTER)
    public ResponseEntity<DoRegisterResponseDto> doRegister(@RequestBody @Valid DoRegisterRequestDto dto) {
        Boolean isRegister = authService.register(dto);
        if(isRegister){
            return ResponseEntity.ok(DoRegisterResponseDto.builder()
                    .status(200)
                    .result("Kayıt İşlemi Başarılı")
                    .build());
        }
        return ResponseEntity.badRequest().body(
                DoRegisterResponseDto.builder()
                        .status(400)
                        .result("Kayıt işlemi başarısız oldu . Bilgileri kontorl edin.")
                        .build()
        );
    }
}
