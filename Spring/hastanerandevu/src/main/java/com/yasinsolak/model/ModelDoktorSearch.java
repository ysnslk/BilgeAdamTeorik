package com.yasinsolak.model;

import com.yasinsolak.repository.entity.Doktor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelDoktorSearch {

    List<Doktor> doktorList;
}
