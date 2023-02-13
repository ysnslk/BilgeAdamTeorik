package com.yasinsolak;

public class Soru2 {

	public static void main(String[] args) {

		System.out.println(BolunenSayilar());
		System.out.println("Hem 3 e Hem 5 e Bölünen Sayılar : " + BolunenSayilar2());
		int[]dizi = BolunenSayilar3();
		System.out.println("\n Soru3 Cevap :");
		for(int sayi : dizi) {
			System.out.println(sayi);
		}
	
	}

	// Soru1:
	// 34 ile 97 arasında (dahil)
	// 3 e veya 5 e bölünebilen bir metod yazın
	public static int BolunenSayilar() {
		int sayac = 0;
		for (int i = 34; i < 98; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hem 3 e hem 5 e bölünen: " + i);
				sayac++;
			} else if (i % 3 == 0) {
				System.out.println("3 e bölünen: " + i);
				sayac++;
			} else if (i % 5 == 0) {
				System.out.println("5 e bölünen: " + i);
				sayac++;
			}
		}
		return sayac;
	}

	// Soru2:
	// 34 ile 97 arasında (dahil)
	// 3 e ve 5 e bölünebilen bir metod yazın
	public static int BolunenSayilar2() {
		int sayac = 0;
		for (int i = 34; i < 98; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hem 3 e hem 5 e bölünen: " + i);
				sayac++;
			}

		}
		return sayac;

	}

	// Soru3 :
	//
	// 34 ile 97 arasında (dahil)
	// 3 e ve 5 e bölünebilen bir metod yazın
	// Bu sayıları bulup toplamını bir array olarak return etsin

	public static int[] BolunenSayilar3() {
		int sayac = 0,toplam =0;
		for (int i = 34; i < 98; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hem 3 e hem 5 e bölünen: " + i);
				sayac++;
				toplam+=i;
			}

		}
		int[]sonuclarDizisi = new int[2];
		sonuclarDizisi[0]=sayac;
		sonuclarDizisi[1]=toplam;
		return sonuclarDizisi;

	}
	
	
	
	
	
	
}
