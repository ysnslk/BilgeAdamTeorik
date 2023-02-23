package com.yasinsolak;

public class Hayvan {

	private String ad;
	private int kilo;
	private int uzunluk;
	
	
	
	public Hayvan(String ad, int kilo, int uzunluk) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
	}

	public void sesCikar() {
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + "]";
	}

}
