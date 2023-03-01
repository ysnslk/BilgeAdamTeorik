package com.yasinsolak;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// Multi - threading applicationlarda ArrayListler safe kabul edilmez.
		// Multi - threading uygulamalarda ArrayList yerine vektor kullanılmalıdır.
		// Vektor thread safe bir sınıftır.

		List<String> vector = new Vector<>();

		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Aslan");
		vector.add("Kaplan");
		for (String s : vector) {
			System.out.println(s);
		}

		// Iterator kullanımı
		System.out.println();

		ListIterator<String> iterator = vector.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
