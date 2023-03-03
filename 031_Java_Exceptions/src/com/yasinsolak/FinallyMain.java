package com.yasinsolak;

public class FinallyMain {

	/*
	 * Finally bloğu içindeki kodlarınız try catch statementların sonunda mutlaka
	 * çalışır.
	 */

	public static void main(String[] args) {
		try {
			int x = 5 / 0;
		} catch (Exception e) {
			System.out.println("Bir exception oluştu!");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır.");
		}
		System.out.println("Bye1....");

		try {
			int x = 5 / 1;
		} catch (Exception e) {
			System.out.println("Bir exception oluştu!");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır.");
		}
		System.out.println("Bye2....");

		try {
			int y = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Aldık");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır.");
			//connection.close();
		}
		System.out.println("Bye3....");

		/*
		 * Finally kullanımı Dosya kapama , veritabanı bağlantısı kapama , açık bir
		 * network soketini kapama gibi işlemler mutlaka finally içinde yapılır.
		 */
	}

}
