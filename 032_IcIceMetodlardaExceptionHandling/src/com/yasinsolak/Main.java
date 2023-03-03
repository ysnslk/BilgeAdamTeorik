package com.yasinsolak;

public class Main {

	public void function3() {
		// try {
		int x = 25 / 0;
		// } catch (Exception e) {
		System.out.println("Function 3 exception satiri");
		// }
		System.out.println("Function 3 sonu...");
	}

	public void function2() {
		try {
			function3();
		} catch (Exception e) {
			System.out.println("Function 2 exception satiri");
		}
		System.out.println("Function 2 sonu...");
	}

	public void function1() {
		try {
			function2();
		} catch (Exception e) {
			System.out.println("Function 1 exception satırı");
		}
		System.out.println("Function 1 sonu...");
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.function1();
		System.out.println("Byee...");
	}

}
