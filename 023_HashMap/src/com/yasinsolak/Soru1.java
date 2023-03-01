package com.yasinsolak;

import java.util.HashMap;
import java.util.Iterator;

public class Soru1 {

	public static void harfSayisiniBul(String metin) {

		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < metin.length(); i++) {
			char ch = metin.charAt(i);
			if (hashMap.containsKey(ch)) {// Karakter hashmapte mevcut ise
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {// Karakter hashmapte mevcut değil ise
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
	}

	public static void enCokTekrarEdenHarfiBul(String metin) {

		HashMap<Character, Integer> hashMap = new HashMap<>();
		char enCokTekrarEdenKarakter = 0;
		int max = 0;
		for (int i = 0; i < metin.length(); i++) {
			char ch = metin.charAt(i);
			if (hashMap.containsKey(ch)) {// Karakter hashmapte mevcut ise

				int tekrarSayisi = hashMap.get(ch) + 1;
				if (tekrarSayisi > max) {
					enCokTekrarEdenKarakter = ch;
					max = tekrarSayisi;
				}
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {// Karakter hashmapte mevcut değil ise
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
		System.out.println("En Çok Tekrar Eden Karakter : "+enCokTekrarEdenKarakter+" Tekrar Sayısı : "+max);
	}

	public static void main(String[] args) {
		/*
		 * Static bir metod yazın Bir String içindeki karakterlerin sayısını bulan ve
		 * ekran yazdıran bir metod yazınız.
		 */

		String metin = "Hderkese merhaba iyi çalışmalar";

		Soru1.harfSayisiniBul(metin);
		Soru1.enCokTekrarEdenHarfiBul(metin);
		// En çok tekrar eden harfi bulun
	}

}
