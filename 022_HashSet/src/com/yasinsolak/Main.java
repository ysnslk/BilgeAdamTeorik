package com.yasinsolak;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Main {
	/*
	 * HashSetler Java'da elemanlara random olarak çok hızlı şekilde erişmek için
	 * kullanılan veri yapılarıdır. Hızlı olmasının nedeni elemanlara erişilirken
	 * hash kodlarının kullanılmasıdır. Hash code sayesinde herhangi bir inpur
	 * elemanı uniq olarak tanımlanabilir. ÖNEMLİ HashSet aynı eleman barındırmaz.
	 */

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Kus"); // Sırasıyla kaydetmeyebilir!!!!!
		hashSet.add("Kedi"); // Sırasıyla kaydetmeyebilir!!!!!
		hashSet.add("Köpek"); // Sırasıyla kaydetmeyebilir!!!!!
		hashSet.add("Kus"); // Aynı elemanı eklemez

		for (String s : hashSet) {
			System.out.println(s);
		}

		// ArrayListten Farkı

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Kus");
		arrayList.add("Kedi");
		arrayList.add("Köpek");
		arrayList.add("Kus");
		System.out.println("\n ArrayList \n");
		for (String a : arrayList) {
			System.out.println(a);

		}

		System.out.println();
		if (hashSet.contains("Kus")) {
			System.out.println("Kus Set içinde mevcut");
		} else {
			System.out.println("Kus Set içinde mevcut değil...!!");
		}

		// ÖDEV HASHING SİSTEMİNİ ARAŞTIR
		
		//HashSetler Arası fark bulma
		
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");
		
		//Fark 2 adımda bulunur
		//1.Adım 
		HashSet<String> fark = new HashSet<>(hashSet2);

		//2.Adım
		fark.removeAll(hashSet);
		System.out.println(fark);
	}

}
