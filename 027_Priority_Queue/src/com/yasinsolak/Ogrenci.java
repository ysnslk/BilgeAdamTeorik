package com.yasinsolak;

public class Ogrenci implements Comparable<Ogrenci> {

	private String ad;
	private int id;

	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}

	@Override
	// Şuanki öğrencimizle parametre olarak gelen ogrenci nesnesinin karşılaştırması
	// burada yapılır
	public int compareTo(Ogrenci ogr) {
		if (this.id < ogr.id) {
			return -1;
		} else if (this.id > ogr.id) {
			return 1;
		} else {
			return 0;
		}

	}

}
