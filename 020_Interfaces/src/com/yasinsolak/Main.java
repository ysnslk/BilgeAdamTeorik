package com.yasinsolak;

public class Main {
	
	//Interface'ler abstraction sağlar
	public static ITermometre termometreOlustur() {
		ITermometre termometre = new Sinbo();
		return termometre;
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster()+" "+tarihSaatGosterenCihaz.saatGoster());
	}

	public static void main(String[] args) {

		Arzum arzum = new Arzum();
		System.out.println(arzum.sicakligiOlc());
		
		ITermometre termometre = new Sinbo();
		System.out.println(termometre.sicakligiOlc());
		
		Sinbo sinboCihaz = new Sinbo();
		sinboCihaz.sicakligiOlc();
		sinboCihaz.nemOlc();
		
		Casio casio = new Casio();
		
		System.out.println("\n-------------------\n");
		
		Main.tarihSaatGoster(arzum);
		Main.tarihSaatGoster(casio);
		
		System.out.println("\n-------------------\n");
		
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());
		
	}

}
