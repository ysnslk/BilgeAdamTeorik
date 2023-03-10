package com.yasinsolak;

import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {
		
		/*If gibi bir koşul var
		 * Bu koşul sağlanırsa döngü çalışır
		 * while (koşul) {
			//Kodlar...
		}
		 */
		
		/*
		 * For döngüsünden farkı
		 * Koşul içindeki kod parçasında koşulun devam edip etmemesi 
		 * durumunu değiştirebilrsin.
		 */
//		
//		int sayi = 1;
//		while (sayi<5) {
//			System.out.println(sayi);
//			sayi++;
//		}
		
		//Döngünün devam edip etmem durumu döngü içinde kod metninde
		//değişecekse "while" veya "do while" kullanın 
		//Yoksa döngünüz belirli sayıda dönecekse for kullanın
		
		//Kullanıcı 0 a basana kadar kullanıcının girdiği sayının karesini 
		//hesaplayıp ekrana yazdıran kod.0 ise çıkış olsun
		//Scanner sc = new Scanner(System.in);
		
//		int rakam=1;
//		while (rakam != 0) {
//			System.out.println(rakam +"'ın karesi : "+rakam*rakam);
//			rakam = sc.nextInt();
//		}
//		System.err.println("Çıkış");
//		Scanner sc = new Scanner(System.in);
//		int rakam=0;
//		while((rakam = sc.nextInt())!= 0){
//			System.out.println(rakam +"'ın karesi : "+rakam*rakam);
//			rakam = sc.nextInt();
//		}
//		System.err.println("Çıkış");
		
		
		
		/*
		 * Do While Döngüsü
		 * Do-While içindeki kısım en az 1 kere mutlaka çalışır
		 * Daha sonra koşula göre çalışır.
		 * do {
			//Kodlar...
		} while (koşul);
		
		 */
		
		int sayac = 0;
		do {
			System.out.println(sayac);
			sayac++;
		} while (sayac<5);
		
		
		//Aşağıdaki soruyu do while ile yapınız :
		//Kullanıcı 0 a basana kadar kullanıcının girdiği sayının karesini 
		//hesaplayıp ekrana yazdıran kod.0 ise çıkış olsun
		Scanner sc = new Scanner(System.in);
		int n ;
	    do {
			System.out.println("Bir sayı giriniz");
			n=sc.nextInt();
			if(n == 0) {
				break;
			}
			System.out.println(n+ "' nin karesi : "+ n*n);
		
		} while (n != 0);
	    System.err.println("ÇIKIŞ Do While");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
