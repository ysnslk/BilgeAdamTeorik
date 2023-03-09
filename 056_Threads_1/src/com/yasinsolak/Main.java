package com.yasinsolak;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main Thread Çalışıyor.....");

		Yazici yaziciThread1 = new Yazici("Yazıcı Thread-1");
		Yazici yaziciThread2 = new Yazici("Yazıcı Thread-2");
		yaziciThread1.start();
		yaziciThread2.start();

		try {
			yaziciThread1.join();
			yaziciThread2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Main Thread Bitti Çıkıyor......");
	}

}
