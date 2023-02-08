package com.yasinsolak;

public class MetodOrnekleri2 {

	// Bir tamsayı dizisi içindeki sayıları toplayıp return eden metod
	private static int diziTopla(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			// toplam = toplam + dizi[i];
			toplam += dizi[i];

		}
		return toplam;
	}

	private static void arrayIlkElemaniDegistir(int[]dizi) {
		if(dizi.length != 0) {
			dizi[0] = 100;
		}
	}
	
	private static void test(int sayi) {
		sayi = 200;
	}
	private static int test2(int sayi) {
		sayi = 300;
		return sayi;
	}
	
	
	
	public static void main(String[] args) {

		int[] array1 = { 5, 10, 15, 20,25 };
		System.out.println(diziTopla(array1));

		
		int[]array2 = { 8};
		System.out.println(diziTopla(array2));
		
		//Arrayler parametre olarak gönderilirse array içeriğine bir referans 
		//gider  , içeri kopyalanmaz
		
		arrayIlkElemaniDegistir(array1);
		System.out.println(array1[0]);
		System.out.println();
		//Değişkenlerde durum farklı, ilkel tipler parametre olarak gider 
		//içerik kopyalanır , referans gitmez
		int sayi = 1;
		test(sayi);
		System.out.println(sayi);
		
		System.out.println(test2(sayi)); //Ekrana 300 yazar
		sayi = test2(sayi);
		System.out.println("Sayi : "+sayi);//Ekrana 300 yazar
	}

}
