package com.sosyalmedya.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoLoginResponseDto {
    /**
     * 200 - Başarılı
     * 400 - Hatalı istek
     */
    Integer status;
    String result;
    String token; //JWT Token
}
