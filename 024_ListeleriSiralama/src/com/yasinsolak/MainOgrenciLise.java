package com.yasinsolak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenciLise {

	public static void main(String[] args) {

		List<OgrenciLise> ogrenciler = new ArrayList<OgrenciLise>();
		ogrenciler.add(new OgrenciLise("Berk", 1050, 80));
		ogrenciler.add(new OgrenciLise("Sinem", 1025, 85.2));
		ogrenciler.add(new OgrenciLise("Gülsü", 900, 70.4));
		ogrenciler.add(new OgrenciLise("Ahmet", 1205, 92.8));
		ogrenciler.add(new OgrenciLise("Hivda", 750, 91.1));
		System.out.println(ogrenciler);

		Collections.sort(ogrenciler);
		System.out.println(ogrenciler);
	}

}
