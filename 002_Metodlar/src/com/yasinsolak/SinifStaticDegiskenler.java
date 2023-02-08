package com.yasinsolak;

public class SinifStaticDegiskenler {

	// Javada global değişken yok(C de vardır.)
	// Bunun yerine sınıfların static değişkenelerini public yaparak
	// kullanırsanız gloabal değişken gibi davranabilir.
	// sınıfların static değişkenleri
	public static final int DUNYANIN_YARICAPI = 6371;
	public static final double PI = 3.14;
	public static int aktifKullaniciSayisi = 0;

	public static void main(String[] args) {
		System.out.println("Aktif kullanıcı sayısı : " + aktifKullaniciSayisi);
		aktifKullaniciSayisi++;
		System.out.println("Aktif kullanıcı sayısı : " + aktifKullaniciSayisi);
	
		SinifStaticDegiskenlerTest.aktifKullanıcıSayisiniArttir();
		System.out.println("Aktif kullanıcı sayısı : " + aktifKullaniciSayisi);
	
		
		
		//Scope not:
		/*
		 * Local değişkenler ancak ve ancak tanımlandıktan sonra kullanılabilir.
		 * 
		 */
		int z = 9;
		System.out.println(z);
		System.err.println(PI);
		
	}

}
