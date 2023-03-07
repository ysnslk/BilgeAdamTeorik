package com.yasinsolak;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOgrenci {

	public static void main(String[] args) {
		List<Ogrenci> ogrenciList = new ArrayList<>();
		// Scanner sınıfı Closable interfacesini implement ettiği için
		// try-with-resources kalıbı ile kullanılabilir.
		// (+ Scanner bir InputStream ile çalıştığı için tabiki)
		try (Scanner sc = new Scanner(new FileReader("liste.txt"))) {

			// Tüm satırları nasıl okuruz
			while (sc.hasNextLine()) {

				String okunanSatir = sc.nextLine();
				String[] array = okunanSatir.split(","); // Ali Kaya, 111 => array[0] = "Ali Kaya" array[1] = " 111"
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));
				ogrenciList.add(ogrenci);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı..!");
			e.printStackTrace();
		}

		for (Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}
	}
}
