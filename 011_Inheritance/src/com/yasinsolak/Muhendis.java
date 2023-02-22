package com.yasinsolak;

public class Muhendis extends Personel {

	private String uzmanlikAlani;
	
	public Muhendis() {
		// Üst sınıfın constructor (Yapıcı Metodu) demektir.
		//super(); => Siz super() yazmasanızda java otomatik olarak buraya görünmez bir super ekler.
		
	}

	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

}
