package com.yasinsolak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {

	public static void main(String[] args) {
		ArrayList<Ogrenci> ogr = null;
try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrencilerliste.bin"))) {
			ogr = (ArrayList<Ogrenci>) in.readObject();
			
			for (Ogrenci o : ogr) {
				System.out.println(o);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazılamadı...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen Hata...");
			e.printStackTrace();
		}
		
		System.out.println("Arraylistin içindeki öğrenci nesneleri dosyadan okundu");


	}

}
