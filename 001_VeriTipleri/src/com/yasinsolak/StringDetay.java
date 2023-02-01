package com.yasinsolak;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {
//		String metin = "Merhaba Nasılsın?";
//		Scanner sc = new Scanner(System.in);
//		metin = sc.nextLine();
//		System.out.println(metin);

		//  0   1   2   3   4   5   6   7   8
		//{'B','u','g','u','n',' ','J','a','v','a',' ','i','l','e',..,'z'} --> Char dizisi Array
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		String tekharf ="s"; //char[] dizi => {'a'} => Java bunu 1 elemanlı char olarak kaydeder
		
		
		//String en çok kullanılan metodları :
		
		//lenght metodu ;
		
		//metin.lenght() => metin uzunluğunu int cinsinden verir
		
		int uzunluk = metin.length();
		
		System.out.println(uzunluk);
		
		
		//charAt metodu ;
		//Belirli bir indexteki karakteri döner
		
		System.out.println("0. index karakter : "+ metin.charAt(0));
		System.out.println("2. index karakter : "+ metin.charAt(2));
		
		//Peki bu metnin uzunluğu kaçtı ? 42 
		//En sonuncu karaktere nasıl erişeceğiz.
		//System.out.println("42. index karakter : "+ metin.charAt(42));
		//Hata alırsınız
		System.out.println("Son karakter : "+ metin.charAt(41));// => Doğru
		System.out.println("Son karakter : "+ metin.charAt(metin.length()-1));
		
		
		//indexOf metodu :
		//Find the index
		//s harfi ilk nerede geçiyor ?
		
		
		System.out.println("s harfi ilk nerede geçiyor ? : "+ metin.indexOf("s"));
		System.out.println("B harfi ilk nerede geçiyor ? : "+ metin.indexOf("B"));
		System.out.println("b harfi ilk nerede geçiyor ? : "+ metin.indexOf("b"));
		
		
		//Birden fazla harf arama
		//Java keilmesi ilk nerde geçiyor
		System.out.println("Java keilmesi ilk nerde geçiyor? : "+ metin.indexOf("Java"));
		
		
		
		
		
	}

}