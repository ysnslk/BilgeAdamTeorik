package com.yasinsolak;

import java.util.Scanner;

public class Test {

	private Object lock = new Object();

	public void thread1Metod() {
		synchronized (lock) {

			System.out.println("Thread1 is running..");
			System.out.println("Thread1 waits ....");
			try {
				lock.wait(); // Ben uyuyacağım lock ı bırakablirim. isteyen alabilir.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1 is awake and continues...");
		}
	}

	public void thread2Metod() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		synchronized (lock) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Thread2 is running..");
			System.out.println("Lütfen bir sayı girin : ");
			sc.nextInt();
			lock.notify();
			System.out.println("Thread2 quits...");
		}
	}

}
