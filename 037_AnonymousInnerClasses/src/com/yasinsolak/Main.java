package com.yasinsolak;

public class Main {

	/*
	 * Java Ananoymous Inner Class : Sınıf ismi olmayan ve sadece 1 nesnesi olan
	 * sınıf türleridir.
	 * 
	 * 
	 * Ananoymous Inner Class'lar ne zaman faydalıdır ?
	 * 
	 * Bir sınıfın bir metodunu override edip TEK BİR NESNE oluşturmak istediğiniz
	 * zaman kullanılabilir.
	 */

	public static void main(String[] args) {

		// Anonymous Inner Class :
		Insan vejeteryanInsan = new Insan() {

			public void yemekYe() {
				System.out.println("Sadece sebze ve meyve yiyor...");
			}

		};

		vejeteryanInsan.yemekYe();
		vejeteryanInsan.suIc();

		Insan insan = new Insan();
		insan.yemekYe();

	}

}
