package question3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super(ad, kilosu, uzunluk, tehkekliMi);
		// TODO Auto-generated constructor stub
	}
	
	public Maymun() {

	}

	@Override
	public void yuru() {
		System.out.println(this.getAd()+" maymun dalların arasında yürüyor");
		
	}
	@Override
	public void yuru(String ad) {
		System.out.println(ad+" maymun dalların arasında yürüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" maymun u ha ha u haha");
		
	}

}
