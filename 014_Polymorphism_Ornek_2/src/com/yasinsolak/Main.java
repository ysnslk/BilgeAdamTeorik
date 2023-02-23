package com.yasinsolak;

public class Main {
	
	//Usage of Polymorphism in methods:
	public static void hayvani3KezKonustur(Hayvan h) {
		System.out.println("Hayvan 3 kez konuşuyor");
		for (int i = 0; i <3; i++) {
			h.sesCikar();
		}
	}

	public static void main(String[] args) {

		Kedi arsiz = new Kedi("Arsız",5,45);
		System.out.println(arsiz);
		arsiz.sesCikar();
		
		Kopek rex = new Kopek("Rex",7,80);
		rex.sesCikar();
		
		Kus tweety = new Kus("Tweety",1,10);
		tweety.sesCikar();
		
		System.out.println("*********");
		
		//Polymorphism
		Hayvan hayvan;
		hayvan = new Kedi("Sylvester",4,50);
		hayvan.sesCikar();
		
		hayvan = new Kopek("Lassie",5,71);
		hayvan.sesCikar();
		
		hayvani3KezKonustur(tweety);
		hayvani3KezKonustur(arsiz);
		hayvani3KezKonustur(rex);
	}

}
