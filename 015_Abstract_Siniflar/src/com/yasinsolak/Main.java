package com.yasinsolak;

public class Main {

	public static void hayvani2KezBesle(Hayvan h) {
		h.yemekYe();
		h.yemekYe();
	}

	/*
	 * Şimdiye kadar gördüğümüz sınıflar concrete yani somut sınıflar.
	 * Abstractsınıflar ise soyut sınıflardır. Abstract bir sınıftan new ile
	 * nesne(object) oluşturamazsınız.
	 */

	public static void main(String[] args) {

		// Aşağıdaki örnekte görüldüğü üzere abstract bir sınıftan nesne oluşturulamaz.
		// Hayvan h = new Hayvan();
		// h.sesCikar();
		Hayvan h = new Kedi("Tekir", 3, 35);
		h.sesCikar();
		h.yemekYe();

		Kus kus = new Kus("Birdy", 1, 12);
		kus.yemekYe();
		System.out.println(" ");
		Main.hayvani2KezBesle(kus);
		Main.hayvani2KezBesle(new Kopek("Tony", 5, 57));

		// Advanced konu : Casting
		// nesnenin önüne parantez koayarak istediğimiz sınıfa cast ederiz.Ancak dikkat
		// etmeliyiz.
		// Cast işleminde sorumluluk yazılımcıya ait.
		((Kedi) h).sutIc();

		Hayvan h2 = new Kopek("Lassie", 8, 77);
		// ((Kedi) h2).sutIc(); => Hata verir . h2köpek sınıfıdan nesne

	}

}
