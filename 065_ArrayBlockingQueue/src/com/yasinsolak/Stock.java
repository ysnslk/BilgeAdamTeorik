package com.yasinsolak;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stock {

	Random rnd = new Random();

	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10); // Capacity : 10 (Max 10 eleman tutabilir.)
																		// İçinde multilocklar sayesinde thread safe bir
																		// yapı
	// Produce() metodu random bir sayı üretip queue ya ekleyecek

	public void produce() {
		while (true) {
			Integer val = rnd.nextInt(0, 1000);
			try {
				queue.put(val);
				System.out.println("Producer stoğa mal ekliyor : " + val);
				System.out.println("Stoğun güncel size : " + queue.size());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Sayı eklenemedi...!");
				e.printStackTrace();
			}
		}

	}
	
	//Consumer() metodu stoktan integer değer çekip tüketir
	public void consumer() {
		while (true) {
			try {
				Thread.sleep(3000);
				
				Integer val;
				val = queue.take();
				System.out.println("-- Consumer stoktan mal çekiyor : " + val);
				System.out.println("Stoğun güncel size : " + queue.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
