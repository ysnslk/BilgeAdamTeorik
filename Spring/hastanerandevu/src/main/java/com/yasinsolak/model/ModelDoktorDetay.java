package com.yasinsolak.model;

import com.yasinsolak.repository.entity.Doktor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelDoktorDetay {

    private Doktor doktor;
}
