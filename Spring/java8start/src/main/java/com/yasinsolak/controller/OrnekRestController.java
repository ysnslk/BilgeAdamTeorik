package com.yasinsolak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrnekRestController {
    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Merhaba Dünya");
    }
}
