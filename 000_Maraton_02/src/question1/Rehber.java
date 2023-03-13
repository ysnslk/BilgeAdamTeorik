package question1;
public class Rehber {

	private String adSoyad;
	private String sehir;
	private String tel;

	public Rehber(String adSoyad, String sehir, String tel) {
		super();
		this.adSoyad = adSoyad;
		this.sehir = sehir;
		this.tel = tel;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Rehber [adSoyad=" + adSoyad + ", sehir=" + sehir + ", tel=" + tel + "]";
	}

}
