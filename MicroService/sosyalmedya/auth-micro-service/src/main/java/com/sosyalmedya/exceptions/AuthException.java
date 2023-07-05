package com.sosyalmedya.exceptions;

import lombok.Getter;

/**
 * Bu kısımda uygulamanız içinde oluşabilecek tüm hataları kapsayan bir kapsayıcıya ihtiyacınız var,
 * yani hata tiplerinin listesini içeren bir Enum sınıfı oluşturabilirsiniz.
 * Ayrıca, uygulamamız retsApi kurgusunda olduğu için bu hataların ResponseBodyşeklinde bir entity
 * olarak dönmek doğru olacaktır. Bu nedenle bir ReturnType Response Entity oluşturmak için doğru yaklaşımdır.
 */
@Getter
public class AuthException extends RuntimeException{

    private final ErrorType errorType;
    public AuthException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
    public AuthException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
