package com.yasinsolak.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    INTERNAL_SERVER_ERROR(1000,"Sunucuda bilinmeyen bir hata oluştu.",HttpStatus.BAD_REQUEST),
    NAME_IS_NULL(1001,"Name alanı boş geçilmez.",HttpStatus.BAD_REQUEST),
    ID_NOT_FOUND(1001,"Aradığınız id ye ait kayıt bulunamamıştır.",HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(1002,"Geçersiz token ",HttpStatus.BAD_REQUEST);

    int code;
    String message;
    HttpStatus httpStatus;
}
