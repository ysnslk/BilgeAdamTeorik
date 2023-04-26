package com.yasinsolak.service;

import com.yasinsolak.entity.Musteri;
import com.yasinsolak.repository.MusteriRepository;
import com.yasinsolak.utilty.MyFactoryRepository;
import com.yasinsolak.utilty.MyFactoryService;
import java.util.List;
import java.util.Optional;

public class MusteriService extends MyFactoryService<Musteri, MyFactoryRepository> {

    public MusteriService() {
        super(new MusteriRepository());
    }

}
