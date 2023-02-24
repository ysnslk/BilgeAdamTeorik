package com.yasinsolak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
	private List<Sinif> siniflarList;

	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarList = new LinkedList<Sinif>();
	}

	// Okulun içindeki sınıfları yazdırır.
	public void siniflariYazdir() {
		System.out.println("\n * * * * " + this.okulAdi + " Okulundaki Sınıflar * * * * \n");
		for (Sinif sinif : this.siniflarList) {
			System.out.println("Sınıf Adı : " + sinif.getSinifAdi() + " Lokasyon : " + sinif.getLokasyon());
		}
	}

	public void sinifEkle(Sinif sinif) {
		this.siniflarList.add(sinif);
	}

	public void okuldanSinifCikar(String sinifAdi) {
		Sinif silinecekSinif = null;
		for (Sinif sinif : this.siniflarList) {
			if (sinif.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				silinecekSinif = sinif;
				break;
			}
		}
		if (silinecekSinif != null) {
			this.siniflarList.remove(silinecekSinif);
		} else {
			System.err.println(sinifAdi + " adlı sınıf bu okulda bulunmadı");
		}
	}

	// Iterators ile safe delete
	public void okuldanSinifCikarIterators(String sinifAdi) {
		Iterator<Sinif> i = this.siniflarList.iterator();
		while (i.hasNext()) {

			Sinif snf = i.next();
			if (snf.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				i.remove();
				break;
			}
		}
	}

	public void okuldakiOgrencileriYazdir() {
		System.out.println("\n*****" + this.okulAdi + " Okulundaki Öğrenci Listesi*****\n");
		int sayac = 0;
		for (Sinif sinif : siniflarList) {
			System.out.println("\nSınıf Adı : " + sinif.getSinifAdi());
			for (Ogrenci ogrenci : sinif.getOgrencilerArrayList()) {
				System.out.println("Öğrenci Adı : " + ogrenci.getAd() + " Öğrenci Soyadı : " + ogrenci.getSoyad()
						+ " Öğrenci Numarası : " + ogrenci.getOkulNo() + " Not Ortalaması : "
						+ ogrenci.getNotOrtalamasi());
				sayac++;
			}
		}
		System.out.println("\nBu okulda " + sayac + " öğrenci vardır.");
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

	public String getOkulAdresi() {
		return okulAdresi;
	}

	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}

	public List<Sinif> getSiniflarList() {
		return siniflarList;
	}

	public void setSiniflarList(List<Sinif> siniflarList) {
		this.siniflarList = siniflarList;
	}

}
