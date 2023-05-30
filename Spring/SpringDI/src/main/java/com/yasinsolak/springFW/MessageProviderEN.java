package com.yasinsolak.springFW;

public class MessageProviderEN implements IProvider {
    @Override
    public String getMessage() {
        return "I'm sending message in Turkish";
    }
}
