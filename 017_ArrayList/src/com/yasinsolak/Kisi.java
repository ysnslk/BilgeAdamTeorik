package com.yasinsolak;

//POJO Sınıfıda denir. : Plain OldJava Object
public class Kisi {
	private String ad;
	private String soyad;
	private String tckimlik;
	private int yas;
	private int maas;

	public Kisi() {

	}

	public Kisi(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}

	public Kisi(String ad, String soyad, String tckimlik, int yas, int maas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tckimlik = tckimlik;
		this.yas = yas;
		this.maas = maas;
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

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", soyad=" + soyad + ", tckimlik=" + tckimlik + ", yas=" + yas + ", maas=" + maas
				+ "]";
	}

}
