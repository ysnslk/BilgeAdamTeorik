package com.yasinsolak;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 4. Bölüm
		// Birden çok exception yakalama

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bölen giriniz : ");
		int bolen = sc.nextInt();
		String s = null;

		try {
			int sayi = 25 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[0]);
			System.out.println(s.length());
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
