package com.yasinsolak.repository.entity;

public class Ogretmen {
	private int tcKimlikNo;
	private String ad;
	private String soyad;

	public Ogretmen(int tcKimlikNo, String ad, String soyad) {
		super();
		this.tcKimlikNo = tcKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
	}

	public int getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(int tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
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

	@Override
	public String toString() {
		return "Ogretmen [tcKimlikNo=" + tcKimlikNo + ", ad=" + ad + ", soyad=" + soyad + "]";
	}

}
