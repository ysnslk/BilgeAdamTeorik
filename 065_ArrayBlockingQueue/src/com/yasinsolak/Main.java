package com.yasinsolak;

public class Main {

	public static void main(String[] args) {

		Stock stock = new Stock();

		Thread produce = new Thread(new Runnable() {

			@Override
			public void run() {
				stock.produce();
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				stock.consumer();
			}
		});

		// Mal üretmeye başladı
		produce.start();

		// Stokta biraz mal biriksin istiyoruz
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Mal tüketmeye başladı
		consumer.start();

		try {
			produce.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
