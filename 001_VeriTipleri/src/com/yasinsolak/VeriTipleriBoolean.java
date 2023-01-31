package com.yasinsolak;

public class VeriTipleriBoolean {

	public static void main(String[] args) {

		// bool veri tipi :
		// 1bitlik yer kaplar
		// Açık-Kapalı, doğrı-yanlış, 1-0 , ....

		// Boolean olarak neler tutabiliriz ?
		/*
		 * Bir kullanıcın sistemde aktif olup olmadığını kontrol eder.(online offline)
		 */
		boolean boolDegisken;
		boolDegisken = true; // true veya false olarak sadece 2 değer alır.
		System.out.println(boolDegisken);

		boolean agirMi = false; // initialize - ilk değer verme
		int agirlik = 85;
		agirMi = (agirlik >= 85);
		System.out.println("Ağır Mı :" + agirMi);

		// == != >= <= < > 
		
		boolean durum = agirlik == 50;
		System.out.println("Durum: "+ durum);
		
		durum = agirlik !=50 ;
		System.out.println("Durum: "+ durum);
		
		int boy = 180;
		boolean uzunKilolu = (boy >=180 && agirlik >=85);
		System.out.println("Şahış Uzun ve Kilolu Mu ? "+ uzunKilolu);
		
		
		//Soru :
		char cinsiyet = 'K'; // 'E'
		if(uzunKilolu && cinsiyet == 'K') {
			System.out.println("Şahış kadın ,uzun ve kilolu");
		}
		
		
		//if => Ternary Kullanımı
		
		int yas = 19;
		String deger;
		if(yas >= 18) {
			deger = "Yetişkin";
		}
		else {
			deger = "Yetişkin değil";
		}
		System.out.println(deger);
		
		//Yukardaki işlemin Ternary ile yapılması 
		yas = 11;
		deger = yas >=18 ? "Yetiskin" : "Yetişkin değil";
		System.out.println(deger);
		
		
		//Microsoft USA'nın mülakatında sorduğu sınav sorusu (SWAP numbers Questions)
		//3. değişken kullanmadan sayi1 ve sayi2 sayılarını birbirine esit olacak sekilde değiştirin.
		int sayi1 = 3;
		int sayi2 = 5;
		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		System.out.println("----------------------------");
		
		
		int x=10;
		int y=3;
		int result = x/y;
		System.out.println(result);
		int kalan =  x%y;
		System.out.println(kalan);
		double res = x/y;
		System.out.println("res : "+res);  // Yine küsürat gözükmez . 
		//Eşitliğin sağ tarafı tam sayılarda hep int
		
		//Çözüm: 
		//x ve y double olmalı 
		double xx = 10;
		double yy=3;
		res = xx/yy;
		System.out.println("res d : "+res);
		
		//Küsüratı azaltıp gösterelim
		
		String kusurat = String.format("%.4f", res);
		System.out.println("res : "+ kusurat);
		
	  
		System.out.println("***************************************");
		
		
		int sayisalDeger = 4;
		sayisalDeger = sayisalDeger + 1;
		System.out.println("Sayısal Değer : "+sayisalDeger);
		
		//++ += -- -=
		sayisalDeger+=1;
		System.out.println("Sayısal Değer : "+sayisalDeger);

		sayisalDeger++;
		System.out.println("Sayısal Değer : "+sayisalDeger);
		
		sayisalDeger +=5;
		System.out.println("Sayısal Değer : "+sayisalDeger);
		
		sayisalDeger--;
		System.out.println("Sayısal Değer : "+sayisalDeger);
		
		
		//*= /= %= Mantık Aynı
		
		
//		int a = 3;
//		int b = a++; //Dikkat ÖNCE atamayı yapar, sonra ++  işlemin yapar. a = a+1
//		System.out.println("a: "+a+" b: "+b);
		
//		int a = 3;
//		int b = ++a; //Önce a : 4 olur daha sonra b:4 olur 
//		System.out.println("a: "+a+" b: "+b);
		
		int a =3;
		int b= 4;
		int z = 5;
		//int tpl = a++ + ++b + --z; // Tpl :3+5+4	   a:4       b:5 	       z:4
		//System.out.println("tpl: "+tpl);
		int  tpl = a++ + ++b + --z + b; // b nin yeni değerini alır en sonda
		 System.out.println("tpl: "+tpl);
		
		
		
		
		
		
		
		
		
	}

}
