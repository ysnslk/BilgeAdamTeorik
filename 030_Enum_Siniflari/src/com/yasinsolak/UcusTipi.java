package com.yasinsolak;

public enum UcusTipi {

	EKONOMIK(100, "Ekonomik Uçuş"), OZEL(200, "Özel Uçuş"), VIP(300, "VIP Uçuş");

	int tip;
	String metin;

	private UcusTipi(int tip, String metin) {
		this.tip = tip;
		this.metin = metin;

	}

	public int getTip() {
		return tip;
	}

	public String getMetin() {
		return metin;
	}

}
