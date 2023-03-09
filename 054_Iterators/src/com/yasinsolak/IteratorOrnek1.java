package com.yasinsolak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOrnek1 {

	public static void main(String[] args) {

		// Iterable interface'ini implement eden collections sınıfları istendiğinde
		// bizlere
		// bir Iterator saglamakla mükelleftir.

		// Java Iterator collection sınıfı içindeki elemanlar arasından gezinmesini
		// saglar.
		// En önemli özelliklerinden biri de Collection elemanlarını iteration sırasında
		// remove edebilmeleridir.

		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		listInteger.add(12);
		listInteger.add(24);
		
		Iterator<Integer> iterator = listInteger.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
