package com.yasinsolak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainDosyaYaz {

	public static void main(String[] args) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))) {

			Otomobil oto1 = new Otomobil("Renault", "Clio", 2011);
			Otomobil oto2 = new Otomobil("Audi", "R", 2021);
			Otomobil oto3 = new Otomobil("Mercedes", "C180", 2018);
			Otomobil oto4 = new Otomobil("Renault", "Clio", 2019);

			Motor m1 = new Motor(1111);
			oto1.setMotor(m1);

			Motor m2 = new Motor(2222);
			oto2.setMotor(m2);

			Motor m3 = new Motor(3333);
			oto3.setMotor(m3);

			Motor m4 = new Motor(4444);
			oto4.setMotor(m4);

//			out.writeObject(oto1);
//			out.writeObject(oto2);
//			out.writeObject(oto3);
//			out.writeObject(oto4);

			// Otomobil nesnelerini arrayliste attık.
			ArrayList<Otomobil> otoList = new ArrayList<>();
			otoList.add(oto1);
			otoList.add(oto2);
			otoList.add(oto3);
			otoList.add(oto4);
			out.writeObject(otoList);

			// Bir de öğrenci sınıfıdan oluşan bir arraylist yapıp serialize edelim
			Ogrenci ogr1 = new Ogrenci("Ali Kaya", 101, "Maden Müh");
			Ogrenci ogr2 = new Ogrenci("Zeynep Taş", 105, "Gıda Müh");
			Ogrenci ogr3 = new Ogrenci("Mehmet Şeker", 108, "Mat Müh");

			ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
			ogrenciList.add(ogr1);
			ogrenciList.add(ogr2);
			ogrenciList.add(ogr3);
			out.writeObject(ogrenciList);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya yazma Hatası...");
			e.printStackTrace();
		}
		System.out.println("Yazma işlemi tamamlandı...");
	}

}
