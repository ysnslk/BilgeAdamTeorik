package com.yasinsolak.service;

import com.yasinsolak.entity.User;
import java.util.List;

public interface IServiceManager<T> {

    void save(T t);

    void update(T t);

    void delete(Long id);

    List<T> findAll();

    List<T> findByAd(String ad);

    T findById(Long id);
}
