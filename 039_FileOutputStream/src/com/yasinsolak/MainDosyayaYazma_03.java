package com.yasinsolak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_03 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		// Dosyayı açmak için
		// 2. yol : fileOutputStream içine paramtre olarak string
		try {
			fileOutputStream = new FileOutputStream("dosya.txt", true); // Dosya mevcutsa içeriğini silmez ekleme yapar
			// fileOutputStream = new FileOutputStream("C:\\test3\\dosya.txt");

			fileOutputStream.write(67); // C
			fileOutputStream.write(79); // O
			fileOutputStream.write(68); // D
			fileOutputStream.write(69); // E
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Dosya/dizin bulunamadı");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Dosyaya yazma hatası");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu");
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Dosya kapatılması sırasında bir hata oluştu.");
			}
		}
		System.out.println("Hoşçakalın");
	}

}
