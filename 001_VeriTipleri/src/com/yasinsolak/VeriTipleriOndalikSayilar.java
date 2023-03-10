package com.yasinsolak;

public class VeriTipleriOndalikSayilar {

	public static void main(String[] args) {

		// float : 4 Byte
		// Precision (Noktadan sonraki hassasiyet : 7 decimal (ondalık ) digits
		// Bilimsel hesaplamalarda kullanırsanız veri kaybedebliirsiniz
		// Fizikçiler veya kimyacılar atomla molekülle uğraşanlar kullanmaz
		float floatValue = 1.2F;
		System.out.println("FloatValue : " + floatValue);
		System.out.println("Float Min :" + Float.MIN_VALUE);
		System.out.println("Float Max :" + Float.MAX_VALUE);

		floatValue = 22;
		System.out.println(floatValue);
		floatValue = 22.4f; // Ondalıkta sağ tarafı double tutar.

		// Double : 8 Byte
		// Precision (Noktadan sonraki hassasiyet : 15 decimal (ondalık ) digits
		double doubleValue = 1.2;
		doubleValue = 13236565656.3256487954789658;
		System.out.println("Double Min : " + Double.MIN_VALUE);
		System.out.println("Double Max : " + Double.MAX_VALUE);

		doubleValue = 2345.55778;
		doubleValue = 12.334e8;
		System.out.println(doubleValue);

		// Örnek
		doubleValue = 23.123456789;
		floatValue = (float) doubleValue;
		System.out.println(floatValue);

		floatValue = 1.1234567f;
		System.out.println(floatValue);
		
//		String kusuratliSayi = String.format("Sayı: %.2F", floatValue);
//		System.out.println(kusuratliSayi);

		
		final double PI = 3.14; // Başında final varsa değişken olmaz sabit olur
		final int maxOgrenciSayisi = 24;
		System.out.println(maxOgrenciSayisi);
		

	}

}
