package question3;

public abstract class Surungen extends Hayvan {

	public Surungen(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super(ad, kilosu, uzunluk, tehkekliMi);
		this.setCins("Surungen");
	}
	public Surungen() {

	}
	
	public abstract void surun();
	public abstract void surun(String ad);

}
