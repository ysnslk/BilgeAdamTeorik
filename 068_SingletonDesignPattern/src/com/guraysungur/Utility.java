package com.guraysungur;

public class Utility {
	
	public void hesaplamaYap() {
		
//		AlanHesaplayici alanHesaplayici = new AlanHesaplayici();
//		int toplamalan = alanHesaplayici.dikdortgenAlanHesapla(3, 7) + alanHesaplayici.kareAlanHesapla(5);
//		System.out.println(toplamalan);
		
		System.out.println("Toplam alan: " + ( Singleton.getAlanHesaplayici().dikdortgenAlanHesapla(3, 7) 
											 + Singleton.getAlanHesaplayici().kareAlanHesapla(5)));
		
		for (int i=0;i<10000;i++) {
			
			// çeşitli hesaplamalar			
			Singleton.getCevreHesaplayici().kareCevreHesapla(i);
		}
	}

}
