package com.yasinsolak.services;

import com.yasinsolak.dto.request.SavePersonelRequestDto;
import com.yasinsolak.mapper.IPersonelMapper;
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

    public Boolean saveFromDto(SavePersonelRequestDto dto){
        Personel personel = IPersonelMapper.INSTANCE.personelFromDto(dto);
        repository.save(personel);
        return true;
    }
}
