package com.yasinsolak;

public class Kartal extends Hayvan implements IUcabilir , IYirticiHayvan {

	public Kartal(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adlı kartal saniyede 4 kez kanat çırpıyor");

	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı kartal kanatlarını yavaşça temizliyor.");

	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı kartal yırtıcı gagasıyla " + nesne + " gagalıyor");

	}

	@Override
	public void sesCikar() {
		System.out.println("hukekekekekeke");

	}

	@Override
	public void yemekYe() {
		System.out.println(this.getAd() + " adlı kartal avını yiyor");

	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd() + " adlı kartal yırtıcı gagasıyla " + nesne + "ye/ya saldırıyor.");
		
	}

}
