/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yasinsolak.repository;

import com.yasinsolak.entity.Kullanici;
import com.yasinsolak.utility.MyFactoryRepository;

/**
 *
 * @author xmeny
 */
public class KullaniciRepository extends MyFactoryRepository<Kullanici, Long>{
    
    public KullaniciRepository(){
        super (new Kullanici());
    }
    
}
