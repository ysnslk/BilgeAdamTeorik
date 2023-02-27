package com.yasinsolak;

public class Serce extends Hayvan implements IUcabilir {

	public Serce(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	@Override
	public void sesCikar() {
		System.out.println("Cik");
	}

	@Override
	public void yemekYe() {
		System.out.println("Serçe " + this.getAd() + " yem yiyor..");
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adlı serçe saniyede 8 kez kanat çırpıyor");

	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı serçe kanatlarını hızlıca temizliyor.");

	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı serçe küçük gagasıyla " + nesne + " gagalıyor");

	}

}
