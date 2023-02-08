package com.yasinsolak;

import java.util.Scanner;

public class MetodOrnek4 {

	private static long dikdortgenAlanHesapla(long kisaKenar, long uzunKenar) {

		return (kisaKenar * uzunKenar);
	}

	private static int kareAlanHesapla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen karenin bir kenarını girin : ");
		int kenar = sc.nextInt();
		return (kenar * kenar);
	}

	public static void main(String[] args) {

		// Soru 1
		// Dikdörtgenin alanını hesaplayan metod
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Lütfen uzun kenarı girin : ");
//		long uzunKenar = sc.nextLong();
//		System.out.println("Lütfen kısa kenarı girin : ");
//		long kisaKenar = sc.nextLong();
//		System.out.println("Alan : " +dikdortgenAlanHesapla(kisaKenar, uzunKenar));

		// Soru 2
		// 3 tane kare alanı tutan bir dizi oluşturun.
		// Kullanıcıdan kare kenar uzunlukları alıp alan hesapla
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç tane kare alanı dizide tutmak istersiniz ?");
		int n = sc.nextInt();
		int[] kareAlanlarDizi = new int[n];
		for (int i = 0; i < kareAlanlarDizi.length; i++) {
			kareAlanlarDizi[i] = kareAlanHesapla();

		}
		for (int i = 0; i < kareAlanlarDizi.length; i++) {
			System.out.println((i+1)+". karenin alanı : "+kareAlanlarDizi[i]); 
		}

	}

}
