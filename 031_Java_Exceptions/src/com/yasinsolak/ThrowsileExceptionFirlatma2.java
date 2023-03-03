package com.yasinsolak;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsileExceptionFirlatma2 {

	// Hiz değeri 120den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) throws SQLException {
		if (hiz > 120) {
			throw new SQLException(); // SQLException bir checked exception olduğu için metod başına throws yazmak
										// gerekir.
		} else {
			System.out.println("İyi yolculuklar");
		}
	}

	// Main metod başlığında throws ile exception atması , API olarak bizim kodumuzu
	// kullanacak kişinin yakalaması içindir.
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz : ");
		int hiz = sc.nextInt();

		// Throw ile atılan exceptionlarda try - catch yazmayabilrsiniz ama bu durumda
		// exception yenilenebilir.Program çöker

		hizKontrol(hiz);
	}
}
