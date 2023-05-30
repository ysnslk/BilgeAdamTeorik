
package com.yasinsolak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "tbl_musteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String adres;
    private String telefon;
    private String avatar;
    private String cinsiyet;
    private int state;

    public Musteri() {
    }

    public Musteri(Long id, String ad, String adres, String telefon, String avatar, int state) {
        this.id = id;
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.avatar = avatar;
        this.state = state;
    }

    public Musteri(String ad, String adres, String telefon, String avatar, int state,String cinsiyet) {
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.avatar = avatar;
        this.state = state;
        this.cinsiyet = cinsiyet;
    }

    public Musteri(Long id, String ad, String adres, String telefon, String avatar, String cinsiyet, int state) {
        this.id = id;
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.avatar = avatar;
        this.cinsiyet = cinsiyet;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Musteri{" + "id=" + id + ", ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + ", avatar=" + avatar + ", state=" + state + '}';
    }
    
    
}
