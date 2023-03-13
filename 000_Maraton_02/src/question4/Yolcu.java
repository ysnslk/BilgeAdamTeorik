package question4;

import java.util.HashMap;

public abstract class Yolcu {
	// İd, Ad, Syoad, koltukNo, checkin, BASEFIYAT = 100

	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkin = false;
	private final int BASEFIYAT = 100;
	private int toplamFiyat;
	HashMap<String, Integer> biletler;
	
	

	public int getToplamFiyat() {
		return toplamFiyat;
	}

	public void setToplamFiyat(int toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}

	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = Util.rasgeleSayi();
		this.biletler = new HashMap<>();
	}

	public abstract void yolcuBilgileriniGetir();

	public abstract void biletAl(EFirmaAdi firmaAdi);

	public abstract void checkInYap();

	public abstract void ucagaBin();

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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public boolean isCheckin() {
		return checkin;
	}

	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}

	public int getBASEFIYAT() {
		return BASEFIYAT;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public HashMap<String, Integer> getBiletler() {
		return biletler;
	}

	public void setBiletler(HashMap<String, Integer> biletler) {
		this.biletler = biletler;
	}
	
	

}
