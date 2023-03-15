package com.guraysungur;

import java.util.concurrent.Semaphore;

public class AgUzerindenDosyaKopyalayici {
	
	private Semaphore semaphore;
	
	public AgUzerindenDosyaKopyalayici(int threadSayisi) {
		semaphore = new Semaphore(threadSayisi); // bu semaphore'u kullanan kod bloğuna aynı anda threadSayisi kadat thread girebilir!
	}
	
	
	public void dosyaKopyalayiciThreadMetodu(String ip) {
		try {
			semaphore.acquire();
			System.out.println("Thread dosya kopyalamaya başlıyor, hedef: " + ip);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread dosya kopyalamyı bitrdi çıkıyor hedef IP: " + ip);
		semaphore.release();
	}

}
