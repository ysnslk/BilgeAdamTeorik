package com.yasinsolak;

public class DizilerMultiDimensional {

	public static void main(String[] args) {
		
		
		int[] tekBoyutluDizi = new int[4]; //{0,0,0,0}
		
		
		//Çok boyutlu dizi(matris)
		
		int[][] cokBoyutluDizi = new int[2][3]; //Satır Sütün
		
		//2. Yöntem 
		int cokBoyutluDizi2[][]= { {1,2,3},{4,5,6}};
		
		int cokBoyutluDizi3[][]= { {1,2,3},{4,5,6},{7,8,9}};
		//{ {0,0,0} {0,0,0}
		//0 0 0
		//0 0 0
		
		cokBoyutluDizi[0][0] = 1;
		//1 0 0
		//0 0 0
		
		cokBoyutluDizi[1][2] = 8;
		//1 0 0
		//0 0 8
		
		System.out.println(cokBoyutluDizi[0][0]);
		System.out.println(cokBoyutluDizi[1][2]);
		System.out.println(cokBoyutluDizi[0][1]);
		
		
		//Örnek Uygulama
		//Bir sınıf listesi yapalım , içeri şu şeklide olsun
		//Sıra No : Öğrenci No :  Ad :    Soyad :
		//      1			101        Ali		Kaya
		//	    2			102        veli		Öz
		//	    3			103        Zeynep	Çalışkan
		
		String[][] sinifListesi = new String[3][4];
		//Şimdi içine kayıt atalım
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ali";
		sinifListesi[0][3] = "Kaya";
		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Veli";
		sinifListesi[1][3] = "Öz";
		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Zeynep";
		sinifListesi[2][3] = "Çalışkan";
		
		
		
		//Yukarıdaki öğrenci bilgilerini ekrana yazdılarım.
		System.out.println("\n\nÖğrenci Listesi");
		System.out.println("\n------------\n");
		System.out.println(sinifListesi[0][0]+" "+sinifListesi[0][1]+" "+sinifListesi[0][2]+" "+sinifListesi[0][3]);
		System.out.println(sinifListesi[1][0]+" "+sinifListesi[1][1]+" "+sinifListesi[1][2]+" "+sinifListesi[1][3]);
		System.out.println(sinifListesi[2][0]+" "+sinifListesi[2][1]+" "+sinifListesi[2][2]+" "+sinifListesi[2][3]);
		
		//Tek tek yazmak uzun sürer
		//İç içe for kullanırız
		
		System.out.println("Öğrenci Listesi");
		System.out.println("\n------------\n");
		for (int satir = 0; satir < 3; satir++) { // Satır
			for (int sutun = 0; sutun < 4; sutun++) {//Sütun
				System.out.print(sinifListesi[satir][sutun]+" ");
			}
			System.out.println();
		}
		
		//Lenght kullanalım.
		
		System.out.println("Öğrenci Listesi");
		System.out.println("\n------------\n");
		for (int satir = 0; satir < sinifListesi.length; satir++) { // Satır => sinifListesi.length
			for (int sutun = 0; sutun < sinifListesi[satir].length; sutun++) {//Sütun => sinifListesi[satir].length
				System.out.print(sinifListesi[satir][sutun]+" ");
			}
			System.out.println();
		}
		
		
		
		//3 Boyutlu dizi
		
		int [][][] dizi3Boyut = new int[3][3][3];
		
		dizi3Boyut [0][0][0] = 23;
		System.out.println(dizi3Boyut [0][0][0]);
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n\n\n  *********  \n\n\n\n");
		//Ek Bilgi
		//Herhangi bir string ifade şöşndekş sayıyı primitive
		//veri tipine çevirirken wrapper class kullanılır.
		int siraNo = Integer.parseInt(sinifListesi[0][0]);
		System.out.println(siraNo);
			String sayiStr = "12.345";
			double sayi2 = Double.parseDouble(sayiStr);
			System.out.println(sayi2);
			String sy = "12.33229";
			float xx = Float.parseFloat(sy);
			
			
			// 		WRAPPER SINIFLAR:
			//        byte    Byte
			//        short    Short
			//        int       Integer
			//        long    Long
			//        float    Float
			//        double    Double
			//        boolean    Boolean
			//        char    Character
		}
	}


