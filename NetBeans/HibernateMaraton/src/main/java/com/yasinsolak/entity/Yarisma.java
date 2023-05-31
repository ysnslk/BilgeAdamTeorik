package com.yasinsolak.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "yarisma")
public class Yarisma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String yarisma_ad;
    private String odul;
    private Date baslangic_tarihi;
     private Date bitis_tarihi;
     @ManyToOne
    @JoinColumn(name="olusturan_id",referencedColumnName = "id")
     private Kullanici kullanici;
     private int maxKatilim;

    public Yarisma(Long id, String yarisma_ad, String odul, Date baslangic_tarihi, Date bitis_tarihi, Kullanici kullanici, int maxKatilim) {
        this.id = id;
        this.yarisma_ad = yarisma_ad;
        this.odul = odul;
        this.baslangic_tarihi = baslangic_tarihi;
        this.bitis_tarihi = bitis_tarihi;
        this.kullanici = kullanici;
        this.maxKatilim = maxKatilim;
    }

    public Yarisma(String yarisma_ad, String odul, Date baslangic_tarihi, Date bitis_tarihi, Kullanici kullanici, int maxKatilim) {
        this.yarisma_ad = yarisma_ad;
        this.odul = odul;
        this.baslangic_tarihi = baslangic_tarihi;
        this.bitis_tarihi = bitis_tarihi;
        this.kullanici = kullanici;
        this.maxKatilim = maxKatilim;
    }

    public Yarisma() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYarisma_ad() {
        return yarisma_ad;
    }

    public void setYarisma_ad(String yarisma_ad) {
        this.yarisma_ad = yarisma_ad;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public Date getBaslangic_tarihi() {
        return baslangic_tarihi;
    }

    public void setBaslangic_tarihi(Date baslangic_tarihi) {
        this.baslangic_tarihi = baslangic_tarihi;
    }

    public Date getBitis_tarihi() {
        return bitis_tarihi;
    }

    public void setBitis_tarihi(Date bitis_tarihi) {
        this.bitis_tarihi = bitis_tarihi;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public int getMaxKatilim() {
        return maxKatilim;
    }

    public void setMaxKatilim(int maxKatilim) {
        this.maxKatilim = maxKatilim;
    }

    @Override
    public String toString() {
        return "Yarisma{" + "id=" + id + ", yarisma_ad=" + yarisma_ad + ", odul=" + odul + ", baslangic_tarihi=" + baslangic_tarihi + ", bitis_tarihi=" + bitis_tarihi + ", kullanici=" + kullanici + ", maxKatilim=" + maxKatilim + '}';
    }
     
     
}
