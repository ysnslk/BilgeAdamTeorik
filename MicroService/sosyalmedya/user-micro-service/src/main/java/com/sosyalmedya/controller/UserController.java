package com.sosyalmedya.controller;

import com.sosyalmedya.dto.request.UserSaveRequestDto;
import com.sosyalmedya.dto.response.UserSaveResponseDto;
import com.sosyalmedya.repository.entity.User;
import com.sosyalmedya.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.sosyalmedya.constants.RestApiList.*;
@RestController
@RequiredArgsConstructor
@RequestMapping(USER)
public class UserController {
    private final UserService userService;

    @PostMapping(SAVE)
    public ResponseEntity<UserSaveResponseDto> save(@RequestBody UserSaveRequestDto dto){
       userService.save(dto);
        return ResponseEntity.ok(UserSaveResponseDto.builder()
                        .status(200)
                        .result("Başarılı bir şekilde kaydedildi")
                .build());
    }
    @PostMapping(FINDALL)
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

}
