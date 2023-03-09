package com.yasinsolak;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Generic'ler tasarladığımız sınıfların tek bir sınıf tipi için değil,
		// bir şablon yapısına uyan her tip sınıf için çalışmasını sağlayan yapılardır.

		// Aslında biz Generics konusunu Collections framework ta uyguladık.
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		listInteger.add(24);
		listInteger.add(120);

		for (Integer i : listInteger) {
			System.out.println(i);
		}

		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("C++");
		listString.add("C#");
		listString.add("Python");

		for (String s : listString) {
			System.out.println(s);
		}

		// *******************************************
		System.out.println();

		GenericSinif<Integer> genericSinif = new GenericSinif<Integer>(25);

		System.out.println(genericSinif.getObj());

		GenericSinif<String> genericSinif2 = new GenericSinif<String>("Hello Java");

		System.out.println(genericSinif2.getObj());

		Kare k = new Kare(5);

		GenericSinif<Kare> genericSinif3 = new GenericSinif<Kare>(k);

		// GenericSinif<Kare> genericSinif3 = new GenericSinif<Kare>(new Kare(5));

		int alan = genericSinif3.getObj().alanHesapla();

		System.out.println("Karenin Alanı : " + alan);
	}
}
