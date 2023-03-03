package com.yasinsolak;

import java.util.Scanner;

public class Main {
	public static void hizKontrol(int hiz) throws AsiriHizException {
		if (hiz > 150) {
			throw new AsiriHizException("Çoook Aşırı hız yapılmak isteniyor");
		} else if (hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor");
		} else {
			System.out.println("İyi yolculuklar...");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz : ");
		int hiz = sc.nextInt();

		try {
			hizKontrol(hiz);
		} catch (AsiriHizException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
