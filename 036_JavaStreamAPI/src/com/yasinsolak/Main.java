package com.yasinsolak;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci("Ali", 100));
		ogrenciler.add(new Ogrenci("Veli", 101));
		ogrenciler.add(new Ogrenci("Zehra", 102));
		ogrenciler.add(new Ogrenci("Ahmet", 103));
		ogrenciler.add(new Ogrenci("Kaan", 104));

//		for (Ogrenci ogr : ogrenciler) {
//			System.out.println(ogr);
//		}

		/*
		 * Stream : Akış
		 * 
		 * Aşağıdaki örnekte öğrenciler listesinin üzerinden gidip işlemler yapmamızı
		 * sağlar. Yani akış oluşturur. ogrenciler.stream => Yazdığımızı zaman
		 * öğrenciler listesi olan bir akış oluşturur.
		 * 
		 * Lambda functions : ok -> un solundaki ogr parametre ; ok -> un sağındaki ise
		 * parametrenin çalışacağı metoddur.
		 */

		ogrenciler.stream().forEach(ogr -> System.out.println(ogr));
		System.out.println();

		ogrenciler.stream().forEach(ogrenci -> {
			System.out.println("Öğrenci Bilgisi : ");
			System.out.println(ogrenci);
			System.out.println("------------");
		});
		System.out.println("\n\n");

		ogrenciler.stream().forEach(ogr -> ogr.printSinavNotu());

		System.out.println("\n\n");
		// :: Bu öğrenci sınıfının içindeki printSinavNotu metodunu cagır
		// Yukarıdaki ifadenin çok daha kısa yazılabilecek hali
		ogrenciler.stream().forEach(Ogrenci::printSinavNotu);

		// Stream api en çok kullanılan birkaç metodu:

		// filter metodu
		long id102denBuyukOgrenciSayisi = ogrenciler.stream().filter(ogrenci -> ogrenci.getId() > 102).count();
		System.out.println("ID si 102 den büyük ogrenci sayisi : " + id102denBuyukOgrenciSayisi);

		// collect () metodu ile filtre sonuclarını liste halina cevirebiliriz
		List<Ogrenci> filtrelenmisListe = ogrenciler.stream().filter(ogrenci -> ogrenci.getId() > 102)
				.collect(Collectors.toList());
		System.out.println("\n* * * *");
		filtrelenmisListe.stream().forEach(ogr -> System.out.println(ogr));

		System.out.println("\n* * * *");

		// map() metodu : map'leme işlemi ile yeni nesneler oluşturulur
		List<Ogrenci> mappedList = ogrenciler.stream().map(ogr -> new Ogrenci(ogr.getAd(), ogr.getId() * 100))
				.collect(Collectors.toList());
		mappedList.stream().forEach(ogr -> System.out.println(ogr));

		// Şimdi ise Map sınıfından bir nesne oluşturalım.
		System.out.println("\n* * * *");
		Map<Integer, String> ogrenciMap = ogrenciler.stream().collect(Collectors.toMap(ogr -> ogr.getId(), ogr -> ogr.getAd()));
		ogrenciMap.forEach((key,value)-> System.out.println(key +" -> "+ value ));
	
		System.out.println(ogrenciMap.containsKey(108));
		System.out.println(ogrenciMap.containsKey(103));
		
		String isim = ogrenciMap.get(103);
		System.out.println(isim);
	
	}

}
