package com.yasinsolak;

public class ForEachKullanimi {

	public static void main(String[] args) {
		int[] dizi = { 1, 24, 35, 55, 78, 83, 39 };
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();

		// Foreach döngüsü
		// Köşeli parantez kullanılmadan yapılır

		for (int sayi : dizi) {
			System.out.println(sayi + " ");
		}

		// Örnek 2:

		String[] isimlerDizi = { "Ali", "Veli", "Osman", "Zeynep" };
		for(String isim:isimlerDizi) {
			System.out.println(isim);
		}
	}

}
