package com.yasinsolak.service;

import com.yasinsolak.dto.request.BransSaveRequestDto;
import com.yasinsolak.exceptions.ErrorType;
import com.yasinsolak.exceptions.HastaneRandevuException;
import com.yasinsolak.repository.IBransRepository;
import com.yasinsolak.repository.entity.Brans;
import com.yasinsolak.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BransService extends ServiceManager<Brans,Long> {
    private final IBransRepository repository;
    public BransService(IBransRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Brans save(BransSaveRequestDto dto){
        /**
         * Dikkat!!! eğer aynı isimde bir brans varsa kayıt önce kontrol edilmeli
         * sonra kayıt yapılmalıdır.
         * "dahiliye" - "Dahiliye" - "DAHİLİYE" + "    dahiliye"
         */
        String bransAdi = dto.getAd().trim();
        /**
         * 1. Yöntem
         * Optional<Brans> optionalBrans = repository.findOptionalByAdIgnoreCase(bransAdi);
         *         if (optionalBrans.isEmpty()){
         *             //Burada kayıt yapılmalı
         *             ;
         *         }else{
         *             //Burada hata döndürülmeli
         *             ;
         *         }
         *
         *  2.Yöntem
         *  repository.findOptionalByAdIgnoreCase(bransAdi)
         *             .ifPresentOrElse(
         *                     brans -> {
         *                         throw new RuntimeException("Bu isimde bir branş var");
         *                     },
         *                     () ->{
         *                         Brans brans = Brans.builder().ad(bransAdi).build();
         *                     }
         *             );
         */
        Optional<Brans> optionalBrans = repository.findOptionalByAdIgnoreCase(bransAdi);
        if (optionalBrans.isPresent()) //Eğer böyle bir kayıt var ise burada akışı bitir.
            throw new HastaneRandevuException(ErrorType.BRANS_ZATEN_KAYITLI);

        return repository.save(Brans.builder().ad(bransAdi).build());


    }
}
