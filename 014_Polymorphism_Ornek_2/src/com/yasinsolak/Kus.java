package com.yasinsolak;

public class Kus extends Hayvan {
	
	public void sesCikar() {
		System.out.println("Cik Cik");
	}

	public Kus(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	@Override
	public String toString() {
		return "Kus [getAd()=" + getAd() + ", getKilo()=" + getKilo() + ", getUzunluk()=" + getUzunluk() + "]";
	}
	
	

}
