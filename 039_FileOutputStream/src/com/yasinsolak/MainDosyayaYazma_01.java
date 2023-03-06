package com.yasinsolak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_01 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;

		// Dosyayı açmak için
		// 1. yol : Açacağımız dosyayı bir file nesnesi olarak oluşturabliriz.
		File file = new File("dosya.txt");
		try {
			fileOutputStream = new FileOutputStream(file);

			fileOutputStream.write(74);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hoşçakalın");
	}

}
