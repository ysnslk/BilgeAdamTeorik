package com.yasinsolak;

public class SUV {

	public String marka;//String nesneleri null olarak initialize edilir.
	public String model;
	public int yil;//Sayısal veri tipleri 0 larak initialize edilir.
	public int aracinKm;
	public String cekisSistemi;
	public Motor motor;//Otomobil sınıfının içinde farklı bir sınıf nesnesini  üye değişken olarak tutuyorum.
	
	public void bilgileriEkranaYaz() {
		System.out.println("Marka : "+this.marka+" Model : "+this.model+" Yıl : "+this.yil+" Km : "+this.aracinKm +" Çekiş Sistemi : "+this.cekisSistemi+" Araç Tipi : "+ Otomobil.ARAC_TIPI);
		this.motor.motorBilgileriniYazdir();
		System.out.println();
	}
}
