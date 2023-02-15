package com.alikaya;

public class MainAli {
	
	
	
	
	private String isim;
	private String getIsim() {
		return isim;
	}

	public static void main(String[] args) {
		ParalelKenar paralelKenar1 = new ParalelKenar();
		paralelKenar1.kenarKisa = 27;
		paralelKenar1.kenarUzun = 40;
		//paralelKenar.isim = "Benim paralelkenarım"; Erişilemez
		

		Ucgen ucgen2 = new Ucgen();
		ucgen2.kenar1 = 30;
		ucgen2.kenar2 = 40;
		ucgen2.kenar3 = 50;
		System.out.println("Üçgenin Çevre Uzunluğu : "+ucgen2.ucgenCevresi());
		
		
		System.out.println("Üçgen kenarları => "+ucgen2.kenar1+" Kenar2 : "+ucgen2.kenar2+" Kenar3: "+ucgen2.kenar3);
		ucgen2.kenarlariUzat(10);
		System.out.println("Üçgen kenarları => "+ucgen2.kenar1+" Kenar2 : "+ucgen2.kenar2+" Kenar3: "+ucgen2.kenar3);
	
		//DAire
		Daire daire = new Daire();
		daire.yaricap = 10;
		// daire.yaricap //Private
	}

}
