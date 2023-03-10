package com.yasinsolak;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SporMerkeziUye {

	private int uyeNo;
	private String adSoyad;
	private int agirlik;
	private int toplamHarcananKalori;
	private SporHesaplayici sporHesaplayici;
	private List<SporKayit> sporKayitListesi;

	public SporMerkeziUye(int uyeNo, String adSoyad, int agirlik) {
		super();
		this.uyeNo = uyeNo;
		this.adSoyad = adSoyad;
		this.agirlik = agirlik;
		this.sporHesaplayici = new SporHesaplayici(agirlik);
		this.sporKayitListesi = new ArrayList<SporKayit>();
	}
	
	public void sporYap(String yapilacakHareket, int kacDakikaYapildi) {
		
		int harcananKalori = this.sporHesaplayici.sporYap(yapilacakHareket,kacDakikaYapildi);
		toplamHarcananKalori += harcananKalori;
		System.out.println(kacDakikaYapildi+" Dakikalık "+yapilacakHareket+ " spor hareketi sonucu yakılan kalori : "+harcananKalori);
		SporKayit sporKayit = new SporKayit(yapilacakHareket,harcananKalori,LocalDate.now(),LocalTime.now());
		sporKayitListesi.add(sporKayit);
	}
	
	public void tumSportKayitlariniGoster() {
		System.out.println("* * * * * * * * * * * * * * * * ");
		System.out.println();
		System.out.println("Üye no :"+this.uyeNo+" Ad Soyad : "+this.adSoyad+ " Ağırlık : "+this.agirlik);
		for (SporKayit sk : sporKayitListesi) {
			System.out.println(sk);
		}
		System.out.println("\n Toplam Harcanan Kalori : "+this.toplamHarcananKalori+"\n");
	}

	public int getUyeNo() {
		return uyeNo;
	}

	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}

	public int getToplamHarcananKalori() {
		return toplamHarcananKalori;
	}

	public void setToplamHarcananKalori(int toplamHarcananKalori) {
		this.toplamHarcananKalori = toplamHarcananKalori;
	}

	public SporHesaplayici getSporHesaplayici() {
		return sporHesaplayici;
	}

	public void setSporHesaplayici(SporHesaplayici sporHesaplayici) {
		this.sporHesaplayici = sporHesaplayici;
	}

	@Override
	public String toString() {
		return "SporMerkeziUye [uyeNo=" + uyeNo + ", adSoyad=" + adSoyad + ", agirlik=" + agirlik
				+ ", toplamHarcananKalori=" + toplamHarcananKalori + ", sporHesaplayici=" + sporHesaplayici + "]";
	}
	
	

}
