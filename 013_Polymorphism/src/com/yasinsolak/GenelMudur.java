package com.yasinsolak;

public class GenelMudur {
	private String ad;
	private String soyad;
	private String tckimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	private DaireBaskani[] daireBaskanlari;
	
	

	public GenelMudur(String ad, String soyad, String tckimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tckimlik = tckimlik;
		this.yas = yas;
		this.maas = maas;
		this.kidemBilgisi = kidemBilgisi;
		this.cepTelNo = cepTelNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTckimlik() {
		return tckimlik;
	}

	public void setTckimlik(String tckimlik) {
		this.tckimlik = tckimlik;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public int getKidemBilgisi() {
		return kidemBilgisi;
	}

	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}

	public long getCepTelNo() {
		return cepTelNo;
	}

	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}

}
