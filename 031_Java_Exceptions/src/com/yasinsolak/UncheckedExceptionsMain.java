package com.yasinsolak;

public class UncheckedExceptionsMain {

	public static void main(String[] args) {
		/*
		 * Unchecked Exceptionlar programcının öngörmesi ve kontrol etmesi lazım. Java
		 * bu tazr exceptionlar üzerinde hata veya uyarı vermez. Bunlar runtime
		 * exception sınıfından ürerler.
		 */

		String s = null;

		try {
			System.out.println(s.length()); // --> NullPointerException hatası alırız.
		} catch (NullPointerException e) {
			System.out.println("Hata");
			// System.out.println(e.getMessage());
		}
		System.out.println("Son");
	}

}
