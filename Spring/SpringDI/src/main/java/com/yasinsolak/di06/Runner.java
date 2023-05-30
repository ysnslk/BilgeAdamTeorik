package com.yasinsolak.di06;

import com.yasinsolak.springFW.IPrinter;
import com.yasinsolak.springFW.MyFramework;

public class Runner {
    public static void main(String[] args) {
        IPrinter printer = MyFramework.getInstance()
                .getPrinterInstance("com.yasinsolak.di06.ErrorPrinter",
                        "com.yasinsolak.di06.MessageProviderTR");

        printer.print();
    }
}
