package com.yasinsolak.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tblrandevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long doktorid;
    Long hastaid;
    Long tarih;
    Long zaman;
    /**
     * 0: Beklemede
     * 1: Onaylandı
     * 2: Reddedildi
     * 3: İptal Edildi
     * 4: Tamamlandı
     */
    Long durum;
}
