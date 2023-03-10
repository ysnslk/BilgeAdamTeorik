package com.yasinsolak;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {
//		String metin = "Merhaba Nasılsın?";
//		Scanner sc = new Scanner(System.in);
//		metin = sc.nextLine();
//		System.out.println(metin);

		//  0   1   2   3   4   5   6   7   8
		//{'B','u','g','u','n',' ','J','a','v','a',' ','i','l','e',..,'z'} --> Char dizisi Array
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		String tekharf ="s"; //char[] dizi => {'a'} => Java bunu 1 elemanlı char olarak kaydeder
		
		
		//String en çok kullanılan metodları :
		
		//lenght metodu ;
		
		//metin.lenght() => metin uzunluğunu int cinsinden verir
		
		int uzunluk = metin.length();
		
		System.out.println(uzunluk);
		
		
		//charAt metodu ;
		//Belirli bir indexteki karakteri döner
		
		System.out.println("0. index karakter : "+ metin.charAt(0));
		System.out.println("2. index karakter : "+ metin.charAt(2));
		
		//Peki bu metnin uzunluğu kaçtı ? 42 
		//En sonuncu karaktere nasıl erişeceğiz.
		//System.out.println("42. index karakter : "+ metin.charAt(42));
		//Hata alırsınız
		System.out.println("Son karakter : "+ metin.charAt(41));// => Doğru
		System.out.println("Son karakter : "+ metin.charAt(metin.length()-1));
		
		
		//indexOf metodu :
		//Find the index
		//s harfi ilk nerede geçiyor ?
		
		
		System.out.println("s harfi ilk nerede geçiyor ? : "+ metin.indexOf("s"));
		System.out.println("B harfi ilk nerede geçiyor ? : "+ metin.indexOf("B"));
		System.out.println("b harfi ilk nerede geçiyor ? : "+ metin.indexOf("b"));
		
		
		//Birden fazla harf arama
		//Java keilmesi ilk nerde geçiyor
		System.out.println("Java keilmesi ilk nerde geçiyor? : "+ metin.indexOf("Java"));
		
		
		//Metin string i içinde x harfinin kullanıp kullanılmadığını bulun
		if(metin.indexOf('x')== -1) {
			System.out.println("X harfi metnin içinde yoktur");
		}
		else {
			System.out.println("X harfi metnin içinde vardır");
		}
		
		
		
		//i harfi ilk nerede geçiyor
		System.out.println("i ilk nerede geçiyor ? : "+ metin.indexOf('i'));
		System.out.println("i 14 indexten sonra ilk nerede geçiyor ? : "+ metin.indexOf('i',14));
		
		//Soru
		//i harfi metnin yarısından itibaren ilk geçtiği yerin indexi
		System.out.println("i harfi metnin yarısından sonra ilk nerde geçer ? : "+ metin.indexOf('i',(metin.length()/2)));
		
		
		
		
		//substring metodu
		//substring(baslangic index ,bitis index) =>Başlangıç dahil bitiş dahil değil
		//Gets substring of a string
		System.out.println("Metnin ilk 5 karakteri: "+metin.substring(0,5));
		
		
		
		//Soru
		//Metindeki Java ifadesini substring ile çekin
		System.out.println("Java Kelimesi"+metin.substring(6,10));
		
		
		//Soru
		String test = "Test 1234";
		System.out.println(test.substring(2,7));
		
		
		//2. kullanım şekli
		System.out.println(test.substring(5));
		
		
		
		//trim
		//Bir stringin başındaki ve sonundaki boşlukları siler
		
		String cumle = "  Hello Java ";
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);
		//kullancı adı şifre yazan uygulamalarda trim kullnmazsanız sorun çıkablir.
		
		
		
		//toUpperCase ve toLowerCase
		//MEtnin içindeki harfleri tamamene büyük ya da küçük yazar
		
		metin = "Hello Java";
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		
		
		//Aşağıdaki çıktıyı ekrana yazdıran program
		
		String metin4 = "*";
		for(int i = 1;i<=7;i++) {
			System.out.println(metin4);
			metin4=metin4+" *";
		}
		
		
		
		//valueOf
		//converts diffrent types of values to String
		//farklı veri tiplerini string e çeviri
		
		int sayi = 2233;
		String ss = String.valueOf(sayi);
		System.out.println(ss);
		
		boolean flag= true;
		ss = String.valueOf(flag);
		System.out.println(ss);
		
		
		//equals metodu
		//
//		String uname ="ysnslk@test.com"; //Db de böyle tutuluyor
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Lütfen Kullanıcı Adını Giriniz");
//		String userName = sc.nextLine();
//		userName = userName.toLowerCase().trim();
		
		//Stringleri bu şekilde == karşılaştırma yapma
//		if(userName == uname) {
//			System.out.println("Kullanıcı Adı Eşleşti");
//		}
//		else {
//			System.out.println("Kullanıcı Adı Eşleşmedi");
//		}
		
