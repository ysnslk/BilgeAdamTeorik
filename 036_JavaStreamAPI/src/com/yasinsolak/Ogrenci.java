package com.yasinsolak;

import java.util.Random;

public class Ogrenci {

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
		ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [Ad=" + ad + ", id=" + id + "]";
	}
	
	public void printSinavNotu() {
		Random rnd = new Random();
		System.out.println("Öğrenci : "+ this.ad+" Sınav notu : "+rnd.nextInt(0,101));
	}

}
