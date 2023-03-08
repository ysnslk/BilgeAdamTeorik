package com.yasinsolak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjeyiYaz {

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci("Ahmet", 1123, "Bilgisayar Müh");
		Ogrenci ogrenci2 = new Ogrenci("Zeynep", 1124, "Elektronik Müh");
		Ogrenci ogrenci3 = new Ogrenci("Fatma", 1125, "Maden Müh");
		Ogrenci ogrenci4 = new Ogrenci("Kaan", 1126, "Matematik Müh");
		Ogrenci ogrenci5 = new Ogrenci("Mert", 1127, "Bilgisayar Müh");

		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		ogrenciList.add(ogrenci4);
		ogrenciList.add(ogrenci5);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrencilerliste.bin"))) {
			
			out.writeObject(ogrenciList);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazılamadı...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen Hata...");
		}
		
		System.out.println("Arraylistin içindeki öğrenci nesneleri dosyaya yazıldı");

	}

}
