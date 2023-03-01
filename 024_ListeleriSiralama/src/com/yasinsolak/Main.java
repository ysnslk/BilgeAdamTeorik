package com.yasinsolak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list);

		// Collections sınıfı:

		// Collection sınıfı bir UTILITY sınıfıdır.(Yani collections framework kullırken
		// bize yardımcı olabilecek metodları barındırır).
		
		Collections.sort(list);
		System.out.println(list);
		
		//Kendi sınıfımızdan nesneleri kullanrak listeyi dolduralım ve sıralayalım
		List<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci("Berk",1050));
		ogrenciler.add(new Ogrenci("Sinem",1025));
		ogrenciler.add(new Ogrenci("Gülsü",900));
		ogrenciler.add(new Ogrenci("Ahmet",1205));
		ogrenciler.add(new Ogrenci("Hivda",750));
		
		System.out.println(ogrenciler);
		
		Collections.sort(ogrenciler);
		
		System.out.println(ogrenciler);
	}

}
