package com.yasinsolak.service;

import com.yasinsolak.entity.User;
import com.yasinsolak.repository.UserRepositoryImpl;
import java.util.List;

public class UserService implements IServiceManager<User> {

    private UserRepositoryImpl repository;

    public UserService() {
        repository = new UserRepositoryImpl();
    }

    @Override
    public void save(User t) {
        repository.save(t);
    }

    @Override
    public void update(User t) {
        repository.update();
    }

    @Override
    public void delete(Long id) {
        
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findByAd(String ad) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    public boolean isUser(String username, String password) {
        return repository.isUser(username, password);
    }

}
