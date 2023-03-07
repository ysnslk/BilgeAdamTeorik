package com.yasinsolak;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteOrnek {

	public static void main(String[] args) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt"))) {

			writer.write("Özgür Öz, 443\n");
			writer.write("Ali Kaya, 333\n");
			writer.write("Şafak Kaya, 123\n");
			writer.write("Ömer Altın, 332\n");
			writer.flush();//Flush kullanımı opsiyonel :  Siz flush() yazarsanız bufferda o ana kadar biriken veriler stream e yazılır
			writer.write("Mehmet Şekerci, 335\n");
			writer.write("Ali Öz, 338\n");
			writer.write("Ömer Şekerci, 339\n");

		} catch (FileNotFoundException e) {
			System.out.println("Dosya yazma hatası");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O Exception");
			e.printStackTrace();
		}
		
		System.out.println("Byeee");

	}

}
