package com.yasinsolak;

import java.util.Objects;

//Eğer bir sınıfı HashSet ile kullanacaksanız equals() ve hashCode() metotlarını implement etmeniz gerek.
public class Kisi {
	private int id;
	private String ad;

	public Kisi(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int hashCode() {
		return Objects.hash(id, ad);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Kisi other = (Kisi) obj;
		return (Objects.equals(ad, other.ad) && Objects.equals(id, other.id));
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + "]";
	}

}
