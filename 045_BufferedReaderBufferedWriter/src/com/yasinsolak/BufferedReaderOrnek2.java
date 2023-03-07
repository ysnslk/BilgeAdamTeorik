package com.yasinsolak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BufferedReaderOrnek2 {

	public static void main(String[] args) {
		List<Ogrenci> ogrenciList = new ArrayList<>();

		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("liste.txt")))) {

			// sc.hasNextLine() => Okunacak satır kaldı ise true olur. Aksi halde false olur
			while (sc.hasNextLine()) {
				String okunanSatir = sc.nextLine();
				String[] array = okunanSatir.split(","); // Ali Kaya, 111 => array[0] = "Ali Kaya" array[1] = " 111"
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));
				ogrenciList.add(ogrenci);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		}
		
		for (Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}

	}

}
