package com.yasinsolak.controller;

import com.yasinsolak.repository.entity.Departman;
import com.yasinsolak.services.DepartmanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller katmanında 2 kullanım şeklimiz var we için
 * 1- @Controller annatation i ile MVC odaklı programlama
 * 2- @RestController annatation i ile Restful web servisler
 */
@RestController
/**
 * http://localhost:9090/departman
 */
@RequestMapping("/departman")
public class DepartmanController {

    private final DepartmanService departmanService;
    public DepartmanController(DepartmanService departmanService){
        this.departmanService = departmanService;
    }
    /**
     * GetMapping -> isteği get türünde olduğunu belirtir. Sadece get isteklerini karşılar.
     * http://localhost:9090/departman/getall
     * @return
     */
    @GetMapping("/getall")
    public List<Departman> getAll(){
       return departmanService.findAll();
    }

    /**
     * http://localhost:9090/departman/save?ad=IT&konum=Istanbul
     * @param ad
     * @param konum
     */

    @GetMapping("/save")
    public void save(String ad, String konum){
        Departman departman = Departman.builder().ad(ad).konum(konum).build();
        departmanService.save(departman);
    }
    @GetMapping("/delete")
    public void delete(Long id){
        departmanService.delete(id);
    }
    @GetMapping("/findbykonum")
    public List<Departman> findByKonum(String ad){
        return departmanService.findAllKonumAdi(ad);
    }
}
