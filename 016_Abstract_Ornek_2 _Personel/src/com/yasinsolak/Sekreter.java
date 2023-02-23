package com.yasinsolak;

public class Sekreter extends Personel {

	private long tel1SeriNo;
	private long tel2SeriNo;

	// Hiçbişi yazmasanızda otomatik oluşturulur.
	public Sekreter() {
		// super();//=> Siz super() yazmasanızda java otomatik olarak buraya görünmez
		// bir super ekler.

	}

	// Alt sınıfıların constructorları mutlaka 1 tane üst sınıf constructorı
	// çağırmak zorundadır.Extra cons otomatik çağırılmaz..!!
	// Siz üst sınıf cos çağırmazsanız java boş cons çağırır.
	public Sekreter(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			int tel1SeriNo, int tel2SeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.tel1SeriNo = tel1SeriNo;
		this.tel2SeriNo = tel2SeriNo;
	}

	// Metod Overriding
	public int getZamKatsayisi() {
		return 2;
	}

	public long getTel1SeriNo() {
		return tel1SeriNo;
	}

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	public long getTel2SeriNo() {
		return tel2SeriNo;
	}

	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}

	@Override
	public String toString() {
		return "Sekreter [getTel1SeriNo()=" + getTel1SeriNo() + ", getTel2SeriNo()=" + getTel2SeriNo() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getTckimlik()=" + getTckimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

}
