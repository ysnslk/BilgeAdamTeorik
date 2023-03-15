package com.yasinsolak.MultiLockThreadliYazici;

import java.util.ArrayList;
import java.util.Random;

public class MultiLockThreadliListeYazici {

	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	Random random = new Random();

	// Aşağıda 2 tane lock yani anahtar kilit çifti oluşturuyoruz
	// Daha önceki örnekte metodun başına sync yazıyorduk . Böylece tek bir anahatar
	// oluşuyordu
	// Ve bununla metodları kilitliyorduk.Bir thread herhangi bir sync metoda
	// girdiğinde tüm sync metodlar kilitleniyordu.
	private Object lock1 = new Object(); // Anahtar/Kilit ürettik
	private Object lock2 = new Object();

	public void list1DegerEkle() {

		// Metodun başına sync yazmak yerine sadece kod blogumuzun başına kilit
		// koyuyoruz
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}

	}

	public synchronized void list2DegerEkle() {

		// Metodun başına sync yazmak yerine sadece kod blogumuzun başına kilit
		// koyuyoruz
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void listelereDegerEkle() {
		for (int i = 0; i < 500; i++) {
			list1DegerEkle();
			list2DegerEkle();
		}
		// System.out.println("L1 : " + list1.size() + " L2 : " + list2.size());
	}

	public void threadlerOlustur() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				listelereDegerEkle();

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				listelereDegerEkle();

			}
		});

		long baslangic = System.currentTimeMillis();
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("L1 : " + list1.size() + " L2 : " + list2.size());

		long bitis = System.currentTimeMillis();
		System.out.println("Geçen süre : " + (bitis - baslangic));
	}

}
