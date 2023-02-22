package com.yasinsolak;

//extends Personel : İdariMemur  sınıfı  Personel sınıfının bir al sınıfıdır.
//Extens etmek miras almak anlamına gelir.
public class IdariMemur extends Personel {

	private String görevi;
	private long telSeriNo;

	public IdariMemur(String ad, String soyad, String tckimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String gorevi, long telSeriNo) {
		super(ad, soyad, tckimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.görevi = gorevi;
		this.telSeriNo = telSeriNo;
	}
	public int getZamKatsayisi() {
		return 2;
	}

	public String getGörevi() {
		return görevi;
	}

	public void setGörevi(String görevi) {
		this.görevi = görevi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	@Override
	public String toString() {
		return "IdariMemur [getGörevi()=" + getGörevi() + ", getTelSeriNo()=" + getTelSeriNo() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTckimlik()=" + getTckimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

}
