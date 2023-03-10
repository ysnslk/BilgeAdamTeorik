package com.yasinsolak;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main thread başladı..");

		Thread yazici1 = new Thread(new Yazici("Printer-1"));
		Thread yazici2 = new Thread(new Yazici("Printer-2"));

		yazici1.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			System.out.println("Thred interrupt yedi");
			e1.printStackTrace();
		}

		yazici2.start();

		try {
			yazici1.join();
		} catch (InterruptedException e) {
			System.out.println("Thred interrupt yedi");
			e.printStackTrace();
		}

		System.out.println("Main thread çalışması bitti çıkıyor...");

	}

}
