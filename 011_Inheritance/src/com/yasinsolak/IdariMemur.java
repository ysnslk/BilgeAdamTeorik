package com.yasinsolak;

//extends Personel : İdariMemur  sınıfı  Personel sınıfının bir al sınıfıdır.
//Extens etmek miras almak anlamına gelir.
public class IdariMemur extends Personel {

	private String görevi;
	private long telSeriNo;

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

}
