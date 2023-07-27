package com.sosyalmedya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/auth")
    public ResponseEntity<String> fallbackAuth(){
        return ResponseEntity.ok("Auth Servis Bulunamadı. Lütfem daha sonra tekrar deneyim.");
    }
    @GetMapping("/post")
    public ResponseEntity<String> fallbackPost(){
        return ResponseEntity.ok("Post Servis Bulunamadı. Lütfem daha sonra tekrar deneyim.");
    }
    @GetMapping("/user")
    public ResponseEntity<String> fallbackUser(){
        return ResponseEntity.ok("User Servis Bulunamadı. Lütfem daha sonra tekrar deneyim.");
    }

}
