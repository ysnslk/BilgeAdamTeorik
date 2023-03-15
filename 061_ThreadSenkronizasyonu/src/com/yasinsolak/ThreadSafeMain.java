package com.yasinsolak;

public class ThreadSafeMain {

	private int count = 0;

	//Sync metodları aynı anda sadece 1 tane thread çalıştırabilir
	//Oda anahtar mekanizması gibi düşünün.İlk giren thread odayı kitler
	
	public synchronized void threadlerBurayaSenkronOlarakGirer() {
		count++;
	}

	public void threadleriCalistir() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread-1 is over...");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread-2 is over...");
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Count değişkeninin son değeri : " + count);
		ThreadSafeMain main = new ThreadSafeMain();
			 main.threadleriCalistir();
	}
	
	public static void main(String[] args) {
		ThreadSafeMain main = new ThreadSafeMain();
		main.threadleriCalistir();

	}

}
