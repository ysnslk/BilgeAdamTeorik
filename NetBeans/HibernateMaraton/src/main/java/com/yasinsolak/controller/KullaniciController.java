package com.yasinsolak.controller;

import com.yasinsolak.app.BAUtils;
import com.yasinsolak.entity.Kullanici;
import com.yasinsolak.service.KullaniciService;

public class KullaniciController {
    
    private KullaniciService kullaniciService;
    
    public KullaniciController(){
        this.kullaniciService = new KullaniciService();
    }
    
    public void kullaniciKaydet(){
        String kullaniciAdi = BAUtils.readString("Kullanıcı Adınızı Giriniz : ");
        String sifre = BAUtils.readString("Şifrenizi Giriniz");
        Kullanici kullanici = new Kullanici(kullaniciAdi, sifre);
        kullaniciService.save(kullanici);
    }
}
