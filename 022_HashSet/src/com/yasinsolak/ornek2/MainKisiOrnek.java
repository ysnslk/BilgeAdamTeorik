package com.yasinsolak.ornek2;

import java.util.HashSet;

public class MainKisiOrnek {

	public static void main(String[] args) {

		Kisi k1 = new Kisi(1, "Ali");
		Kisi k2 = new Kisi(2, "Veli");
		Kisi k3 = new Kisi(3, "Çağrı");

		HashSet<Kisi> hashSetKisi = new HashSet<Kisi>();
		hashSetKisi.add(k1);
		hashSetKisi.add(k2);
		hashSetKisi.add(k3);

		for (Kisi k : hashSetKisi) {
			System.out.println(k);
		}

//		System.out.println("\n***\n");
		Kisi k4 = new Kisi(4, "Osman");
		hashSetKisi.add(k4);

		System.out.println("\n****\n");
		for (Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
		
		
	}

}
