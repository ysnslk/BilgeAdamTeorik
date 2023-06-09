package com.yasinsolak.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yasinsolak.exceptions.ErrorType.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> hatalariYakalayanBenim(Exception ex){
       return new ResponseEntity<>(createErrorMessage(ex, ErrorType.INTERNAL_SERVER_ERROR),HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Java8StartException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> Java8StartExceptionHandler(Java8StartException ex){
        return new ResponseEntity<>(createErrorMessage(ex,ex.getErrorType()),ex.getErrorType().getHttpStatus());
    }

    /**
     * Tüm hatalar belli bir method üzerinde geçtiği için ek kodlamalar yapmadan tek bir yerden oluşan hataların
     * loglanması ve veritabanına kayıt edilmesini kolaylaştırır.
     * @param ex
     * @param errorType
     * @return
     */
    private ErrorMessage createErrorMessage(Exception ex,ErrorType errorType){
        System.out.println("Hata Oluştu....:"+
                System.currentTimeMillis()+" - "+ex.toString()
                );

        return ErrorMessage.builder()
                .message(errorType.getMessage())
                .code(errorType.getCode())
                .build();
    }

}
