package com.yasinsolak;

public class ThreadNotSafeMain {

	private int count;

	public void threadleriCalistir() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
				}
				System.out.println("Thread-1 is over...");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
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

		// Bu şekilde çalışırsa 10000k yazmaz çünkü ikiside aynı anda couna erişmeye
		// çalışıyor
		System.out.println("Count değişkeninin son değeri : " + count);

	}

	public static void main(String[] args) {
		ThreadNotSafeMain main = new ThreadNotSafeMain();
		main.threadleriCalistir();

	}

}
