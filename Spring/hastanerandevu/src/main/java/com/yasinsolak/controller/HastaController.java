package com.yasinsolak.controller;

import static com.yasinsolak.constants.RestApiList.*;

import com.yasinsolak.dto.request.HastaSaveRequestDto;
import com.yasinsolak.repository.entity.Hasta;
import com.yasinsolak.service.HastaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(HASTA)
@RequiredArgsConstructor
public class HastaController {
    private final HastaService hastaService;

    @PostMapping(SAVE)
    public Hasta save(@RequestBody @Valid HastaSaveRequestDto dto){
        return hastaService.save(dto);
    }
    @GetMapping(FINDALL)
    public List<Hasta> findAll(){
       return hastaService.findAll();
    }
}
