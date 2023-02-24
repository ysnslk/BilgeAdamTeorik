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
		// sinif1.sinifaOgrenciEkle(ogrenci5);
		sinif1.getOgrencilerArrayList().add(ogrenci5);
		sinif1.siniftakiOgrenciListesi();

		Sinif sinif2 = new Sinif("1B", "C Blok - 101");
		Ogrenci ogrenci6 = new Ogrenci("Kaan", "Emre", 500, 0);
		sinif2.sinifaOgrenciEkle(ogrenci6);
		sinif2.siniftakiOgrenciListesi();

		Sinif sinif3 = new Sinif("1C", "Ana Bina - 102");
		Ogrenci ogrenci7 = new Ogrenci("Kaan", "Emre", 800, 0);
		Ogrenci ogrenci8 = new Ogrenci("Alper", "Emre", 801, 0);
		Ogrenci ogrenci9 = new Ogrenci("Mehnet", "Emre", 802, 0);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(ogrenci9);
		sinif3.sinifaOgrenciEkle(new Ogrenci("Şafak", "Taş", 803, 8));

		sinif3.siniftakiOgrenciListesi();
		sinif3.siniftanOgrenciCikar(ogrenci8);
		sinif3.siniftakiOgrenciListesi();

		sinif3.siniftanOgrenciCikarOkulNo(803);
		sinif3.siniftakiOgrenciListesi();

		sinif3.sinifaOgrenciEkle("Emir", "A", 9, 0);
		sinif3.siniftakiOgrenciListesi();

		sinif3.sinifaOgrenciEkle("Emir", "Ak", 9, 0);
		sinif3.siniftakiOgrenciListesi();
	}

}
