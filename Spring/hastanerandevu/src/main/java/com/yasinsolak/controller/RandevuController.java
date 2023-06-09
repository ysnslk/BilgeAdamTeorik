package com.yasinsolak.controller;

import static com.yasinsolak.constants.RestApiList.*;

import com.yasinsolak.dto.request.RandevuSaveRequestDto;
import com.yasinsolak.repository.entity.Randevu;
import com.yasinsolak.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yasinsolak.constants.RestApiList.*;
@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;

    @PostMapping(SAVE)
    public Randevu save(@RequestBody @Valid RandevuSaveRequestDto dto){
        return randevuService.save(dto);
    }
}
