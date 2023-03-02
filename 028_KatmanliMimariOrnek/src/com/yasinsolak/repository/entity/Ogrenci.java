package com.yasinsolak.repository.entity;

public class Ogrenci {
	private String ad;
	private String soyad;
	private int id;

	public Ogrenci(String ad, String soyad, int id) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyad=" + soyad + ", id=" + id + "]";
	}

}
