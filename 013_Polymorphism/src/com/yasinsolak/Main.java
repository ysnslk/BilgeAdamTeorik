package com.yasinsolak;

public class Main {

	// Polymorphism
	
	//bir nesnenin referansının farklı nesneler gibi davranabilmesidir.
	
	public static void yeniMaasiHesapla(Personel personel) {

		System.out.println(personel.getZamKatsayisi() * personel.getMaas());
	}

//	public static void yeniMaasiHesapla(Muhendis muhendis) {
//
//		System.out.println(muhendis.getZamKatsayisi() * muhendis.getMaas());
//	}
//	
//	public static void yeniMaasiHesapla(Sekreter sekreter) {
//
//		System.out.println(sekreter.getZamKatsayisi() * sekreter.getMaas());
//	}
//	
//	public static void yeniMaasiHesapla(Mudur mudur ) {
//
//		System.out.println(mudur.getZamKatsayisi() * mudur.getMaas());
//	}
//	
//	public static void yeniMaasiHesapla(DaireBaskani daireBaskani ) {
//
//		System.out.println(daireBaskani.getZamKatsayisi() * daireBaskani.getMaas());
//	}
//	
//	public static void yeniMaasiHesapla(IdariMemur idariMemur ) {
//
//		System.out.println(idariMemur.getZamKatsayisi() * idariMemur.getMaas());
//	}

	public static void main(String[] args) {

		Muhendis m = new Muhendis("Ali", "Emre", "12345678912", 42, 32000, 3, 5522498L, "Yazılım Müh");
		Main.yeniMaasiHesapla(m);
		
		Sekreter s = new Sekreter("Zeynep","Taş","222",25,12000,7,5425587453L,111,222);
		Main.yeniMaasiHesapla(s);

	}
}
