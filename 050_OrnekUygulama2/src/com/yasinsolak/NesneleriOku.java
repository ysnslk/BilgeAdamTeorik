package com.yasinsolak;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneleriOku {

	public static void main(String[] args) {

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))) {

			Otomobil oto = null;
			while ((oto = (Otomobil) input.readObject()) != null) {
				if(oto !=null) {
					System.out.println(oto);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı...");
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Dosya Sonu...");
		} catch (ClassNotFoundException e) {
			System.out.println("Serialization Hatası...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu...");
		}
		System.out.println("Hoşçakalın...");

	}
}
