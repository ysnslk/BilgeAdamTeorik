package com.yasinsolak;

public class MainEnumOrnek {

	enum Size {
		LOW, MEDIUM, HIGH
	}

	enum Mevsimler {
		ILKBAHAR, YAZ, SONBAHAR, KIS
	}

	/*
	 * Enumlar bizleri aşağıdaki şekilde tek tek static değişken tanımlamak
	 * zahmetinden kurtarır. Enum değerleri static ve finaldır.
	 */

	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;

	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
	
	public static void main(String[] args) {

		/*
		 * Enumlar
		 * 
		 * Enumlar değişmez (Finaldır) Enumlardan nesne türetilmez
		 */

		Size size = Size.HIGH;
		size = size.MEDIUM;
		System.out.println(size);
		for (Size s : Size.values()) {
			System.out.println(s);
		}

		/*
		 * Enumlar nerelerde kullanılır ? Değişmez değerleriniz varsa kullanılır
		 * Mesela ilkbahar , yaz , sonbahar , kış
		 */
		
		Size beden = size.MEDIUM;
		if (beden == size .MEDIUM) {
			System.out.println("Orta - M  Beden");
		}
		
		//Enumlar sayesinde parametre gönderimi daha hızlı ve doğru olur.
		MainEnumOrnek.ekranaYaz(Mevsimler.SONBAHAR);
	}

}
