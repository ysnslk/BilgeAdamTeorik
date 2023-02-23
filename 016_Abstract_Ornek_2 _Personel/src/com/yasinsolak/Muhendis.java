package com.yasinsolak;

public class Muhendis extends Personel {

	private String uzmanlikAlani;

	public Muhendis() {
		// Üst sınıfın constructor (Yapıcı Metodu) demektir.
		// super(); => Siz super() yazmasanızda java otomatik olarak buraya görünmez bir
		// super ekler.

	}

	// Metod Overriding
	public int getZamKatsayisi() {
		return 3;
	}

	public Muhendis(String ad, String soyad, String tckimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String uzmanlikAlani) {
		super(ad, soyad, tckimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.uzmanlikAlani = uzmanlikAlani;
	}

	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

	@Override
	public String toString() {
		return "Muhendis [getUzmanlikAlani()=" + getUzmanlikAlani() + ", getAd()=" + getAd() + ", getSoyad()="
				+ getSoyad() + ", getTckimlik()=" + getTckimlik() + ", getYas()=" + getYas() + ", getMaas()="
				+ getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + "]";
	}

}
