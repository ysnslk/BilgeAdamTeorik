package com.yasinsolak;

import java.util.Scanner;

public class SinifStaticDegiskenlerTest {
	
	public static void aktifKullanıcıSayisiniArttir() {
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
	}public static int aktifKullanıcıSayisiniGetir() {
		return SinifStaticDegiskenler.aktifKullaniciSayisi;
	}

	public void staticOlmayanMetod() {
		System.out.println("Static olmayan metoddan merhaba !");
	}
	public static void main(String[] args) {
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
		System.out.println(SinifStaticDegiskenler.aktifKullaniciSayisi);
		System.out.println(SinifStaticDegiskenlerTest.aktifKullanıcıSayisiniGetir());
	
	
	
	//Kural 
		//Static olmayan metodları static metodlar içinden direk çağıramazsın
		//staticOlmayanMetod();  => Hata verir
		
		
//		Scanner sc = new Scanner(System.in);
//		int b = sc.nextInt();
//	
	}

}
