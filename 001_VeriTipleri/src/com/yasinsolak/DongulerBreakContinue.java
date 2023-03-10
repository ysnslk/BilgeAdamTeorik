package com.yasinsolak;

public class DongulerBreakContinue {

	public static void main(String[] args) {
		/*
		 * break : Döngünün akışını durdurur ve } sonrasındaki koda gider.
		 */

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Hoşçakalın.. \n");

		/*
		 * continue : Döngünün dışına çıkartmaz ama bir sonraki indexe devam ettirir.
		 */

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("******************************");

		int s = 0; // S = 6 iken ekrana 7 yi yazdırdı
		while (s < 10) {
			if (s == 7) {
				break;
			}
			s++;
			System.out.println(s);
		}

	}

}
