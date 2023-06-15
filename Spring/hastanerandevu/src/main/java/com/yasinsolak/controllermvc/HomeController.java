package com.yasinsolak.controllermvc;

import com.yasinsolak.model.ModelHome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        ModelHome model = ModelHome.builder()
                .content("lorem ipsum dolot sit amet")
                .title("Hastane Randevu Sistemi")
                .urunList(Arrays.asList("Ürün 1","Ürün 2","Ürün 3","Ürün 4"))
                .build();
        modelAndView.addObject("model",model);
        return modelAndView;
    }
}
