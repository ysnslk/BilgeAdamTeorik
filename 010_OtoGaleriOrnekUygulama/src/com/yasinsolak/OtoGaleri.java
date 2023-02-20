package com.yasinsolak;

import java.util.Iterator;

public class OtoGaleri {

	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;
	
	
	//OtoGaleriConstructor
	public OtoGaleri(String galeriAdi,int kapasite) {
		this.otomobilDizisi = new Otomobil [kapasite];
		this.galeridekiOtomobilSayisi = 0;
		this.setGaleriAdi(galeriAdi);
	}

	public void galeriyeOtomobilEkle(Otomobil otomobil) {
		if(galeridekiOtomobilSayisi < otomobilDizisi.length) {
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
			galeridekiOtomobilSayisi++;
		}
		else {
			//Yer yoksa ekleme işlemi yapma!!!!!
			System.err.println("Galeri kapatsitesi full , araç eklenemedi...!!");
		}
	}
	public void galeridekiOtomobilleriListele() {
		System.out.println("\n\n"+galeriAdi+" Galerisindeki Otomobiller Listesi : "+"(Kapasite : "+otomobilDizisi.length+")"
				+" (Galerideki anlık otomobil sayısı : "+galeridekiOtomobilSayisi+")\n\n");
		for (int i = 0; i < this.galeridekiOtomobilSayisi; i++) {
			System.out.println(otomobilDizisi[i].getMarka()+" "+otomobilDizisi[i].getModel());
		}
	}
	public int findCout(String marka) {
		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if(otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;
			}
		}
		return counter;
	}
	
	
	public Otomobil[] search(String marka) {
		int count = findCout(marka); // Aranan marka otomobil sayısı
		Otomobil[] aramaSonuclari = new Otomobil[count];
		int sayac = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if(otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac]=otomobilDizisi[i];
				sayac++;
			}
		}
		return aramaSonuclari;
	}
	
	//Dizinin kapasitesini değiştirmeden silme işlemi yapıyoruz
	public void galeridenOtomobilSil(int siraNo) {
		Otomobil[] otomobilDizisiTemp = new Otomobil[otomobilDizisi.length];
		int j = 0;
		for (int i = 0; i < otomobilDizisi.length; i++) {
			if(i != siraNo) {
				otomobilDizisiTemp[j] = otomobilDizisi[i];
				j++;
				
			}
		}
		this.galeridekiOtomobilSayisi--;
		otomobilDizisi = otomobilDizisiTemp;
		 
	}
	
	
	
	

	public String getGaleriAdi() {
		return galeriAdi;
	}


	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}


	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}
	
	
	



}
