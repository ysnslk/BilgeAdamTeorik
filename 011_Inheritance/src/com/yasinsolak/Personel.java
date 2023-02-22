package com.yasinsolak;

public class Personel{

	// Üst Sınıf / Ata Sınıf / Parent Sınıf
	private String ad;
	private String soyad;
	private String tckimlik;
	private String yas;
	private String maas;
	private int kidemBilgisi;
	private long cepTelNo;
	
	//Constructor : Yapıcı Metod
	public Personel() {
		System.out.println("Personel Sınıfının 1 nolu constructorı çağırıldı.");
		
	}
	public Personel(String s, int y) {
		System.out.println("Personel Sınıfının 2 nolu constructorı çağırıldı.");
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTckimlik() {
		return tckimlik;
	}

	public void setTckimlik(String tckimlik) {
		this.tckimlik = tckimlik;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getMaas() {
		return maas;
	}

	public void setMaas(String maas) {
		this.maas = maas;
	}

	public int getKidemBilgisi() {
		return kidemBilgisi;
	}

	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}

	public long getCepTelNo() {
		return cepTelNo;
	}

	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}

}
