package com.yasinsolak.service;

import com.yasinsolak.entity.Kullanici;
import com.yasinsolak.repository.KullaniciRepository;
import com.yasinsolak.utility.MyFactoryService;

public class KullaniciService extends MyFactoryService<KullaniciRepository, Kullanici, Long>{
    
    public KullaniciService(){
        super( new KullaniciRepository());
    }
}
