package com.yasinsolak;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//Stack içinde synchronized metodlar bulunur. 
		//Vector sınıfı gibi 
		Stack<String> stack = new Stack<>();
		stack.add("Kedi");
		stack.add("Köpek");
		stack.add("Aslan");
		stack.add("Kus");
		
		for (String s : stack) {
			System.out.println(s);
		}
		
		//LIFO Mantığı
		
		//peek(); stack'e son giren elemanı getir.(Göster)
		
		System.out.println("\n------\n");
		System.out.println(stack.peek());
		//pop() : stack'e son giren elemanı çıkart metodu
		System.out.println("\n--- pop ---\n");
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		//isEmpty() :  stack boş mu kontrolü
		
		System.out.println("Stack boş mu ? "+ stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println("Stack boş mu ? "+ stack.isEmpty());
		
		if(!stack.isEmpty()) {
			stack.pop();
		}
		
	}

}
