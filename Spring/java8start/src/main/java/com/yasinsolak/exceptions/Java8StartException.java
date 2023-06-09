package com.yasinsolak.exceptions;

import lombok.Getter;

/**
 * Bu kısımda uygulamanız içinde oluşabilecek tüm hataları kapsayan bir kapsayıcıya ihtiyacınız var,
 * yani hata tiplerinin listesini içeren bir Enum sınıfı oluşturabilirsiniz.
 * Ayrıca, uygulamamız retsApi kurgusunda olduğu için bu hataların ResponseBodyşeklinde bir entity
 * olarak dönmek doğru olacaktır. Bu nedenle bir ReturnType Response Entity oluşturmak için doğru yaklaşımdır.
 */
@Getter
public class Java8StartException extends RuntimeException{

    private final ErrorType errorType;
    public Java8StartException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
    public Java8StartException(ErrorType errorType,String message){
        super(message);
        this.errorType = errorType;
    }
}
