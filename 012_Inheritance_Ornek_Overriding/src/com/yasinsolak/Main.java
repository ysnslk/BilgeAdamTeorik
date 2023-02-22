package com.yasinsolak;

public class Main {
	// **** METOD OVERLOADIN - AŞIRI YÜKLEME
	public static int topla(int x, int y) {
		return (x + y);
	}

	public static int topla(int x, int y, int z) {
		return (x + y + z);
	}

	public static void main(String[] args) {

		DaireBaskani daireBaskani = new DaireBaskani("Ali", "Veli", "12312312312", 50, 30000, 1, 5554443322L,
				"İnşaat Emlak Daire", 123);
		System.out.println(daireBaskani);

		Muhendis m = new Muhendis("Mahmut", "Kara", "12312312312", 50, 30000, 1, 5554443322L, "İnşaat Mühendisi");
		System.out.println(m);

		m.getZamKatsayisi();

		System.out.println(m.getAd() + " zam katsayısı : " + m.getZamKatsayisi());
		System.out.println(daireBaskani.getAd() + " zam katsayısı : " + daireBaskani.getZamKatsayisi());
	
		// **** METOD OVERLOADIN - AŞIRI YÜKLEME
		System.out.println(topla(2,3));
		System.out.println(topla(2,3,4));
	}

}
