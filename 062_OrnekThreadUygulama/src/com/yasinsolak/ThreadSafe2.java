package com.yasinsolak;

import java.util.Random;

public class ThreadSafe2 {

	private int count = 0;

	protected synchronized void uretimTuketim(int degisimSayisi) {
		count += degisimSayisi;
		if (degisimSayisi < 0) {
			System.out.println("Stoktan mal çıkışı");
			System.out.println("Güncel Stok : " + count);
		} else {
			System.out.println("Üretim sonucu stoğa mal girişi");
			System.out.println("Güncel Stok : " + count);
		}

	}

	private void threadleriCalistir() {

		// Üretici Thread
		Thread ureticiThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Üretici Thread Çalıştı");
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int uretimSayisi = r.nextInt(10);
					uretimTuketim(uretimSayisi);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Üretici Thread Sonlandı...");
			}
		});

		// Tüketici Thread
		Thread tuketiciThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Tüketici Thread Çalıştı");
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int tuketimSayisi = r.nextInt(5) * -1;
					uretimTuketim(tuketimSayisi);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Tüketici Thread Sonlandı...");
			}
		});

		ureticiThread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		tuketiciThread.start();
		try {
			ureticiThread.join();
			tuketiciThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThreadSafe2 threadSafe2 = new ThreadSafe2();
		threadSafe2.threadleriCalistir();

	}
}
