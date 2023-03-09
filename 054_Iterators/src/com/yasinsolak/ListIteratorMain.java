package com.yasinsolak;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMain {

	public static void main(String[] args) {

		// ListIterator
		/*
		 * next(): ileri previous() : geri hasNext() : ileride eleman var mı
		 * hasPreviousNext() : geride eleman var mı ?
		 */

		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Müjdat");
		list.add("Necip");
		list.add("Serhan");
		System.out.println(list);

		// Listeyi baştan sona gezmek için
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Listeyisondan başa gezmek için

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
