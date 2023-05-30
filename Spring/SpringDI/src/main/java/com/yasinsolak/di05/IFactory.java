package com.yasinsolak.di05;

import com.yasinsolak.di05.IPrinter;
import com.yasinsolak.di05.IProvider;

public interface IFactory {

    IProvider getProvider();
    IPrinter getPrinter();
}
