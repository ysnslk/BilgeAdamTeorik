package com.yasinsolak.di06;

public class MyFramework {
    private static MyFramework instance;
    public static MyFramework getInstance(){
        if(instance == null){
            instance = new MyFramework();
        }
        return instance;
    }

    public IPrinter getPrinterInstance(String printerClassName, String providerClassName){
        IPrinter printer = null;
        try{
            IProvider provider = (IProvider) Class.forName(providerClassName).getDeclaredConstructor().newInstance();
            printer = (IPrinter) Class.forName(printerClassName).getDeclaredConstructor().newInstance();
            printer.setProvider(provider);
        }catch (Exception exception){
            System.out.println("Beklenmeyen Hata....: "+exception.getMessage());
        }
        return printer;
    }
}
