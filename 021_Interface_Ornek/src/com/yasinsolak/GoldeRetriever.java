package com.yasinsolak;

public class GoldeRetriever extends Hayvan implements IYirticiHayvan{
	
	public GoldeRetriever(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	@Override
	public void sesCikar() {
		System.out.println("Hav");
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek " + this.getAd() + " kemik yiyor.");
	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd()+" isimli Golden "+nesne +"ye/ya saldırıyor.");
		
	}

}
