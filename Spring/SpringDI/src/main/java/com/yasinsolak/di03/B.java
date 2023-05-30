package com.yasinsolak.di03;

public class B {

    A a ;

    public  B(){
        a = new A();

    }

@Deprecated
    public void print(){
        System.out.println(a.getMessage());
    }

    public void printErr(){
        System.out.println(a.getErrorMessage());
    }
}
