package com.yasinsolak.service;

import com.yasinsolak.dto.request.RandevuSaveRequestDto;
import com.yasinsolak.exceptions.ErrorType;
import com.yasinsolak.exceptions.HastaneRandevuException;
import com.yasinsolak.repository.IDoktorRepository;
import com.yasinsolak.repository.IRandevuRepository;
import com.yasinsolak.repository.entity.Randevu;
import com.yasinsolak.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RandevuService extends ServiceManager<Randevu,Long> {
    private final IRandevuRepository repository;
    private final  DoktorService doktorService;
    private final  HastaService hastaService;
    /**
     * TODO: Bir servisin içinde başka bir servisi kullanmak doğru mudur?
     * çağırım yapacağınız servis içinde özelleştirilmiş methodlar ve işlemler olabilir.
     * Bu özel methodlar datayı manüple ederken farklı işlemler yapılabilir.İşlemleri
     * soyutlama nedeniyle ilgili serviste yapılan işlemleri bilemeyeceğimiz için
     * direkt Repository e erişmek sakıncalı olacaktır.
     *
     * TODO: Ancak servisler bir birilerine çağırarak loop yaratmamalıdır.
     */
   // private final IDoktorRepository doktorRepository;
    public RandevuService(IRandevuRepository repository,DoktorService doktorService,HastaService hastaService){
        super(repository);
        this.repository = repository;
        this.doktorService = doktorService;
        this.hastaService = hastaService;
    }

    public Randevu save(RandevuSaveRequestDto dto){
        /**
         * TODO: Doktor id kontrol edelim yok ise hata döndürelim
         * TODO: Hasta id kontrol edelim yok ise hata döndürelim
         * TODO: Tarih kontrol edelim mevcut zamandanönce ise hata döndürelim
         */
        if(doktorService.findById(dto.getDoktorid()).isEmpty())
            throw new HastaneRandevuException(ErrorType.DOKTOR_BULUNAMADI);
        else if(hastaService.findById(dto.getHastaid()).isEmpty())
            throw new HastaneRandevuException(ErrorType.HASTA_BULUNAMADI);
        /**
         * TODO: ÖDEV Randevu tarihleri Long olarak geldiği için kontrol edilmesi kolay olacaktır.
         * anca eğer tarihler şöyle iletilirse idi nasıl yapılabilirdi?
         * Yıl,Ay,Gün,Saat,Dakika ????????
         */
        return null;
    }
}
