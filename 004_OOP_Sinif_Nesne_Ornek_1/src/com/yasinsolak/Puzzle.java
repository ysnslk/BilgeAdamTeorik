package com.yasinsolak;

public class Puzzle {

	public static final String tur ="Oyuncak";
	
	// Sınıf üye değişkenleri
	public String ad;
	public String marka;
	public int parcaSayisi;
	public int stokMitari;
	
	
	public String puzzleBilgileriniGetir() {
		String puzzleBilgileri = "Ad : " + ad + " Marka : " + marka + " Parça sayısı : " + parcaSayisi+" Stok miktarı : "+stokMitari+ " Tür : "+Puzzle.tur;
		return puzzleBilgileri;

	}
	
}
