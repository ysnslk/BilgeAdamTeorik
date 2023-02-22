package com.yasinsolak;

public class Main {

	// INHERITANCE
	/*
	 * Bir sınıfın üst sınıftan üye özellikleri ve metodları miras almasına denir.
	 * Miraz aldığı zaman alt sınıf üst sınıfın özelliklerini tıpkı
	 * kendisindeymişcesine kullanabilir. Alt sınıf türetmek hiyerarşik yapıda olur.
	 * Bir alt sınıfın türeltildiği sınıf, o alt sınıfın üst sınıfı olur. Javada bir
	 * alt sınıfın ancak bir üst sınıfı olabilir.(Diğer dillerde bu farklılık
	 * gösterir.) Üst sınıfıa ata(parent), alt sınıfa ise çocuk (child ve ya sub
	 * class ) denir.
	 */

	public static void main(String[] args) {
//		
//		Muhendis muhendis1 = new Muhendis();
//		muhendis1.setAd("Ali");
//		muhendis1.setSoyad("Özkan");
//		muhendis1.setTckimlik("12345678912");
//		muhendis1.setUzmanlikAlani("Elek Elek Müh");
//		System.out.println(muhendis1.getAd() +" "+muhendis1.getSoyad()+" "+muhendis1.getUzmanlikAlani());
//
//		IdariMemur idariMemur1 = new IdariMemur();
//		idariMemur1.setAd("Zeynep");
//		idariMemur1.setSoyad("Kaya");
//		idariMemur1.setGörevi("D. Başk. Sek");
//		idariMemur1.setCepTelNo(5014568795L);
//		System.out.println(idariMemur1.getAd()+" "+idariMemur1.getSoyad()+" "+idariMemur1.getCepTelNo());

//		Muhendis muhendis2 = new Muhendis();
//		muhendis2.setAd("Ahmet");
//		muhendis2.setSoyad("Çalışkan");
//		muhendis2.setUzmanlikAlani("Makine Mühendisi");
//		System.out.println(muhendis2.getAd() + " " + muhendis2.getSoyad() + " " + muhendis2.getUzmanlikAlani());

		Muhendis m = new Muhendis();
		
		Sekreter s = new Sekreter(5362145689L);
		
	
	
	}

}
