package com.yasinsolak;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Fatma", 451, 0);
		Ogrenci ogrenci3 = new Ogrenci("Mevlüt", "Beşer", 452, 0);
		Ogrenci ogrenci4 = new Ogrenci("Fatma", "Karabacak", 453, 0);
		Ogrenci ogrenci5 = new Ogrenci("Beşer", "Şeşer", 454, 0);

		Sinif sinif1 = new Sinif("1A", "Zemin Kat - 101", new ArrayList<Ogrenci>());
		sinif1.sinifaOgrenciEkle(ogrenci1);
		sinif1.sinifaOgrenciEkle(ogrenci2);
		sinif1.sinifaOgrenciEkle(ogrenci3);
		sinif1.sinifaOgrenciEkle(ogrenci4);

		Sinif sinif2 = new Sinif("1B", "C Blok - 101");
		Ogrenci ogrenci6 = new Ogrenci("Kaan", "Emre", 500, 0);
		sinif2.sinifaOgrenciEkle(ogrenci6);

		Sinif sinif3 = new Sinif("1C", "Ana Bina - 102");
		Ogrenci ogrenci7 = new Ogrenci("Kaan", "Emre", 800, 0);
		Ogrenci ogrenci8 = new Ogrenci("Alper", "Emre", 801, 0);
		Ogrenci ogrenci9 = new Ogrenci("Mehnet", "Emre", 802, 0);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(ogrenci9);
		sinif3.sinifaOgrenciEkle(new Ogrenci("Şafak", "Taş", 803, 0));

		// Okul nesnesi oluşturuyoruz.
		Okul okul = new Okul("Atatürk İlköğretim Okulu", "Eskişehir");
		okul.sinifEkle(sinif1);
		okul.sinifEkle(sinif2);
		okul.sinifEkle(sinif3);
		okul.siniflariYazdir();

//		okul.okuldanSinifCikar("1C");
//		okul.siniflariYazdir();

//		Sinif sinif4 = new Sinif("1D", "Ana Bina - 105");
//		okul.okuldanSinifCikar("1D");
//		okul.siniflariYazdir();
		okul.okuldakiOgrencileriYazdir();

		okul.okuldanSinifCikarIterators("1C");
		okul.siniflariYazdir();

		Okul okul2 = new Okul("Aaaaa", "Eskişehir");
		okul2.sinifEkle(new Sinif("1A", "Zemin Kat 105"));
		okul2.sinifEkle(new Sinif("1B", "Zemin Kat 105"));

		Sinif snf = okul2.getSinif("1A");
		if (snf != null) {
			snf.sinifaOgrenciEkle("Tolga", "Kaya", 111, 0);
			snf.sinifaOgrenciEkle("Mustafa", "Kaya", 112, 0);
		}
		else {
			System.out.println("Sınıf Bulunamadı!!!!");
		}
		
		okul2.okuldakiOgrencileriYazdir();
		

	}

}
