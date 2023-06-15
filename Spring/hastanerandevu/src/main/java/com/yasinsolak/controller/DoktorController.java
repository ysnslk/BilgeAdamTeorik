package com.yasinsolak.controller;

import static com.yasinsolak.constants.RestApiList.*;

import com.yasinsolak.dto.request.DoktorSaveRequestDto;
import com.yasinsolak.dto.response.DoktorResponseDto;
import com.yasinsolak.repository.entity.Doktor;
import com.yasinsolak.repository.view.VwDoktor;
import com.yasinsolak.service.DoktorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorService doktorService;

    @Value("${myapplication.name}")
    private String uygulamaAdi;

    @GetMapping("/uygulamaadi")
    public String getActiveApplicationFile(){
        return uygulamaAdi;
    }
    @PostMapping(SAVE)
    public Doktor save(@RequestBody @Valid DoktorSaveRequestDto dto){
        return doktorService.save(dto);
    }
    @GetMapping(FINDBYAD)
    public List<Doktor> findByAd(String ad){
        return doktorService.findByAd(ad);
    }

    /**
     * Ödev doktorların bilgilerini RESPONSE DTO ve VIEW olarak
     * dönüş yapan 2 method yazınız.
     * 1. method da doktorları çekip DTO ya dönüştürülüp listeleyiniz.
     * 2. direkt DB den alınan kayıtları View olarak alıp dönüş yapınız.
     */

    public List<DoktorResponseDto> findAllReponse(){
        return null;
    }

    public List<VwDoktor> findAllView(){
        return null;
    }

    @GetMapping(FINDALL)
    public List<Doktor> findAll(){
        return doktorService.findAll();
    }
}
