package com.yasinsolak.controller;

import com.yasinsolak.dto.request.GetNameUpperCaseRequestDto;
import com.yasinsolak.exceptions.ErrorType;
import com.yasinsolak.exceptions.Java8StartException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personel-departman")
@RequiredArgsConstructor
public class PersonelDepartmanController {

    @PostMapping("/getname")
    public ResponseEntity<String> getNameUpperCase(@RequestBody GetNameUpperCaseRequestDto dto){
        if(dto.getName()==null){
            throw new Java8StartException(ErrorType.NAME_IS_NULL);
        }
        String nameUpper = dto.getName().toUpperCase();
        return ResponseEntity.ok(nameUpper);
    }
}
