package com.yasinsolak.services;

import com.yasinsolak.repository.IPersonelDepartmanRepository;
import com.yasinsolak.repository.entity.PersonelDepartman;
import com.yasinsolak.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonelDepartmanService extends ServiceManager<PersonelDepartman,Long> {

    private final IPersonelDepartmanRepository repository;
    public PersonelDepartmanService(IPersonelDepartmanRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<PersonelDepartman> findByDepartmanid(Long id){
        return repository.findByDepartmanid(id);
    }
}
