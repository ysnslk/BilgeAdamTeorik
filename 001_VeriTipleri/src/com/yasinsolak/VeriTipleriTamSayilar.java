package com.yasinsolak;

public class VeriTipleriTamSayilar { // Pascal casing : MainProgram , MuhasebeProgram

	public static void main(String[] args) {
		// Scope: Kapsam

		System.out.println("Hello Java 1");
		System.out.println("Hello Java 2");
		System.out.println("Hello Java 3");
		System.out.println("Hello" + " " + "Java");

		// Değişken tanımlama ve İlkel Veri Tipleri
		byte byteValue; // 1 Byte
						// camelCasing
		
		byteValue = 2;
		System.out.println(byteValue); //Bir local değişkein ilk değer ataması olmaksızın kullanılmaz
		byte maxURLSayisi = 100; // camelCasing'e uygun

		byte ogrenciSayisi;// Dogru

		// Yanlış tanımlama
		// byte ogrenci Sayisi;
		// byte *ogrenciSayisi;
		// byte mğrenciSayısı;
		// byte 1ogrenciSayisi;
		byteValue = 1;
		System.out.println(byteValue);
		
		byteValue = 127;
		
		
		//SHORT : 2 Byte
		//2^15 ile 2^15-1
		//-32,768 ile 32767
		short shortValue = 22 ;
		short shortValue1 = 30 , shortValue2 = 244 , shortValue3 = 55;
		
		//Büyük ilkel veritip = küçük ilkel veriiti ,tersi yapılmaz
		
		shortValue = byteValue;
		System.out.println(shortValue);
		
		byteValue = (byte)shortValue; // (byte) : Casting işlemi
		System.out.println(byteValue);
		
		shortValue = 129; // 0000 0001 = 129 ama byte için -127 anlamını ifade eder
		byteValue = (byte)shortValue; // İşlem yanlış olur 
		System.out.println(byteValue); // Byte'ın alabileceği değer dışında veri alınmaz
		
		//int : 4 byte
		//2^31 		  ile  2^31-1
		//-2147483648 ile  2147483647 arasında değer alır
		System.out.println(Integer.MIN_VALUE); // Integer wrapper classlar
		System.out.println(Integer.MAX_VALUE);
		int intValue = 7;
		int i1,i2,i3;
		i1= 0;
		i2 =5;
		intValue = shortValue;
		//shortValue = intValue Yanlış
		
		//Byte Toplama
		byteValue = 12;
		byte b2;
		 b2 = (byte)(byteValue + byteValue); //Hata verir
		// Çünkü iki byte toplamını otomatik int e atar
		
		int x = 12;
		int y;
		y = x+x;
		
		short sh1 = 3;
		short sh2 =  2;
		short sh3;
		sh3 = (short)(sh1 + sh2); // Int e kadar bu tarz hatalar verir. İntten sonra vermez
		System.out.println("Sh3 : "+sh3);
		
		int x1 = 33;
		int x2 = 44;
		int x3;
		x3 = x1 + x2;
		
		
		//LONG : 8Byte
		//2^63 					ile 2^63-1
		//-9223372036854775808  ile 9223372036854775807
		System.out.println("\n"+ Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		long longValue = 7;
		System.out.println(longValue);
		
		//longValue = 9223372036854775807; // Bu şekilde sağ taraf int sınırı geçerse hata verir.
		longValue = 9223372036854775807L;
		
		//Şu tarz hatalarda olabilir
		//long myTimer = 922337203685477 *2 ;
		//Hatayı düzeltmek için L ekle
		long myTimer = 922337203685477L *2 ;
		
		//Şu tip hatalarda olabilr
		int carpan = 100000;
		long carpim = carpan * carpan;
		System.out.println("Çarpım : "+carpim); // Yanlış sonuç verir .SAğdakini int aldı .
		//Çözüm :
		//Çarpılan sayıların ilkine long eklenirse sağ taraf long olur
		carpim = 1L * carpan * carpan;
		System.out.println("Çarpım : " + carpim);
		
		//long altçizgi
		long p = 123_234_221L;
		System.out.println("x: "+p);
		

		
		
		
		
		
				
		
		
		
	}

}
