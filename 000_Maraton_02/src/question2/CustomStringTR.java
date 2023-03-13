package question2;

public class CustomStringTR {
	private String kelime;

	public CustomStringTR(String kelime) {
		this.kelime = kelime;
	}

	public int uzunluk() {
		int uzunluk = this.kelime.length();
		return uzunluk;
	}

	public String harfDegistir(char eski, char yeni) {
		String yeniKelime;
		if (kelime.contains(String.valueOf(eski))) {
			yeniKelime = this.kelime.replace(eski, yeni);

		} else {
			yeniKelime = "Böyle bir harf yok";
		}
		return yeniKelime;
	}

	public boolean icindeVarMi(String eski) {
		boolean arama = this.kelime.contains(eski);
		return arama;
	}

	public String kelimeyiKes(int index) {
		String yeni;
		if (kelime.length() >= index) {
			yeni = this.kelime.substring(index);
		} else {

			yeni = "Index harften fazla..!!";
		}
		return yeni;
	}

	public String kelimeyiBol(String c) {
		String[] yeni = kelime.split(c);

		return yeni[0] + " " + yeni[1];
	}

	public int indexiniBul(char harf) {
		int index = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == harf) {
				index = i;
				break;
			} else {
				index = 99; // Harf yoksa 99 yazacak
			}
		}
		return index;
	}

	public boolean harfleMiBasliyor(String c) {
		boolean yeni = kelime.startsWith(c);
		return yeni;
	}

	public boolean harfleMiBitiyor(String c) {
		boolean yeni = kelime.endsWith(c);
		return yeni;
	}

	public String kelimeyeEsitMi(String string) {
		String kontrol;
		if (kelime.equals(string)) {
			kontrol = "Eşit";
		} else {
			kontrol = "Eşit Değil";
		}
		return kontrol;
	}

	public String harfleriBuyut() {
		String buyuk = kelime.toUpperCase();
		return buyuk;
	}
}
