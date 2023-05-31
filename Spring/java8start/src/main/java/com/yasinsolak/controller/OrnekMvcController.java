package com.yasinsolak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class OrnekMvcController {

    @RequestMapping("/home")
    public ModelAndView getHome(){
        return new ModelAndView("home");
    }
}
