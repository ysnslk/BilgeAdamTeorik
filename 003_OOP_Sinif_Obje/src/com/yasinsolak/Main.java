package com.yasinsolak;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// İlk Anahtar nesnemizi oluşturalım.
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk = "Mavi";
		anahtar1.no = 10;
		anahtar1.ad = "Benim Anahtarım";

		System.out.println("Adı : " + anahtar1.ad + " Renk : " + anahtar1.renk + " No : " + anahtar1.no + " Uzunluk : "
				+ Anahtar.uzunluk);

		// 2. Bir anahtar nesnesi oluşturalım.
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk = "Kırmızı";
		anahtar2.no = 12;
		anahtar2.ad = "Kardeşimin Anahtarı";

		System.out.println("Adı : " + anahtar2.ad + " Renk : " + anahtar2.renk + " No : " + anahtar2.no + " Uzunluk : "
				+ Anahtar.uzunluk);

		// 3. Bir anahtar nesnesi oluşturalım.
		Anahtar anahtar3 = new Anahtar();
		anahtar3.renk = "Yeşil";
		anahtar3.no = 15;
		anahtar3.ad = "Deponun Anahtarı";

		System.out.println("Adı : " + anahtar3.ad + " Renk : " + anahtar3.renk + " No : " + anahtar3.no + " Uzunluk : "
				+ Anahtar.uzunluk);

		// Static bir metodu kullanırken sınıfadı.metod adz yazılır.
		Anahtar.uzunluguEkranaYaz();

		// non-static bir metod kullanılırken nesne adı metod adı yazılır.
		anahtar1.bilgileriEkranaYaz();
		anahtar2.bilgileriEkranaYaz();
		anahtar3.bilgileriEkranaYaz();

		// Peki şöyle yazılabilir mi ?
		// Anahtar.bilgileriEkranaYaz(); => Hata verir , çünkü bilgileriEkranaYaz()
		// metodu static olmadığı için çağırılamaz,
		// Nesne adı ile çağırılır.

		int[] sayilerDizisi = { 2, 5, 9, 12 };
		System.out.println(sayilerDizisi[0]);
		Anahtar[] anahtarDizisi = { anahtar1, anahtar2, anahtar3 };
		for (int i = 0; i < anahtarDizisi.length; i++) {
			System.out.println(anahtarDizisi[i].ad + " " + anahtarDizisi[i].no + " " + anahtarDizisi[i].renk);
		}
		System.out.println("\n**************\n");
		// Aşağıdaki satırı metod kullanarak yazabiliriz.
		for (int i = 0; i < anahtarDizisi.length; i++) {

			anahtarDizisi[i].bilgileriEkranaYaz();
		}
		System.out.println("\n**************\n");
		// Yukarıdakileri for each ile yazdılarım.
		for (Anahtar anahtar : anahtarDizisi) {
			anahtar.bilgileriEkranaYaz();
		}
		
		
		Anahtar anahtar4 = new Anahtar();
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
	}

}
