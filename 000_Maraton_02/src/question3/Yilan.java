package question3;

public class Yilan extends Surungen{

	public Yilan(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super(ad, kilosu, uzunluk, tehkekliMi);
		// TODO Auto-generated constructor stub
	}
	public Yilan() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println(this.getAd()+" yılan kumların arasında ihtişamla süzülüyor");
		
	}
	
	@Override
	public void surun(String ad) {
		System.out.println(ad+" yılan kumların arasında ihtişamla süzülüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" yılan Tıssslıyor");
		
	}

}
