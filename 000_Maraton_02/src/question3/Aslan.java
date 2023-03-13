package question3;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super(ad, kilosu, uzunluk, tehkekliMi);
		// TODO Auto-generated constructor stub
	}
	public Aslan() {
		
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd()+" İhtişamla yürüyor");
		
	}
	@Override
	public void yuru(String ad) {
		System.out.println(ad+" İhtişamla yürüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" Aslan güçlü sesiyle kükrüyor");
		
	}

}
