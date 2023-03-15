package com.guraysungur;

public class Main {

	public static void main(String[] args) {
		
		// AlanHesaplayici alanHesaplayici = new AlanHesaplayici();
		// System.out.println(alanHesaplayici.dikdortgenAlanHesapla(5, 10));
		
		System.out.println("Alan: " + Singleton.getAlanHesaplayici().dikdortgenAlanHesapla(5, 10));
		
		System.out.println("Cevre: " + Singleton.getCevreHesaplayici().dikdortgenCevreHesapla(5, 30));

	}

}
