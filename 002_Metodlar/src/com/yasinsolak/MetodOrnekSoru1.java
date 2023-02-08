package com.yasinsolak;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MetodOrnekSoru1 {

	private static void randomNumber7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Üst limiti belirleyin");
		int ustLimit = sc.nextInt();
		
		Random rnd = new Random();
		
		for(int i = 0 ;i<10;) {
			int sayi = rnd.nextInt(7,ustLimit);
			if(sayi%7==0) {
				
				System.out.println((i+1) +". Sayı : "+sayi);
				i++;
			}
		}
	}
	public static void main(String[] args) {
		//Rastgele 7nin katı olan 10 tane tamsayı üreten ekrana yazdıran sayı
		//üst limiti kullanıcıdan al
		
		randomNumber7();

	}

	

}
