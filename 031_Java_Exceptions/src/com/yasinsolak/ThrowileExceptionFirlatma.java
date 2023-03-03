package com.yasinsolak;

import java.util.Scanner;

public class ThrowileExceptionFirlatma {

	// Hiz değeri 120den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) {
		if (hiz > 120) {
			throw new ArithmeticException();
		} else {
			System.out.println("İyi yolculuklar");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz : ");
		int hiz = sc.nextInt();

		// Throw ile atılan exceptionlarda try - catch yazmayabilrsiniz ama bu durumda
		// exception yenilenebilir.Program çöker

		try {
			hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsun. Yavaşla..!");
		}
	}

}
