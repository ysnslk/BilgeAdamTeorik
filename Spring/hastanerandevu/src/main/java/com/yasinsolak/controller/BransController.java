package com.yasinsolak.controller;

import static com.yasinsolak.constants.RestApiList.*;

import com.yasinsolak.dto.request.BransSaveRequestDto;
import com.yasinsolak.repository.entity.Brans;
import com.yasinsolak.service.BransService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(BRANS)
@RequiredArgsConstructor
public class BransController {
    private final BransService bransService;

    @PostMapping(SAVE)
    public Brans save(@RequestBody @Valid BransSaveRequestDto dto){
        return bransService.save(dto);
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Brans>> findAll(){
        return ResponseEntity.ok(bransService.findAll());
    }
}
