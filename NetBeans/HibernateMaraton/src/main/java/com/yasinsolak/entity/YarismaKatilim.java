package com.yasinsolak.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "yarismakatilim")
public class YarismaKatilim {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "yarisma")
     @JoinColumn(name = "yarisma_id",referencedColumnName = "id")
    private Yarisma yarisma;
    private List<Kullanici> kullanici;
    private Date katilim_tarihi;

    public YarismaKatilim(Long id, Yarisma yarisma, List<Kullanici> kullanici, Date katilim_tarihi) {
        this.id = id;
        this.yarisma = yarisma;
        this.kullanici = kullanici;
        this.katilim_tarihi = katilim_tarihi;
    }

    public YarismaKatilim(Yarisma yarisma, List<Kullanici> kullanici, Date katilim_tarihi) {
        this.yarisma = yarisma;
        this.kullanici = kullanici;
        this.katilim_tarihi = katilim_tarihi;
    }

    public YarismaKatilim() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public List<Kullanici> getKullanici() {
        return kullanici;
    }

    public void setKullanici(List<Kullanici> kullanici) {
        this.kullanici = kullanici;
    }

    public Date getKatilim_tarihi() {
        return katilim_tarihi;
    }

    public void setKatilim_tarihi(Date katilim_tarihi) {
        this.katilim_tarihi = katilim_tarihi;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" + "id=" + id + ", yarisma=" + yarisma + ", kullanici=" + kullanici + ", katilim_tarihi=" + katilim_tarihi + '}';
    }
    
    
}
