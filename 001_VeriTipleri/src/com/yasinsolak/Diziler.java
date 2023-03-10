package com.yasinsolak;

import java.util.Scanner;

//Diziler (Arrays)
public class Diziler {

	public static void main(String[] args) {
		
		//tam sayı dizisi: =>{1 , 7 , 12 , 39 , 55 , 88 , 91}
		//metin dizisi =>{"ali" , "veli" , "ayşe" , "ahmet"}
		
		//dizi tanımlama:
		//dizinin cinsi önce yazılır byte,short,int,float sonra []

		
		long[] dizi1;
		
		//Kural dizileri initialize etmeden onları kullanamazsınız.
		
		dizi1 = new long[7]; //Siz böyle yazdığınızda java arkaplanda
							 //{0,0,0,0,0,0,0}
		
		System.out.println(dizi1[0]); //Unutmayalım dizilerin ilk indexi 0
		System.out.println(dizi1[dizi1.length-1]);
		System.out.println(dizi1.length);

		
		//Dikkat :
		//Dikkat dizi boyutundan büyük indexe ulaşamazsın hata verir
		System.out.println(dizi1[6]);
		
		
		//dizilere atama yapmak
		dizi1[0]=10;
		dizi1[1]=15;
		dizi1[6]=28;
		System.out.println(dizi1[1]);
		System.out.println("\n\n");
		
		//Dizilerin değerleri okunurken genelde for loop kullanılır
		for(int i=0;i<7;i++){
			System.out.println(dizi1[i]);
		}
		
		//Yukarıdaki yöntem yerine son dğer olarak dizinin length'in kullanın
		for(int i=0;i<dizi1.length;i++){
			System.out.println(dizi1[i]);
		}
		
		System.out.println("\n\n");
		
		//dizi tanımlama 2. yöntem :
		
		int[] myArray = {1,5,9,24,112};
		System.out.println(myArray[2]);
		
		System.out.println("\n\n");
		//dizi tanımlama 3. yöntem :
		
		int[] arrayInt = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arrayInt.length;i++) {
			System.out.println(arrayInt[i]);
		}
		System.out.println("\n\n");
		//Soru : 
		int[] array1 = {1,5,9,24,112};
		int[] array2 = {10,50,90,240,1120};
		array1 = array2;
		array1[0]=999;
		System.out.println(array2[0]); //Ekrana ne yazar (999)
		
		
		
		//Dizi tanımlama String
		
		String[] arrayString = new String[] {"Ali","Veli","Zeynep","Can"};
		for(int i=0;i<arrayString.length;i++) {
			System.out.println(arrayString[i]);
		}
		System.out.println("******************");
		
		//Tanımlama 2. Yöntem
		
		String[] dizi2 = new String[3];
		dizi2[0] = "Papatya";
		dizi2[1] = "Gül";
		dizi2[2] = "Lale";
		//dizi2[3] = "Orkide"; => Bu işlem hatalı olur (Sınır aşıldı)
		for(int i=0;i<dizi2.length;i++) {
			System.out.println(dizi2[i]);
		}
		System.out.println("******************");
		//null 
		String isim;
		//System.out.println(isim); // İsim değişkenine atama yapılmazsa hata verir
		
		//Örnek
		
		String[] dizi3 = new String[3];
		dizi3[0]="Ali";
		for(int i=0;i<dizi3.length;i++) {
			System.out.println(dizi3[i]);
		}
		
		
		//Örnek
		System.out.println("******************");
		
		//Kullanıcıdan bir tam sayı alalım ,girilen tam sayı girilen boyut olsun
		//İçeriğini kullanıcı d
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dizi kaç elemanlı olsun? ");
		int diziBoyutu = sc.nextInt();
		int[] arrayI = new int[diziBoyutu];
		
		for(int i=0 ;i<arrayI.length;i++) {
			System.out.println((i+1)+". Elemanı Giriniz :");
			arrayI[i] = sc.nextInt();
		}
		
		for(int i=0 ;i<arrayI.length;i++) {
			System.out.print(arrayI[i]);
		}
		
	}

}
