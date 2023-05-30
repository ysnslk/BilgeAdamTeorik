package com.yasinsolak.di03;

public class A {
    private String message = "Güncellenecek";

    /**
     * 3. sürümden sonra bu metod devredışı kalacak. Yeni kullanımlarına bakınız
     * getStandartMessage, getErrorMessage
     * @return
     */
    @Deprecated
    public String getMessage(){
        return message;
    }

    public String getStandartMessage(){
        return "Standart " + message;
    }

    public String getErrorMessage(){
        return "Error " + message;
    }
}
