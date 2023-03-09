package com.yasinsolak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Otomobil> cars = new ArrayList<>();
		cars.add(new Otomobil("Opel", "Astra", 2011));
		cars.add(new Otomobil("Audi", "A4", 2021));
		cars.add(new Otomobil("BMW", "118", 2014));
		cars.add(new Otomobil("Renault", "Megane", 2011));
		
		System.out.println(cars);

		// Audi yi for döngüsü ile sil
//		for (Otomobil oto : cars) {
//			if(oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
//				cars.remove(oto);
//			}
//		}

		// Yukarıdaki gibi bir for döngüsünde listeden eleman silemeyiz

		// Iteratorların en önemli kullanım alanı döngü içinde istediğimiz elemanı
		// silebilmemizdir

		for (Iterator<Otomobil> iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil oto = (Otomobil) iterator.next();
			if (oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
				iterator.remove();
			}
		}
		
		System.out.println(cars);

	}

}
