package question3;

public abstract class MemeliHayvan extends Hayvan {
	

	public MemeliHayvan(String ad, int kilosu, int uzunluk, boolean tehkekliMi) {
		super(ad, kilosu, uzunluk, tehkekliMi);
		this.setCins("Memeli");
	}

	public MemeliHayvan() {

	}

	public abstract void yuru();
	public abstract void yuru(String ad);

}
