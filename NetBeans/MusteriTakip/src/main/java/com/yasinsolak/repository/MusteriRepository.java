package com.yasinsolak.repository;

import com.yasinsolak.entity.Musteri;
import com.yasinsolak.utilty.MyFactoryRepository;

public class MusteriRepository extends MyFactoryRepository<Musteri, Long> {

    
    public MusteriRepository() {
        super(new Musteri());
    }
}
