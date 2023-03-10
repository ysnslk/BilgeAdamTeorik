package com.yasinsolak;

public class Thread_1 extends Thread {

	private String isim;

	public Thread_1(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Thread_1 [isim=" + isim + "]";
	}

	@Override
	public void run() {
		System.out.println(this.isim + " Thread Çalışıyor....");
		for (int i = 0; i < 50; i += 3) {
			System.out.println(this.isim + " yazıyor: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.isim + " Thread Bitti....");
	}

}
