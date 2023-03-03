package com.yasinsolak;

import java.util.Scanner;

public class Main1 {

//	Try - Catch Kod bloğu
//	try {
//
//	} catch (Exception e) {
//		// TODO: handle exception
//	}

	public static void main(String[] args) {
		// 1. Bölüm
		// int y = 25 / 0;

		try {
			int y = 25 / 0;
		} catch (Exception e) {
			System.out.println("Sıfıra bölme hatası");
		}

		try {
			int y = 25 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException : Sıfıra bölme hatası");
		}

		// 2. Bölüm

		System.out.println();
		int[] arr = { 1, 2, 3, 4 };
		try {
			System.out.println(arr[4]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Arrayin sınırı dışına çıkılma hatası");
			// Log dosyasına veya veritabanındaki log tablosuna kayıt atılır
			e.printStackTrace();
		}
		System.out.println("Hoşçakal");

		// 3. Bölüm
		// Birden çok exception yakalama

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bölen giriniz : ");
		int bolen = sc.nextInt();

		try {
			int sayi = 25 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayin sınırları dışına çıkılıyor");
		} catch (ArithmeticException e) {
			System.out.println("0  a bölme hatası");
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu!!");
		}
		System.out.println("\nBye.....");
	}

}
