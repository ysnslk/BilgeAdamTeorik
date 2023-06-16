package com.yasinsolak.controllermvc;

import com.yasinsolak.model.ModelDoktorDetay;
import com.yasinsolak.model.ModelDoktorSearch;
import com.yasinsolak.repository.entity.Doktor;
import com.yasinsolak.service.DoktorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/doktor")
@RequiredArgsConstructor
public class DoktorMvcController {

    private final DoktorService doktorService;

    @GetMapping("/search")
    public ModelAndView search(){
        ModelAndView md = new ModelAndView("doktor/search");
        ModelDoktorSearch model = ModelDoktorSearch.builder()
                .doktorList(doktorService.findAll())
                .build();
        md.addObject("model",model);
        return md;
    }

    @GetMapping("/searchByKey")
    public ModelAndView searchByKey(String key){
        ModelAndView md = new ModelAndView("doktor/search");
        ModelDoktorSearch model = ModelDoktorSearch.builder()
                .doktorList(doktorService.findByAd(key))
                .build();
        md.addObject("model",model);
        return md;
    }
    @GetMapping("/detay")
    public ModelAndView detay(Long id){
        ModelAndView md = new ModelAndView("/doktor/detay");
        Optional<Doktor> doktor = doktorService.findById(id);
        ModelDoktorDetay model = ModelDoktorDetay.builder()
                .doktor(doktor.get())
                .build();
        md.addObject("model",model);
        return md;
    }
}
