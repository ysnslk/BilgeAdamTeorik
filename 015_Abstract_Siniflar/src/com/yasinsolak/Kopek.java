package com.yasinsolak;

public class Kopek extends Hayvan {

	public void sesCikar() {
		System.out.println("Hav Hav");
	}

	public Kopek(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	@Override
	public String toString() {
		return "Kopek [getAd()=" + getAd() + ", getKilo()=" + getKilo() + ", getUzunluk()=" + getUzunluk() + "]";
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek kemik yiyor.");
		
	}
	
	

}
