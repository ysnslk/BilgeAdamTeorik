package com.alikaya;

public class YardimciSinif {

	public static void hello(){
		System.out.println("Hello from YardimciSinif");
	}
	
	protected static void hello2() { // Sadece aynı package içinde çağırılır
		System.out.println("hello2");
	}
	
	private static void hello3() {
		System.out.println("hello3");
	}
	public static void main(String[] args) {
		YardimciSinif.hello3();
	}
	
}
