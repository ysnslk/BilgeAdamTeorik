package com.yasinsolak.service;

import com.yasinsolak.dto.request.DoktorSaveRequestDto;
import com.yasinsolak.mapper.IDoktorMapper;
import com.yasinsolak.repository.IDoktorRepository;
import com.yasinsolak.repository.entity.Doktor;
import com.yasinsolak.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorService extends ServiceManager<Doktor,Long> {
    private final IDoktorRepository repository;
    public DoktorService(IDoktorRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Doktor save(DoktorSaveRequestDto dto){
        /**
         * Dikkat burada ek neler yapılabilir?
         * 1- Doktorların özel oaln bilgileri kontrol edilerek mükerre kayıt yapılmasının önüne geçilebilir.
         * 2- bransid benzersiz ve tutarlı olduğu için kontrol edilebilir. bransid yok ise kayıt islemi
         * hata fırlatabilir.
         */
        Doktor doktor = IDoktorMapper.INSTANCE.fromSaveDto(dto);
        return repository.save(doktor);
    }

    public List<Doktor> findByAd(String ad) {
        return repository.findAllByAdContaining(ad);
    }
}
