package com.yasinsolak;

//Bir class'ı Thread sınıfından extends ederseniz .Türettiğiniz bu yeni class da Thread olur

public class Yazici extends Thread {

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

	// Dİkkat :
	// Threadimiz start() ettirildiğinde (çalıştırıldığında ) çalışacak kodlar run
	// metodunun içine yazılmalıdır.
	@Override
	public void run() {
		System.out.println(this.isim + " İsimli Thread Çalışıyor...");

		for (int i = 0; i < 10; i++) {
			System.out.println(this.isim + " yazıyor : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(this.isim + " İsimli Thread İşini Bitirdi...");
	}

}
