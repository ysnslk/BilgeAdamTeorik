package com.yasinsolak;

public class VarArgsKullanimi {
	
	
	public static void toplaVarArgs(int... sayilar) {
		int toplam = 0;  //Yukarıdaki metodun parametre kısmında yazan sayılar bir dizi gibi davranır
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam : "+toplam);
		
		
		int toplamForEach = 0;
		for(int x : sayilar) {
			toplamForEach+=x;
		}
		System.out.println("Toplam2 : "+toplam);
	}
	
	public static void ekranYazdir(String... isimler) {
		for (int i = 0; i < isimler.length; i++) {
			System.out.println(isimler[i]);
			
		}
	}
	

	public static void main(String[] args) {
		toplaVarArgs(1,2,3,4,5);
		ekranYazdir("Ali","Kaan","Zeynep");
	}

}
