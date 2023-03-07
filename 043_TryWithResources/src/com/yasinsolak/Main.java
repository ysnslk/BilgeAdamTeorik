package com.yasinsolak;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	//TRY WITH RESOURCES KULLANIMI:
	
	//Closeable interfacesini implement eden herhangi bir sınıfı try-with resources kalıbı ile kullanılır
	//Bu şekilde close için extra finally yazmak zorunda değilsin
	
//	try(declare resources here){
//		
//	}catch(Exception e) {
//		//Exception Handling
//	}

	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter("markalar.txt",true)){
			Scanner sc = new Scanner(System.in);
			String marka="";
			
			//Kullanıcıdan marka girmesini isteyin
			//Kullanıcı -1 girene kadar girdiği markaları txtye yazdık
			
			while (true) {
				System.out.println("Lütfen Bir Marka giriniz");
				marka = sc.nextLine();
				if(marka.equals("-1")) {
					System.out.println("Programdan çıkılıyor dosyayı kontrol edin");
					break;
				}
				writer.write(marka+"\n");
			}
			
			
		} catch (IOException e) {
			System.out.println("I/O Exception Aldık");
			e.printStackTrace();
		}

	}

}
