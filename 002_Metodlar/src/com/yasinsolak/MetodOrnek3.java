package com.yasinsolak;

import java.util.Scanner;

public class MetodOrnek3 {

	private static void menuyuGöster() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*  Hesap Makinesi   *");
		System.out.println("*                   *");
		System.out.println("*********************");
		System.out.println("1. Toplama");
		System.out.println("2. Çıkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("5. Çıkış");
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		boolean control = true;
		while (control == true) {
			menuyuGöster();
			System.out.println("Lütfen seçiminizi girin(1-5) :");
			int secim = sc.nextInt();
			
			switch (secim) {
			case 1:
				System.out.println("Toplam işlemi :");
				System.out.println("Lütfen 1. Sayıyı giriniz");
				int sayi1 = sc.nextInt();
				System.out.println("Lütfen 2. Sayıyı giriniz");
				int sayi2 = sc.nextInt();
				System.out.println("Sonuç= "+(sayi1+sayi2));
				break;
			case 2:
				System.out.println("Çıkarma işlemi :");
				System.out.println("Lütfen 1. Sayıyı giriniz");
				int sayi3 = sc.nextInt();
				System.out.println("Lütfen 2. Sayıyı giriniz");
				int sayi4 = sc.nextInt();
				System.out.println("Sonuç= "+ (sayi3-sayi4));
				break;
			case 3:
				System.out.println("Çarpma işlemi :");
				System.out.println("Lütfen 1. Sayıyı giriniz");
				int sayi5 = sc.nextInt();
				System.out.println("Lütfen 2. Sayıyı giriniz");
				int sayi6 = sc.nextInt();
				System.out.println("Sonuç= "+ (sayi5*sayi6));
				break;
			case 4:
				System.out.println("Bölme işlemi :");
				System.out.println("Lütfen 1. Sayıyı giriniz");
				int sayi7 = sc.nextInt();
				System.out.println("Lütfen 2. Sayıyı giriniz");
				int sayi8 = sc.nextInt();
				System.out.println("Sonuç= "+ (sayi7/sayi8));
				break;
			case 5:
				System.out.println("İyi günler");
				control = false;
				break;
			default:
				System.out.println("Lütfen (1-5) Arası bir değer giriniz");
				break;
			}
		}
		
	}

}
