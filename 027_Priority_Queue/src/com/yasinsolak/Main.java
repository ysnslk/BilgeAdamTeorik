package com.yasinsolak;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.management.Query;

public class Main {

	public static void main(String[] args) {
		/*
		 * add() / offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz
		 * özellikleri taşırlar.) offer exception atmaz ekleyemezse add atar. clear()
		 * metodu --------> Kuyruğu Temizler. contains(Object o) ------> o objesi
		 * kuyruğun içindeyse true, değilse false döner. peek() ------> Kuyruğun
		 * başındaki elemanı döner.Eğer kuyruk boşsa null referans döner. poll() ----->
		 * Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa
		 * null referans döner. size()------> Kuyruğun içindeki eleman sayısını döner.
		 * 
		 * 
		 * Integer lerde en yüksek öncelik en küçük sayıda, en düşük öncelik en büyük
		 * sayıdadır. Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce
		 * gelen stringte, en düşük öncelik alfabetik olarak sözlükte en son gelen
		 * stringtedir.
		 */

		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(100);
		System.out.println(queue.peek());
		System.out.println(queue.contains(100));
		System.out.println("\n- - - - \n");

		// Önemli Not :
		// Queue içinde foreach ile dolaşırsanız yanlış sıralama görebilirsiniz.

//		for (int i : queue) {
//			System.out.println(i);
//		}

//		while (!queue.isEmpty()) {
//			System.out.println("Eleman çıkarılıyor : " + queue.poll());
//		}

		// İçinde kendi sınıflarımızı tutabilen priority queue ler yazmak

		Queue<Ogrenci> queue2 = new PriorityQueue<>();
		queue2.offer(new Ogrenci("Ali", 107));
		queue2.add(new Ogrenci("Veli", 105));
		queue2.offer(new Ogrenci("Zeynep", 101));
		queue2.add(new Ogrenci("Kaan", 120));
		
		while (!queue2.isEmpty()) {
			System.out.println("Eleman çıkarılıyor : " + queue2.poll());
		}
		
	}

}
