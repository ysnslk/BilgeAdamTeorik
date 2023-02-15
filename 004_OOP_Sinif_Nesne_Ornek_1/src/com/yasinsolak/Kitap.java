package com.yasinsolak;

public class Kitap {
	
	//static değişken
	public static final String tur ="Kitap"; //Nesne oluşturulmadan oluşuyor.

	// Sınıf üye değişkenleri
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;
	public int stokMiktari;

	public String kitapBilgileriniGetir() {
		String kitapBilgileri = "Ad : " + ad + " Yazar : " + yazarAdi + " Sayfa sayısı : " + sayfaSayisi+" Stok miktarı : "+stokMiktari+" Tür : "+Kitap.tur;
		return kitapBilgileri;

	}

}
