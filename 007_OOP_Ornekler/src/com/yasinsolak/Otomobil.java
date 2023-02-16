package com.yasinsolak;

public class Otomobil {
	public static String ARAC_TIPI = "Kara Aracı";

	//Otomobil sınıfından türetilecek her bir nesneniin 
	// sahip olabileceği nesneye ait özellikler
	
	public String marka;//String nesneleri null olarak initialize edilir.
	public String model;
	public int yil;//Sayısal veri tipleri 0 larak initialize edilir.
	public int aracinKm;
	public Motor motor;//Otomobil sınıfının içinde farklı bir sınıf nesnesini  üye değişken olarak tutuyorum.
	
	public void bilgileriEkranaYaz() {
		String marka = "BMW";
		System.out.println("Marka : "+this.marka+" Model : "+this.model+" Yıl : "+this.yil+" Km : "+this.aracinKm +" Araç Tipi : "+ Otomobil.ARAC_TIPI);
		this.motor.motorBilgileriniYazdir();
		System.out.println();
	}
	
	public void araciSur(int km) {
		System.out.println("Araç "+km+" km yol yapıyor");
		aracinKm = aracinKm + km;
	}
	
	
	public void aracYilBilgisiDegistir(int yil) {
		//yil = yil //ambiguity : kafa karışıklığı oluştu
		this.yil = yil ;
	
	}
	
	
	
}
