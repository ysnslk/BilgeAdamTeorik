package com.yasinsolak.services;

import com.yasinsolak.repository.IPersonelRepository;
import com.yasinsolak.repository.entity.Personel;
import com.yasinsolak.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PersonelService extends ServiceManager<Personel,Long> {
    private final IPersonelRepository repository;

    public PersonelService(IPersonelRepository repository){
        super(repository);
        this.repository = repository;
    }
}
