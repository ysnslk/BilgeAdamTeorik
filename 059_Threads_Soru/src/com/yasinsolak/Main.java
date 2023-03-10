package com.yasinsolak;

public class Main {

	public static void main(String[] args) {
		// 3 tane farklı thread sınıfı oluşturun
		// 1.sınıf: 0-50 arasında 3'erli saysın
		// 2.sınıf: 0-50 arasında 5 erli saysın
		// 3.sınıf: 0-50 arasında 7şerli saysın
		// Aralarda 1 sn beklesin her 3 sınıf da..

		System.out.println("Main thread çalışıyor");
		Thread yazici1 = new Thread_1("Print-1");
		Thread yazici2 = new Thread_2("Print-2");
		Thread yazici3 = new Thread_3("Print-3");
		
		yazici1.start();
		yazici2.start();
		yazici3.start();
		
		
		
		
		System.out.println("Main thread bitti");

	}

}
