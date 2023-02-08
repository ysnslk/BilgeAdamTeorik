package com.yasinsolak;

import java.util.Random;
import java.util.Scanner;

public class Main {

	// Metodlar - Fonksiyonlar

	// public Access modifier (Erişim belirleyici) //Public : Bütün packege'lar
	// protected : Sadece aynı packege'lar
	// private : Sadece sınıf içinde

	// Static (zorunlu değil) => metodların hepsi program çalışır çalışmaz
	// adreslenir değişmez
	// Static olmasa adres nesne olşunuca oluşacaktı.

	// final (zorunlu değil) => metodun başında final yazılırsa o metod override
	// edilemez demektir.
	// final keywordu sınıfın başına gelirse o sınıftan yeni sınıf türetilemez
	// final ı en çok değişkenlerde kullanırız
	final static double PI = 3.14; // değişkeni değiştiremezsin anlamına gelir.

	// Return type : => Zorunludur. Hiçbir şey return etmeyecekse void yazılmalı.
	// hello : metod ismi yazılmak zorundadır.
	// parantezler : parantez içine parametre yazabilirsiz.(isteğe bağlı)
	// Aşağıdaki hello() örneğinde parametre yok.
	// {} : metodun içeriğini süslü parantezlerin içine yazmamız gerekir.
	public static final void hello() {
		System.out.println("Hello from hello method in Main.java");
	}

	// örnek
	// Bir sayının karesini hesaplayıp return etsin
	// Parametreli metod
	// Parametre değişkenlerinin yaşam alanı(scope u)
	// sadece tanımlandığı yerin içindedir.
	private static int kareAl(int sayi) {
		int sonuc = sayi * sayi;
		return sonuc;
	}

	// Örnek metod
	// Random sayi üretelim

	public static int randomNumber() {
		Random rnd = new Random();
		int result = rnd.nextInt(100);
		return result;
	}

	public static int randomNumber(int ustLimit) {
		Random rnd = new Random();
		int result = rnd.nextInt(ustLimit);
		return result;

	}

	// Aşağıdaki işlem yanlıştır.
//	public static int randomNumber(int uLimit) {
//		Random rnd = new Random();
//		int result = rnd.nextInt(uLimit);
//		return result;
//	}
	
	
	private static int randomNumberv3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Alt limiti Girin");
		 int altLimit = sc.nextInt();
			System.out.println("Üst limiti Girin");
		 int usLimit = sc.nextInt();
		Random rnd = new Random();
		int result = rnd.nextInt(altLimit,usLimit);
		return result;
		
	}

	public static void main(String[] args) {

		System.out.println("Merhaba");
		Main.hello(); // Aynı class içindeki static metodları çağırmak için uzun uzun paket ismi
						// yazmak zorunlu değildir.

		com.alikaya.YardimciSinif.hello(); // => Ok.

		int matSonuc = kareAl(10);
		System.out.println("MatSonuc : " + matSonuc);

		System.out.println("Random bir sayı 1: " + Main.randomNumber());
		System.out.println("Random bir sayı 2: " + randomNumber());

		int randomSayi3 = Main.randomNumber();
		System.out.println("Random bir sayi 3: " + randomSayi3);

		System.out.println("Random sayı v.2 : " + randomNumber(1000));
		// eğer YardimciSinif içindeki hello() metodu private ya da protected olsaydı o
		// zaman çağıramzdık.

		// peki üst limiti parametre olarak alan ve üst limite kadar random bir sayı
		// üreten
		// Metod yazalım
		// Method Overloading

		System.out.println("Hoşçakalın...");
		
		
		//Bir local değişkenin scope u tanımlandığı süslü parantez
		//içindedir
		{
			int x2 = 5;
		}
		//System.out.println(x2);
		
		System.out.println(randomNumberv3());
		
		//Soru 
		//Main içinde kullanıcıdan bir String alın ve bu 
		//Stringin tekrarlanma sayısını alın.
		//Aldığınız bu iki değeri tekrarla isimli bir metoda gönder.
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = sc.nextLine();
		System.out.println("Tekrar Sayısını giriniz");
		int tekrakSayisi = sc.nextInt();
		
		metniTekrarla(kelime,tekrakSayisi);
	}

	private static void metniTekrarla(String kelime, int tekrakSayisi) {
		for (int i = 0; i < tekrakSayisi; i++) {
			System.out.println(kelime);
		}
		
	}

}
