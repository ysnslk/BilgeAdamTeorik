package com.yasinsolak;

import java.util.Scanner;

public class DiziOrnekleri2 {

	public static void main(String[] args) {
		//Soru
		//Kullanıcı bir sayı girsin. Bu sayının binary
		//olup olmadığını bulan program
		
		//Örnek
		//10101 =>Binary
		//123 => Binary değil
		
		System.out.println("Lütfen bir sayı giriniz : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String temp = String.valueOf(num);
		boolean  sayiBinaryMi = true;
		for(int i=0;i<temp.length();i++) {
			char rakam  = temp.charAt(i);
			if(rakam =='0' || rakam =='1') {
				//Hiçbirşey yapma
			}
			else {
				sayiBinaryMi = false;
				break;
			}
		}
		if(sayiBinaryMi == true) { // => if(sayiBinaryMi)
			System.out.println("Girdiğiniz sayı binary "+ num);
		}
		else {
			System.out.println("Girdiğiniz sayı binary değil "+ num);
		}

	}

}
