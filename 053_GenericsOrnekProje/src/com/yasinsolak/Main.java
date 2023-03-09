package com.yasinsolak;

public class Main {

	// Generic Metodlar

	public static <E> void myGenericMethod(E[] array) {
		// Bu metod arrayin içindeki şekillerin toplam alanını hesaplasın..
		System.out.println("\n--------------\n");
		int toplam = 0;
		for (E obj : array) {
			Sekil objSekil = (Sekil) obj;
			if (objSekil != null) {
				toplam += objSekil.alanHesapla();
			}
		}
		System.out.println("Arrayin Toplam Alanı  : " + toplam);
	}

	public static void main(String[] args) {
		GeometrikAlan<DikUcgen, Kare> alan1 = new GeometrikAlan<DikUcgen, Kare>(new DikUcgen(10, 10), new Kare(5));
		System.out.println("Alan1 alan : " + alan1.geometricSeklinAlaniniHesapla());

		GeometrikAlan<Dikdortgen, DikUcgen> alan2 = new GeometrikAlan<Dikdortgen, DikUcgen>(new Dikdortgen(8, 5),
				new DikUcgen(4, 12));
		System.out.println("Alan2 alan : " + alan2.geometricSeklinAlaniniHesapla());

		GeometrikAlan<Kare, Kare> alan3 = new GeometrikAlan<Kare, Kare>(new Kare(7), new Kare(3));
		System.out.println("Alan3 alan : " + alan3.geometricSeklinAlaniniHesapla());

		GeometrikAlan<Circle, Kare> alan4 = new GeometrikAlan<Circle, Kare>(new Circle(10), new Kare(5));
		System.out.println("Alan4 alan : " + alan4.geometricSeklinAlaniniHesapla());

		System.out.println();

		Kare[] kareArray = new Kare[3]; // {null,null,null}

		kareArray[0] = new Kare(3);
		kareArray[1] = new Kare(4);
		kareArray[2] = new Kare(5);

		myGenericMethod(kareArray);

		Dikdortgen[] darr = new Dikdortgen[3];
		darr[0] = new Dikdortgen(3, 4);
		darr[1] = new Dikdortgen(4, 5);
		darr[2] = new Dikdortgen(5, 7);

		myGenericMethod(darr);

		// Soru :

		// İçinde 1 dikdörtgen 1 Kare 1 Dikucgen neslerin olan bir array oluşturun
		// arraye gönder

		Sekil[] sekilArray = new Sekil[3];
		sekilArray[0] = new Dikdortgen(3, 4);
		sekilArray[1] = new Kare(5);
		sekilArray[2] = new DikUcgen(4, 5);
		
		myGenericMethod(sekilArray);

	}

}
