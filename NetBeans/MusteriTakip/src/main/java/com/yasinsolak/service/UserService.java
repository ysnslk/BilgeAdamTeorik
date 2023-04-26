package com.yasinsolak.service;

import com.yasinsolak.entity.User;
import com.yasinsolak.repository.UserRepository;
import com.yasinsolak.utilty.MyFactoryRepository;
import com.yasinsolak.utilty.MyFactoryService;
import java.util.List;
import java.util.Optional;

public class UserService extends MyFactoryService<User, UserRepository> {

    public UserService() {
        super(new UserRepository());
    }

    public boolean isUser(String username, String password) {
        return repository.isUser(username, password);
    }

}
