package com.yasinsolak;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayi giriniz");
		int x = input.nextInt();
		// Kullanıcın girdiği sayının pozitif , negatif veya 0 olduğıunu bulan kod
//		if (x > 0) {
//			System.out.println("Girilien Sayı Pozitiftir");
//		} 
//		else if (x < 0) {
//			System.out.println("Girilien Sayı Negatiftir");
//		} 
//		else if(x==0){
//			System.out.println("Girilien Sayı Nötr");
//		}
//		if(x>5) {
//			System.out.println("Girdiğiniz Sayı 5'ten büyüktür.");
//		}
//		System.out.println("Hoşçakalın");

		// -----------------------------------------------------------//
		// Bir sayının 10'a bölünüp bölünmediğini bulan programı
//		if(x>=10) {
//			if(x%10 == 0) {
//				System.out.println(x+" Sayısı 10'a tam bölünür");
//			}
//			else {
//				System.out.println(x+" Sayısı 10'a tam bölünemez");
//			}
//		}
//		else {
//			System.out.println("Lütfen 10dan büyük bir sayı giriniz");
//		}

		// -----------------------------------------------------------//
		// Otomobil yaşına göre vergi dilimi hesaplama

		// 0-5(dahil) arası en yüksek vergi dilimi
		// 5-10 orta vergi dilimi (10 dahil)
		// 10- en düşük vergi dilimi

//		if(x>=0 && x<=5) {
//			System.out.println("En yüksek vergi dilimindesiniz...!");
//		}
//		else if(x>5 && x <=10) {
//			System.out.println("Orta vergi dilimindesiniz...!");
//		}
//		else if(x>10) {
//			System.out.println("En düşük vergi dilimindesiniz...!");
//		}
//		else {
//			System.out.println("Araç yaşı 0 dan küçük olamaz...!");
//		}

		// -----------------------------------------------------------//

		// x kullanıcının girdiği işlem olsun
		// 1 Toplam 2 çıkartma 3 çarpma 4 bölme

//		if(x==1) {
//			System.out.println("Toplama");
//		}
//		else if(x==2) {
//			System.out.println("Çıkartma");
//		}
//		else if(x==3) {
//			System.out.println("Çarpma");
//		}
//		else if(x==4) {
//			System.out.println("Bölme");
//		}
//		else {
//			System.out.println("Hatalı Seçim...!");
//		}
//		switch (x) {
//		case 1:
//			System.out.println("Toplama");
//			break;
//		case 2:
//			System.out.println("Çıkartma");
//			break;
//		case 3:
//			System.out.println("Çarpma");
//			break;
//		case 4:
//			System.out.println("Bölme");
//			break;
//		default:
//			System.out.println("Yanlış Seçim..!");
//			break;
//		}

		// -----------------------------------------------------------//
		// Kullanıcının girdiği sayıya göre ilgili mevsimi ekrana yazdırın
		//Java 14+ Sonrası için geçerli
		switch (x) {
		case 12, 1, 2:
			System.out.println("Kış");
			break;
		case 3, 4, 5:
			System.out.println("İlkbahar");
			break;
		case 6, 7, 8:
			System.out.println("Yaz");
			break;
		case 9, 10, 11:
			System.out.println("Sonbahar");
			break;
		default:
			System.out.println("Lütfen geçerli bir ay girin (1-12)");
			break;
		}

	}

}
