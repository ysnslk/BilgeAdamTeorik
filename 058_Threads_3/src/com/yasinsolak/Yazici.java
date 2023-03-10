package com.yasinsolak;

//Thread oluşturmada 2. yöntem : Runnable interface'ini implement edin
public class Yazici implements Runnable {

	private String isim;

	public Yazici(String isim) {
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
		return "Yazici [isim=" + isim + "]";
	}

	@Override
	public void run() {
		System.out.println(this.isim + " İsimli thread çalışıyor...");
		for (int i = 1; i <= 5; i++) {
			System.out.println(this.isim + " yazıyor: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.isim+" isimli thread çıkıyor...");

	}

}
