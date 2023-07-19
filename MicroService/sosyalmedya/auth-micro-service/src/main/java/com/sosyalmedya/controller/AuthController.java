package com.sosyalmedya.controller;

import com.sosyalmedya.dto.request.DoLoginRequestDto;
import com.sosyalmedya.dto.request.DoRegisterRequestDto;
import com.sosyalmedya.dto.response.DoLoginResponseDto;
import com.sosyalmedya.dto.response.DoRegisterResponseDto;
import com.sosyalmedya.rabbitmq.model.CreateProfile;
import com.sosyalmedya.rabbitmq.producer.CreateProfileProducer;
import com.sosyalmedya.repository.entity.Auth;
import com.sosyalmedya.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.sosyalmedya.constants.RestApiList.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH)
public class AuthController {

    private final AuthService authService;
    private final CreateProfileProducer createProfileProducer;

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Merhaba bu servis AUTH servisidir");
    }

    @GetMapping("/testrabbit")
    @CrossOrigin("*")
    public ResponseEntity<Void> testRabbitSendMessage(String username, String email, Long authid) {
        createProfileProducer.sendCreateProfileMessage(
                CreateProfile.builder()
                        .authId(authid)
                        .email(email)
                        .username(username)
                        .build()
        );
        return ResponseEntity.ok().build();
    }

    @PostMapping(LOGIN)
    @CrossOrigin("*")
    public ResponseEntity<DoLoginResponseDto> doLogin(@RequestBody @Valid DoLoginRequestDto dto) {
        String token = authService.login(dto);
        return ResponseEntity.ok(DoLoginResponseDto.builder()
                .status(200)
                .result("Giriş İşlemi Başarılı")
                .token(token)
                .build());

    }

    @PostMapping(REGISTER)
    @CrossOrigin("*")
    public ResponseEntity<DoRegisterResponseDto> doRegister(@RequestBody @Valid DoRegisterRequestDto dto) {
        Boolean isRegister = authService.register(dto);
        if (isRegister) {
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
