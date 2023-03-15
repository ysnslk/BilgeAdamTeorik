package com.guraysungur;

public class Singleton {
	
	private static AlanHesaplayici alanHesaplayici; // = null
	private static CevreHesaplayici cevreHesaplayici;  // = null
	
	public static AlanHesaplayici getAlanHesaplayici() {
		if (alanHesaplayici == null) {
			alanHesaplayici = new AlanHesaplayici();
		}
		return alanHesaplayici;
	}
	
	public static CevreHesaplayici getCevreHesaplayici() {
		if (cevreHesaplayici == null) {
			cevreHesaplayici = new CevreHesaplayici();
		}
		return cevreHesaplayici;
	}
	
	

}
