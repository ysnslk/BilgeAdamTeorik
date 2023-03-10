package com.yasinsolak;

public class Main {

	public static void main(String[] args) {

		SporMerkeziUye kaan = new SporMerkeziUye(1, "Kaan Çakmak", 70);
		kaan.sporYap("koşu", 10);
		kaan.sporYap("mekik", 2);
		kaan.sporYap("ipatlama", 30);
		kaan.sporYap("koşu", 30);
		System.out.println(kaan.getAdSoyad()+" "+kaan.getToplamHarcananKalori());
	
		System.out.println();
		
		SporMerkeziUye zeynep = new SporMerkeziUye(2, "Zeynep Kaya", 50);
		zeynep.sporYap("mekik", 1);
		zeynep.sporYap("ipatlama", 40);
		zeynep.sporYap("koşu", 45);
		zeynep.sporYap("şınav", 1);
		System.out.println(zeynep.getAdSoyad()+" "+zeynep.getToplamHarcananKalori());
		
		kaan.tumSportKayitlariniGoster();
		zeynep.tumSportKayitlariniGoster();
	}

}
