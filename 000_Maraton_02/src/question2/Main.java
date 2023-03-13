package question2;

public class Main {

	public static void main(String[] args) {

		String a = "MErahaba";

		CustomStringTR customStr = new CustomStringTR("Merhaba");
		System.out.println("1- Uzunluk : " + customStr.uzunluk());
		System.out.println("2- Harfler değiştir : " + customStr.harfDegistir('a', 'e'));
		System.out.println("3- İçinde harf var mı ? : " + customStr.icindeVarMi("a"));
		System.out.println("4- Kelime kesildi : " + customStr.kelimeyiKes(2));
		System.out.println("5- Kelime Bölündü : " + customStr.kelimeyiBol("e"));
		System.out.println("6- İndexini Bul : " + customStr.indexiniBul('k'));
		System.out.println("7- Harf ile mi başlıyor ? : " + customStr.harfleMiBasliyor("M"));
		System.out.println("8- Harf ile mi bitiyor ? : " + customStr.harfleMiBitiyor("a"));
		System.out.println("9- Kelimeye Eşit mi ? : " + customStr.kelimeyeEsitMi("Merhaba"));
		System.out.println("10- Harfler Büyütüldü: " + customStr.harfleriBuyut());

	}

}
