package com.yasinsolak.service;

import com.yasinsolak.entity.Musteri;
import com.yasinsolak.repository.MusteriRepositoryImpl;
import java.util.List;

public class MusteriService implements IServiceManager<Musteri> {

    private MusteriRepositoryImpl repository;

    public MusteriService() {
        repository = new MusteriRepositoryImpl();
    }

    @Override
    public void save(Musteri t) {
        repository.save(t);
    }

    @Override
    public void update(Musteri t) {
        repository.update(t);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public List<Musteri> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Musteri> findByAd(String ad) {
        return repository.findByAd(ad);
    }

    @Override
    public Musteri findById(Long id) {
       return  repository.findById(id);
    }

}
