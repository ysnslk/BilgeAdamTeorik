package com.alikaya;

public class Ucgen {

	public int kenar1;
	public int kenar2;
	public int kenar3;
	
	public int ucgenCevresi() {
		return (kenar1+kenar2+kenar3);
	}
	//Protected sadece aynı paket içinde erişilebiir.
	protected void kenarlariUzat(int uzatmaMiktari) {
		kenar1 +=uzatmaMiktari;
		kenar2 +=uzatmaMiktari;
		kenar3 +=uzatmaMiktari;
	}
	
	public void kereminMetodu(int uzatmaMiktari) {
		kenarlariUzat(uzatmaMiktari);
	}
	
}
