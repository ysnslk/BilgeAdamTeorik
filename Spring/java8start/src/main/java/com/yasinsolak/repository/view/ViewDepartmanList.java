package com.yasinsolak.repository.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class ViewDepartmanList {
    Long id;
    String ad;

    public ViewDepartmanList(Long id,String ad){
        this.id = id;
        this.ad = ad;
    }
}
