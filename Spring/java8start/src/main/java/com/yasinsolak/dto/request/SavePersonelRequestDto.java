package com.yasinsolak.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavePersonelRequestDto {
    String ad;
    String adres;
    String telefon;
}
