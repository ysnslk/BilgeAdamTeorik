package com.yasinsolak;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayi giriniz");
		int x = input.nextInt();
		// Kullanıcın girdiği sayının pozitif , negatif veya 0 olduğıunu bulan kod
		if (x > 0) {
			System.out.println("Girilien Sayı Pozitiftir");
		} 
		else if (x < 0) {
			System.out.println("Girilien Sayı Negatiftir");
		} 
		else if(x==0){
			System.out.println("Girilien Sayı Nötr");
		}
		System.out.println("Hoşçakalın");
	}

}
