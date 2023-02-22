package com.yasinsolak;

//Daire Başkanı sınıfıda personel sınıfının bir al sınıfıdır.
//(personel sınıfı daire başkanı classının super class ı dır.)
public class DaireBaskani extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] bagliMudurler;

	public DaireBaskani(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String makamAdi, long telSeriNo) {
//		
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
	//Metod Overriding 
	public int getZamKatsayisi() {
		return 8;
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

	public Mudur[] getBagliMudurler() {
		return bagliMudurler;
	}

	public void setBagliMudurler(Mudur[] bagliMudurler) {
		this.bagliMudurler = bagliMudurler;
	}

	@Override
	public String toString() {
		return "DaireBaskani [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getTckimlik()=" + getTckimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

}
