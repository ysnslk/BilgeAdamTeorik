package com.yasinsolak;
//Sınıf : CLASS(TASARIM)
public class Anahtar {

	//Sınıf static değişken
	//Sınıfa özgüdür
	//Sadece 1 tane tutulur her bir nesne için ayrı değer tutulmaz
	public static final int uzunluk = 10;
	//Özellik / Üye değişken
	public String renk;
	public int no;
	public String ad;
	
	public static void uzunluguEkranaYaz()
	{
		System.out.println(Anahtar.uzunluk);
		//Static metodlar içinde static olmayan değişkenler kullanılmza!!
		//System.out.println(renk); hata verir  static değil
		
	}
	
	
	//non static 
	public void bilgileriEkranaYaz() {
		System.out.println("No : "+ no +" Ad : "+ ad+" Renk : "+renk + " Uzunluk : "+uzunluk);
	}
}
