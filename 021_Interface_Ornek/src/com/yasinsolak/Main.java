package com.yasinsolak;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	// Polimorhism over Interfaces
	public static void kisaSureliUc(IUcabilir kus) {
		System.out.println("\n----\n");
		kus.kanatCirp();
	}

	// Polimorhism over Inheritance
	public static void hayvan2kezSesCikar(Hayvan hayvan) {
		hayvan.sesCikar();
		hayvan.sesCikar();
	}

	public static void yirticiSaldirisi(IYirticiHayvan yirtici) {
		yirtici.saldir("Tavşan");
		yirtici.saldir("Tavşan");
	}

	public static IYirticiHayvan yirticiHayvanOlustur() {
		IYirticiHayvan yirticiHayvan = new Kartal("Amerikan Kartalı",55,88);
		return yirticiHayvan;
	}
	
	public static void main(String[] args) {

		// IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 1, 12);
		Guvercin beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 1, 12);
		beyazPacaliGuvercin.gagala("yem");

		// IUcabilir serce = new Serce("Minik", 1, 8);
		Serce serce = new Serce("Minik", 1, 8);
		serce.gagala("yem");

		AnkaraKedisi kedi = new AnkaraKedisi("Tekir", 5, 40);

		kisaSureliUc(serce);
		kisaSureliUc(beyazPacaliGuvercin);

		hayvan2kezSesCikar(kedi);
		hayvan2kezSesCikar(serce);

		// Yırtıcı saldırısı
		System.out.println();
		Kartal kartal = new Kartal("Kara Kartal", 50, 90);
		Main.yirticiSaldirisi(kartal);
		Main.yirticiSaldirisi(new GoldeRetriever("Goldie", 40, 100));

		IYirticiHayvan yHayvan =Main.yirticiHayvanOlustur();
		yHayvan.saldir("Fare");
	}

}
