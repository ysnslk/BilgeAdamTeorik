package question3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super(ad, kilosu, uzunluk, tehkekliMi);
		// TODO Auto-generated constructor stub
	}

	public Kertenkele() {

	}

	@Override
	public void surun() {
		System.out.println(this.getAd()+" kertenkele çalışların arasında sürünüyor");
		
	}
	@Override
	public void surun(String ad) {
		System.out.println(ad+" kertenkele çalışların arasında sürünüyor");
		
	}


	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" kertenkele ses çıkartıyor");
		
	}

}
