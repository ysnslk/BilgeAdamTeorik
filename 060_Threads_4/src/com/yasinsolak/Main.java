package com.yasinsolak;

public class Main {

	// Thread oluşturma 3. Yöntem
	// Anonymous Inner Class ile Interface üzeriden Thread oluşturma
	public static void main(String[] args) {

		System.out.println("Main Thread Çalışıyor...");

		Thread printer1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread-1 Çalışıyor");
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread-1 Yazıyor " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread-1 Çıkıyor");
			}

		});

		Thread printer2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread-2 Çalışıyor");
				for (int i = 0; i < 7; i++) {
					System.out.println("Thread-2 Yazıyor " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread-2 Çıkıyor");
			}

		});
		
		
		printer1.start();
		printer2.start();
		
		System.out.println("Main thread çıkıyor");

	}

}
