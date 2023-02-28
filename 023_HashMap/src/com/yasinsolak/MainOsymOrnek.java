package com.yasinsolak;

import java.util.HashMap;

public class MainOsymOrnek {

	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci("Ali", "Kaya", 87, 75, 83);
		Ogrenci ogrenci2 = new Ogrenci("Fatoş", "Can", 90, 50, 85);
		Ogrenci ogrenci3 = new Ogrenci("Mehmet", "Şen", 67, 45, 55);
		Ogrenci ogrenci4 = new Ogrenci("Ayşe", "Elma", 77, 85, 65);

		// key : Integer (TC Kimlik No) -> value : Ogrenci Sınıfından Oluşturulan
		// nesneler
		HashMap<Integer, Ogrenci> hashMap = new HashMap<Integer, Ogrenci>();
		hashMap.put(1145557, ogrenci1);
		hashMap.put(2222222, ogrenci2);
		hashMap.put(1234567, ogrenci3);
		hashMap.put(7654321, ogrenci4);

		// Sorgu Yazıyoruz.
		Ogrenci sonuc = hashMap.get(1145557);
		System.out.println(sonuc);

		sonuc = hashMap.get(7654321);
		System.out.println(sonuc);

	}
}
