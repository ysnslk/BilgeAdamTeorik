package com.yasinsolak;

public class DiziOrnekleri {

	public static void main(String[] args) {

		// Soru
		int[] dizi = { -4, 7, 12, 78, -32, 122, 0, 9 };
		int t = 0, ort = 0;

		// Bu dizinin ortalamasını tam sayı cinsinden bulun
		for (int i = 0; i < dizi.length; i++) {
			t = t + dizi[i];

		}
		ort = t / dizi.length;
		System.out.println("Ortalama : " + ort);

		// *****************************
		// int eşitlerken yuvarlama yapması

		int x = 20;
		int g = x / 3;
		int y = 3;
		double v = x / (y * 1.0);
		System.out.println("v: " + v);

		// Küsüratlarla ilgili Java Math kütüphanesi kullanımı
		System.out.println(Math.round(v));
		System.out.println(Math.round(1.4));

		// *****************************
		// 
		// En küçük ve en büyük sayıyı bulan problemleri
		
		
		
		

		// *****************************
		// Soru
		// Bir dizi içindeki en büyük sayıyı bul...
		//Enb yi bulmak için en baştaki sayıyı en büyük olarak kabul edelim
		//Dizi içindeki bir sonraki sayı ile kıyasla
		int enb=dizi[0];
		for(int i=0;i<dizi.length;i++) {
			if(enb <= dizi[i]) {
				enb = dizi[i];
			}
		}
		System.out.println("En Büyük Sayı : "+enb );
		
		//Dizi içindeki en küçük sayıyı bulun
		
		int enk=dizi[0],index=0;
		for(int i=0;i<dizi.length;i++) {
			if(enk >= dizi[i]) {
				enk = dizi[i];
				index = i;
			}
		}
		System.out.println("En Küçük Sayı : "+enk + " En Küçük Sayının indexi : "+ index);
		
		
		
		
	}

}
