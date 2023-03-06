package com.yasinsolak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_02 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		// Dosyayı açmak için
		// 2. yol : fileOutputStream içine paramtre olarak string
		try {
			fileOutputStream = new FileOutputStream("dosya.txt");
			// fileOutputStream = new FileOutputStream("C:\\test3\\dosya.txt");

			fileOutputStream.write(74); // J
			fileOutputStream.write(65); // A
			fileOutputStream.write(86); // V
			fileOutputStream.write(65); // A
			fileOutputStream.write(10); // ALT SATIRA GEÇMEK
			fileOutputStream.write(72); // H
			fileOutputStream.write(73); // I
			fileOutputStream.write(10); // ALT SATIRA GEÇMEK
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
