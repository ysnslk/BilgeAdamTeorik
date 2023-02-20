package com.yasinsolak;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// 1. OtoGaleri nesnesi
		OtoGaleri kardeslerOtoGaleri = new OtoGaleri("Kardeşler Oto Galeri", 5);
		
		Otomobil otomobil1 = new Otomobil("Opel", "Corsa", 2018, 12400, new Motor(1000, "AS1254", 7), 40);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil1);

		Otomobil otomobil2 = new Otomobil("Opel", "Astra", 2019, 10400, new Motor(1400, "AB15234", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil2);
		
		Otomobil otomobil3 = new Otomobil("Audi", "A2", 2019, 10400, new Motor(1400, "AB15234", 8), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil3);

		Otomobil otomobil4 = new Otomobil("Audi", "Q3", 2018, 10400, new Motor(1500, "AB15234", 10), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil4);
		
		Otomobil otomobil5 = new Otomobil("BMW", "3.20", 2020, 10400, new Motor(1800, "AB15234", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil5);
		
		Otomobil otomobil6 = new Otomobil("BMW", "6.20", 2020, 10400, new Motor(1800, "AB15234", 9), 50);
		kardeslerOtoGaleri.galeriyeOtomobilEkle(otomobil6);

		kardeslerOtoGaleri.galeridekiOtomobilleriListele();
		System.out.println("Galerideki anlık oto sayısı : "+kardeslerOtoGaleri.getGaleridekiOtomobilSayisi()+"\n\n");
	
	
	
		OtoGaleri galeriSuperCar = new OtoGaleri("Galeri Super Car", 100);
		
		Otomobil otomobil7 = new Otomobil("Fiat", "Aegea", 2017, 188000, new Motor(1400, "AVB15234", 10), 45);
		Otomobil otomobil8 = new Otomobil("Renault", "Clio", 2018, 134000, new Motor(1200, "MVB15234", 8), 40);
		galeriSuperCar.galeriyeOtomobilEkle(otomobil7);
		galeriSuperCar.galeridekiOtomobilleriListele();
		galeriSuperCar.galeriyeOtomobilEkle(otomobil8);
		galeriSuperCar.galeridekiOtomobilleriListele();
		
		//findCount()
		System.out.println();
		System.out.println(kardeslerOtoGaleri.getGaleriAdi()+" galerisindeki Audi Sayısı : "+kardeslerOtoGaleri.findCout("audi"));
		System.out.println(kardeslerOtoGaleri.getGaleriAdi()+" galerisindeki BMW Sayısı : "+kardeslerOtoGaleri.findCout("bmw"));
		System.out.println(galeriSuperCar.getGaleriAdi()+" galerisindeki Renault Sayısı : "+galeriSuperCar.findCout("Renault"));
	
		Otomobil otomobil9 = new Otomobil("Renault", "Megane", 2019, 134000, new Motor(1200, "MVB15234", 8), 60);
		galeriSuperCar.galeriyeOtomobilEkle(otomobil9);
		System.out.println(galeriSuperCar.getGaleriAdi()+" galerisindeki Renault Sayısı : "+galeriSuperCar.findCout("Renault"));
	
		
		//Search
		System.out.println("********  Search - Kardeşler Oto Galeri********s");
		Otomobil[] sonuclarDizisi = kardeslerOtoGaleri.search("audi");
		for (int i = 0; i < sonuclarDizisi.length; i++) {
			System.out.println(sonuclarDizisi[i]);
		}
		
		
		System.out.println("********  Search - SuperCars Oto Galeri********");
		Otomobil[] sonuclarDizisi2 = galeriSuperCar.search("renault");
		for (int i = 0; i < sonuclarDizisi2.length; i++) {
			System.out.println(sonuclarDizisi2[i]);
		}
		
		//Silme işlemi
		System.out.println("\n\n ****** Silme İşlemi ****** \n\n");
		galeriSuperCar.galeridenOtomobilSil(1);
		galeriSuperCar.galeridekiOtomobilleriListele();
		
		
		
		
	
	}

}
