package com.yasinsolak;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsileExceptionFirlatma {

	// Hiz değeri 120den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) throws SQLException {
		if (hiz > 120) {
			throw new SQLException(); //SQLException bir checked exception olduğu için metod başına throws yazmak gerekir.
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Çok hızlı gidiyorsun");
		}
	}
}
