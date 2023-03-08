package com.yasinsolak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NesneyiSerilestirDosyayaYazMain {

	public static void main(String[] args) {

		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))) {

			Otomobil oto1 = new Otomobil("Opel", "Astra", 2017);
			Otomobil oto2 = new Otomobil("Audi", "A3", 2018);
			Otomobil oto3 = new Otomobil("BMW", "1.18", 2015);
			Otomobil oto4 = new Otomobil("Renault", "Clio", 2015);

			outStream.writeObject(oto1); // Java gönderdiğimiz otomobil objesini
			outStream.writeObject(oto2); // Object sınıfından bir nesneyedönüştürecek
			outStream.writeObject(oto3); // Sonra bunu byte dizisi olarak otomobil.bin e yazıdırır.
			outStream.writeObject(oto4);
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya yazma hatası...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu...");
		}
		System.out.println("Serilization process completed...");
	}
}
