package com.yasinsolak.ThreadsizListeYazici;

public class Main {

	public static void main(String[] args) {
		ThreadsizListeYazici threadsizListeYazici = new ThreadsizListeYazici();
		long baslangic = System.currentTimeMillis();
		threadsizListeYazici.listelereDegerEkle();
		long bitis = System.currentTimeMillis();
		System.out.println("Geçen süre : "+(bitis-baslangic));

	}

}
