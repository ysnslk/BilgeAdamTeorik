package com.yasinsolak;

public class Guvercin extends Hayvan implements IUcabilir {

	public Guvercin(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	@Override
	public void sesCikar() {
		System.out.println("Cik");
	}

	@Override
	public void yemekYe() {
		System.out.println("Güvercin " + this.getAd() + " yem yiyor..");
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adlı güvercin saniyede 5 kez kanat çırpıyor");

	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı güvercin kanatlarını yavaşça temizliyor.");

	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı güvercin uzun gagasıyla " + nesne + " gagalıyor");

	}

}
