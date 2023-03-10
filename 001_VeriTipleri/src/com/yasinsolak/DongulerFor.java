package com.yasinsolak;

import java.util.Scanner;

public class DongulerFor {

	public static void main(String[] args) {

//		System.out.println("Merhaba 0");
//		System.out.println("Merhaba 1");
//		System.out.println("Merhaba 2");
//		System.out.println("Merhaba 3");

		/*
		 * Bir şeyi n kere yazdıracaksam kaç kere saydığımı kontrol edebilmek için bir
		 * değişkene ihtiyaç var. o değişken de genelde for döngülerinde i ve j isminde
		 * tutulur.
		 */

		for (int i = 0; i < 4; i++) {
			System.out.println("Merhaba " + i);

		}

		for (int sayac = 0; sayac < 3; sayac++) {
			System.out.println("Merhaba");
			System.out.println("Java");

		}

		System.out.println("\n*****\n");

		// Soru
		for (int i = 0; i < 3; i++)
			; // ; Hiç bir işe yaramayan döngü
		System.out.println("Merhaba");
		System.out.println("Dünya");

		for (int i = 0; i < 3; i++) // Sadece tek satırı işleme sokar
			System.out.println("Merhaba");
		System.out.println("Dünya");

		System.out.println("***********************************");

		int x = 5;
		if (x > 1) // Sadece tek satırı işleme sokar
			System.out.println("1'den büyük");
		System.out.println("0 dan da büyük");

		System.out.println("***********************************");

//		for(;;) { // Sonsuz Döngü
//			System.out.println("Merhaba");
//			System.out.println("Dünya");
//		}

		// Ağağıdaki kod çalışır ama tavsiye edilmez

//		int i=0;
//		for(;i<5;) {
//			System.out.println("Hello "+i);
//			i++;
//		}

		// Soru
		// 1 den 10 a kadar olan sayıların toplamını bulalım.
		int toplam = 0; // İlk değeri atadım. (initialize Etmek)
		for (int i = 1; i <= 10; i++) {
			toplam = toplam + i;
		}
		System.out.println("Toplam = " + toplam);

		// Sort
		// 1'den 10 a kadar olam tüm tek sayılar

		for (int i = 1; i <= 10;) {
			System.out.println(i);
			i = i + 2;
		}

		// Soru :
		// Ekrana aşağıdaki şekli çizdiren döngü içeren
		// Kodu yazı

		for (int i = 1; i <= 12; i++) {
			System.out.print("* ");
			if (i % 4 == 0) {
				System.out.println(" ");
			}
		}

		// Soru
		// Aşağıdaki kodu çalıştırınca kaç kere test yazar
		/*
		 * Bu şekilde for döngüsü içinde indexi değiştirmek tavsiye edilmez.Eğer kod
		 * bloğu içinde indexi değiştirmeniz gereken durumlar oluyorsa while veya do
		 * while döngülerini kullanınız.
		 * 
		 */
		for (int i = 0; i < 11; i++) {
			i = 10;
			System.out.println("test");
		}

		/*
		 * Kullanıcıdan iki sayı alın. Başlangıç - Bitiş sayıları arasında 7 ye
		 * bölünebilen sayıları ekrana yazdır
		 */

		Scanner sc = new Scanner(System.in);
		int sayik, sayib;

		System.out.println("Başlangıç sayısını girin.");
		sayik = sc.nextInt();
		System.out.println("Bitiş sayısını girin.");
		sayib = sc.nextInt();

		if (sayik >= sayib) {
			System.out.println("Lütfen başlangıç sayısını küçük seçin");
		} 
		else {
			for (int i = sayik; i <= sayib; i++) {
				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
		}

	}

}
