package com.yasinsolak.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoktorResponseDto {
    Long id;
    String ad;
    Long bransid;
    String bransad;
}
