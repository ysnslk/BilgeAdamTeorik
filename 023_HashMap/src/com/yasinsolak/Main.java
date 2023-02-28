package com.yasinsolak;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 * HashMapler key-value pair'ler (Anahtar değer çiftleri) olarak tutulur. Key->
		 * Value . HashMap de içindeki elemanları sıralı tutmaz. Random sırada tutar
		 * HashMapler Listlere göre random acces(rastgele erişim) tıpkı HashSetler gibi
		 * hızlandırır
		 * 
		 */

		// HashMap<Key,Value>
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");

		System.out.println(hashMap);

		// Aynı key'e (anahtara) Sahip başka bir kayıt eklemeye kalkarsanız üzerine
		// yazarsınız..!!!
		hashMap.put(40, "Fiat");
		System.out.println(hashMap);

		System.out.println(hashMap.get(20));
		System.out.println(hashMap.get(40));
		System.out.println(hashMap.get(70));

		if (hashMap.containsKey(70)) {
			System.out.println("Mevcut");
		} else {
			System.err.println("Mevcut değil");
		}

		// HashMap içeriğini bastırmak

		// 1.yol
		// HashMap 'i Sete dönüştürür ve loop ediniz.
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar : " + entry.getKey() + " Değer : " + entry.getValue());
		}
		System.out.println();
		// 2.Yol
		for (Integer key : hashMap.keySet()) {
			System.out.println("Key : " + key + " Value : " + hashMap.get(key));
		}

		// Önemli bir iki metod :

		// containsKey
		if (hashMap.containsKey(20)) {
			System.out.println("Mevcut");
		} else {
			System.err.println("Mevcut değil");
		}

		// containsValue
		if (hashMap.containsValue("Renault")) {
			System.out.println("Renault hashMap içinde mevcut");
		} else {
			System.err.println("Renault hashMap içinde mevcut değil");
		}
	}

}
