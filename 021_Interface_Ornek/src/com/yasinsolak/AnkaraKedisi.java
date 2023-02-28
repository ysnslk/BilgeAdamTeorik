package com.yasinsolak;

public class AnkaraKedisi extends Hayvan implements IKuyrukluHayvan {

	public AnkaraKedisi(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	@Override
	public void sesCikar() {
		System.out.println("Miyaw");
	}

	@Override
	public void yemekYe() {
		System.out.println("Kedi " + this.getAd() + " süt içiyor.");
	}

	@Override
	public void kuyrukSalla() {
		System.out.println("Kedi " + this.getAd() + " kuyruğunu sallıyor.");

	}

}
