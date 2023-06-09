package com.yasinsolak.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RandevuSaveRequestDto {
    @NotNull
    Long doktorid;
    @NotNull
    Long hastaid;
    @NotNull
    Long tarih;
    @NotNull
    Long zaman;
    Integer gun;
    Integer ay;
    Integer yil;
    Integer saat;
    Integer dakika;

}
