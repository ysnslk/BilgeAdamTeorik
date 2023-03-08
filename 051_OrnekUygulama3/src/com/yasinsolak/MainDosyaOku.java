package com.yasinsolak;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainDosyaOku {

	public static void main(String[] args) {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))) {

//			Otomobil otomobil1 = (Otomobil) input.readObject();
//			Otomobil otomobil2 = (Otomobil) input.readObject();
//			Otomobil otomobil3 = (Otomobil) input.readObject();
//			Otomobil otomobil4 = (Otomobil) input.readObject();

//			System.out.println(otomobil1);
//			System.out.println(otomobil2);
//			System.out.println(otomobil3);
//			System.out.println(otomobil4);
//			
//			System.out.println("Motor No : "+otomobil1.getMotor().getMotorNo());
//			System.out.println("Motor No : "+otomobil2.getMotor().getMotorNo());
//			System.out.println("Motor No : "+otomobil3.getMotor().getMotorNo());
//			System.out.println("Motor No : "+otomobil4.getMotor().getMotorNo());

			ArrayList<Otomobil> otoList = (ArrayList<Otomobil>) input.readObject();
			for (Otomobil otomobil : otoList) {
				System.out.println(otomobil);
				System.out.println("Motor no :" + otomobil.getMotor().getMotorNo());
			}

			ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) input.readObject();
			for (Ogrenci ogr : ogrenciList) {
				System.out.println(ogr);
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
