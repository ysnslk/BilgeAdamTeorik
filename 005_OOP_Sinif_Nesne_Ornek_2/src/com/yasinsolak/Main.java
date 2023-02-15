package com.yasinsolak;

import com.alikaya.ParalelKenar;
import com.alikaya.Ucgen;

public class Main {

	public static void main(String[] args) {

		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 7;
		dikdortgen1.uzunKenar = 10;
		
		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 8;
		dikdortgen2.uzunKenar = 15;
		
		System.out.println("dikdörtgen1 nesnesinin alanı : "+dikdortgen1.alanHesapla());
		System.out.println("dikdörtgen2 nesnesinin alanı : "+dikdortgen2.alanHesapla());
	
		dikdortgen2.uzunKenar = 20;
		System.out.println("dikdörtgen2 nesnesinin alanı : "+dikdortgen2.alanHesapla());
	
		Kare kare1 = new Kare();
		kare1.kenar = 10;
		System.out.println("kare1 alan : "+kare1.alanHesapla());
		Kare kare2 = new Kare();
		kare2.kenar = 20;
		System.out.println("kare1 alan : "+kare2.alanHesapla());
	
		ParalelKenar paralelKenar1 = new ParalelKenar();
		
		
		Ucgen ikizkenarUcgen = new Ucgen();
		ikizkenarUcgen.kenar1 = 10;
		ikizkenarUcgen.kenar2 = 10;
		ikizkenarUcgen.kenar3 = 20;
		System.out.println("Üçgenin Çevre Uzunluğu : "+ikizkenarUcgen.ucgenCevresi());
		
		ikizkenarUcgen.kereminMetodu(20);
		System.out.println("Üçgen kenarları => "+ikizkenarUcgen.kenar1+" Kenar2 : "+ikizkenarUcgen.kenar2+" Kenar3: "+ikizkenarUcgen.kenar3);
	
		//Daire
		//Daire daire = new Daire()
		//Protected olduğu için buradan erişilemez
	
	
	}

}
