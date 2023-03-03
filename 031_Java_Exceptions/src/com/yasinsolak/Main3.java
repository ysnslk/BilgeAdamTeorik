package com.yasinsolak;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bölen giriniz : ");
		int bolen = sc.nextInt();

		try {
			int sayi = 25 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[7]);
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu!!");
			System.out.println(e.getMessage());
		}
		System.out.println("\nBye.....");

	}

}
