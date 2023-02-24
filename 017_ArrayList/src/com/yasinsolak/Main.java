package com.yasinsolak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	private static void printArrayList(List<Kisi> list) {

		System.out.println("\n--------\n");
		for (Kisi kisi : list) {
			// System.out.println(kisi.getAd()+" "+kisi.getSoyad());
			System.out.println(kisi);
		}

	}

	private static void printList(List<String> list) {

		System.out.println("\n--------\n");
		for (String name : list) {
			// System.out.println(kisi.getAd()+" "+kisi.getSoyad());
			System.out.println(name);
		}

	}

	public static void main(String[] args) {

		// ArrayList<String> cars = new ArrayList<String>();
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println(cars);
		for (String car : cars) {
			System.out.println(car);
		}

		// -------------------------------
		/*
		 * Arraylise içine primitive veri tipleri yazılmaz. WRAPPER class kullanılır.
		 * int => Integer float => Float
		 */

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(7);
		arrList.add(10);
		System.out.println(arrList);

		// ArrayListler içinde kendi nesnelermizi kullanalım.

		System.out.println();

		Kisi k1 = new Kisi("John", "Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Robert");
		k2.setSoyad("Donavan");
		Kisi k3 = new Kisi("Ali", "Kaya");

		ArrayList<Kisi> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		Main.printArrayList(list);

		// Remove
		// Remove : 2 farklı yöntem vardır.
		// 1-Nesne referansını gönderirsiniz.
		// 2-Çıkarmak istediğiniz nesnenin indexini gönderirsiniz.
		// list.remove(k2);
		list.remove(1);
		Main.printArrayList(list);

		System.out.println();

		// List<Kisi> list2 = new ArrayList<>();
		List<Kisi> list2 = new ArrayList<Kisi>();
		list2.add(new Kisi("Ahmet", "Emre"));
		Main.printArrayList(list2);

		// ArrayList'lerde araya eleman ekleme
		List<String> l = Main.listeOlustur();
		for (String s : l) {
			System.out.println(s);
		}
		System.out.println();
		l.add(1, "Ayşe");
		for (String s : l) {
			System.out.println(s);
		}

		System.out.println(l.get(1));
		System.out.println("\n-------------\n");
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("Barbara");
		linkedList.remove("John");
		printList(linkedList);

		// System.out.println(linkedList);

		Main.printList(linkedList);
		Main.printList(cars);

		linkedList.remove("John");
		Main.printList(linkedList);

		System.out.println(linkedList.get(0));

		// Araya eleman ekleme
		linkedList.add(1, "Robert");
		Main.printList(linkedList);
	}

	private static List<String> listeOlustur() {
//		List<String> list = new ArrayList<>();
//		list.add("Ali");
//		list.add("Veli");
//		return list;

		List<String> list = new LinkedList<>();
		list.add("Ali");
		list.add("Veli");
		return list;
	}

	// Linked List

	// Arraylist hızlı random erişimi sağlar.
	// Dizinin içindeki herhangi bir elemanı sabit sürede getirir.
	// Ancak arraylis e aradan eleman ekleme veya çıkarma gibi işlemler
	// çok uzun vakit alır.

	// Linklistlerde ise araya eleman ekleme veya silme arraylislere göre çok daha
	// hızlı olur.
	// Ancak Linkedlist belirli bir indexteki eleman erişim hızında Arraylisete göre
	// yavaş kalır.

}
