package com.yasinsolak;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner2 {

	public static void main(String[] args) {
		//kullanıcıdan metinsel input/girdi almak:
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen adınızı yazın: ");
		String isim;
		isim = sc.nextLine();
		System.out.println("Lütfen Soyadınızı yazın: ");
		String soyisim;
		soyisim = sc.nextLine();
		
		System.out.println("Yaşınızı girin:");
		int yas;
		yas = sc.nextInt();
		sc.nextLine();
		//DİKKAT 
		//nextInt() 'den sonra eğer kullanıcıdan String değer alacaksanız 
		//Araya bir boş nextLine() satırı yazın.
		
		System.out.println("Lütfen yaşadığınız şehri yazınız: ");
		String sehir = sc.nextLine();
		System.out.println("İsminiz : "+isim+ " Soyadınız : "+soyisim+ " Yaşınız : "+yas+ " Şehriniz : "+sehir);
		
		
		//String'den int'e çevirmek için ilgili veri tipinin wrapper 
		//class'ı kullanılır:
		
		String yas2 = "30";
		int yasIntValue = Integer.valueOf(yas2);
		System.out.println(yas2);
		System.out.println(yasIntValue);
		
		
		
		
	}

}
