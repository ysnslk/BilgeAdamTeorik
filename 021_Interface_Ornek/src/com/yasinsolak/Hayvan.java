package com.yasinsolak;

public abstract class Hayvan {

	private String ad;
	private int kilo;
	private int uzunluk;

	public Hayvan() {

	}

	public Hayvan(String ad, int kilo, int uzunluk) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
	}

	// Abstract metodlar implementasyon içermez. Sadece metod tanımı yapılır.
	// Abstrac yapılan metodlar mutlaka alt sınıflarda implement edilmeli. /
	// Override etme.
	// Bilgi : Abstract metodlar yalnızca abstract sınıflarda yazılabilir.
	public abstract void sesCikar();

	public abstract void yemekYe();

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
