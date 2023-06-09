package com.yasinsolak.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoktorSaveRequestDto {
    @NotEmpty
    String ad;
    @NotEmpty
    String adres;
    @NotEmpty
    String telefon;
    @NotNull
    Long bransid;
    String unvan;
}
