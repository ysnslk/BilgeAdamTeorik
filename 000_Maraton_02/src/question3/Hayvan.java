package question3;

public abstract class Hayvan {

	private String ad;
	private int kilosu;
	private int uzunluk;
	private boolean tehkekliMi;
	private String cins;

	public Hayvan(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunluk = uzunluk;
		this.tehkekliMi = tehkekliMi;
	}

	public Hayvan() {

	}

	public abstract void sesCikar();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilosu() {
		return kilosu;
	}

	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public boolean isTehkekliMi() {
		return tehkekliMi;
	}

	public void setTehkekliMi(boolean tehkekliMi) {
		this.tehkekliMi = tehkekliMi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + ", tehkekliMi=" + tehkekliMi + "]";
	}

}
