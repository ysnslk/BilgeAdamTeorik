package com.yasinsolak.service;

import com.yasinsolak.dto.request.HastaSaveRequestDto;
import com.yasinsolak.mapper.IHastaMapper;
import com.yasinsolak.repository.IHastaRepository;
import com.yasinsolak.repository.entity.Hasta;
import com.yasinsolak.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HastaService extends ServiceManager<Hasta,Long> {
    private final IHastaRepository repository;
    public HastaService(IHastaRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Hasta save(HastaSaveRequestDto dto){
       Hasta hasta = IHastaMapper.INSTANCE.fromSaveDto(dto);
       return save(hasta);
    }
}
