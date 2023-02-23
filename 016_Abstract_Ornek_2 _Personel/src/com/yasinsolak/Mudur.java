package com.yasinsolak;

public class Mudur extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Muhendis[] bagliMuhendisler;

	public Mudur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String makamAdi, long telSeriNo) {

//		this.setAd(ad);
//		this.setSoyad(soyad);
//		this.setTckimlik(tcKimlik);
//		this.setYas(yas);
//		this.setMaas(maas);
//		this.setKidemBilgisi(kidemBilgisi);
//		this.setCepTelNo(cepTelNo);
		// Yukarıdaki satırların yerine üst sınıfın CONS unu çağır
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.setMakamAdi(makamAdi);
		this.setTelSeriNo(telSeriNo);
	}

	public int getZamKatsayisi() {
		return 5;
	}

	public String getMakamAdi() {
		return makamAdi;
	}

	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	public Muhendis[] getBagliMuhendisler() {
		return bagliMuhendisler;
	}

	public void setBagliMuhendisler(Muhendis[] bagliMuhendisler) {
		this.bagliMuhendisler = bagliMuhendisler;
	}

	@Override
	public String toString() {
		return "Mudur [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo() + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTckimlik()=" + getTckimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

}