//		if(userName .equals(uname)) {
//			System.out.println("Kullanıcı Adı Eşleşti");
//		}
//		else {
//			System.out.println("Kullanıcı Adı Eşleşmedi");
//		}
//		
		
		//equalsIgnoreCase Metodu
		//Metin karşılaştırması yaparken küçük ve büyük harfi dikkate almaz
		
		String isim1="Yasin";
		String isim2="yasin";
		
		if(isim1.equals(isim2)) {
			System.out.println("Kullanıcı Adı Eşleşti");
		}
		else {
			System.out.println("Kullanıcı Adı Eşleşmedi");
		}
		
		if(isim1.equalsIgnoreCase(isim2)) {
			System.out.println("Kullanıcı Adı Eşleşti");
		}
		else {
			System.out.println("Kullanıcı Adı Eşleşmedi");
		}
		
		
		
		//replace metodu Küçük-Büyük harf duyarlılığı var
		
		String s2 = "Şahin yırtıcı bir kuştur";
		String s3 = s2.replace("ş","s");
		System.out.println(s3);
		
		
		//Nerelerde Kullanılır?
		//1. Örnek : Kira Sözleşmesi
		String sozlesme = "Ali kaya Güneş sokak Çankaya mah. adresindeki evini Ayşe Naz'a kiraladı..";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz","Veli Han");
		System.out.println(yeniSozlesme);
		
		//2. kullanım 
		//web url'lerinde türkçe karakterlerde sorun cıkabilir
		//Örn ....isbasvuru.com/alikaya	iş başvuru.pdf => sıkıntı çıkar
		String dosyaAdi = "https://www.isbasvuru.com/alikaya iş başvuru.pdf";
		//Boşluk karakterini - ile değiştir.Türkçe karakterleri ingilizceye değiştir.
		dosyaAdi = dosyaAdi.replace(" ", "-").replace("ş", "s");
		System.out.println(dosyaAdi);
		
		
		//contains metodu 
		//herhangi bir substringin hedef string içinde var olup olmadığını 
		String yeniMetin ="Hava bugün çok yağmurlu";
		System.out.println("ağ kelimesi var mı ?"+yeniMetin.contains("ağ"));
		System.out.println("tağ kelimesi var mı ?"+yeniMetin.contains("tağ"));
		
		if(yeniMetin.contains("yağmur")) {
			System.out.println("Hava durumu yağmurlu");
		}
		else {
			System.out.println("Bugün yağmur yok");
		}
		
		
		//startsWith
		String ad = "Ali Kaya";
		System.out.println(ad.startsWith("A")); // => True
		System.out.println(ad.startsWith("Ali")); // => True
		System.out.println(ad.startsWith("li")); // => False
		
		
		
		//split
		//verilen ifadeye göre metni böler
		
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";
		String[] isimler = liste.split(","); //String dizisi yapar 
		System.out.println(isimler[0]);
		System.out.println(isimler[isimler.length-1]);
		
		
		
//		for(int i=0;i<isimler.length;i++) {
//			System.out.println(isimler[i]);
//		}
		
		
		//Örnek :
		//Öğrencilerin listesi String olarak tutuluyor
		String ogrencilerStr ="Ali Kaya,123;Veli Öz,222;Zeynep Naz,342";
		
		String[] ogrenciler = ogrencilerStr.split(";");
		System.out.println(ogrenciler[0]);
		System.out.println(ogrenciler[1]);
		System.out.println(ogrenciler[ogrenciler.length-1]);
		
		// İlk öğrencinin okul numarasını ekrana yazdır.
		System.out.println(ogrenciler[0].split(",")[1]);
		//Velinin Okul numarasını yazdılarım
		
		String[] ogrenciBilgileriVeli= ogrenciler[1].split(",");
		System.out.println(ogrenciBilgileriVeli[1]);
		
		int ogrNo = Integer.parseInt(ogrenciBilgileriVeli[1]);
		
		System.out.println(ogrNo);
		//Velinin sadece adını yazdıralım 
		String[] OgrVeliIsim = ogrenciBilgileriVeli[0].split(" ");
		System.out.println(OgrVeliIsim[0]);
		
		
		//Stringbuiler kullanımı
		
		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("Merhaba");
//		stringBuilder.append(" Dünya");
//		stringBuilder.append(" Java!");
//		System.out.println(stringBuilder);
		
		Scanner sc = new Scanner(System.in);
		stringBuilder.append(sc.nextLine());
		System.out.println(stringBuilder);
		
		
		
		//String karşılaştırma konusu DETAY
		
		
		System.err.println("\n*************\n");
		
		String x = "Ali";
		String y = "Veli";
		
		if(x==y) {
			System.out.println("Eşit");
		}
		else {
			System.out.println("Eşit Değil");
		}
		
		String z ="Ali";
		if(x==z) {
			System.out.println("Eşit");
		}
		else {
			System.out.println("Eşit Değil");
		}
		
		
		String w = "Ali ".trim();

		System.out.println(w);
		
		if(x==w) {
			System.out.println("w ve x Eşit");
		}
		else {
			System.out.println("w ve x Eşit Değil");
		}
		
		//Çok dikkatli olmak gerek
		//String karşılaştırmalarında equals kullanılmalı
		//Sınavlarda-mülakatlarda çok sorulur
		
		if(w.equals(x)) {
			System.out.println("Eşit");
		}
		else {
			System.out.println("Eşit Değil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
