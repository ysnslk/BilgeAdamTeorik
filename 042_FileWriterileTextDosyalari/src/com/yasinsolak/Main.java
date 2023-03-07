package com.yasinsolak;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	// FileWriter ile sadece text dosyaları yazılabilir.
	// Write() metodunun içine direkt String verilebilir.

	public static void main(String[] args) {
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter("dosya.txt", true);
			
			//FileWriter ile dosyaya veriyi byte'a çevirmeden direk String olarak yazabiliriz.
			fileWriter.write("Yasin Solak\n");
			fileWriter.write("Kazım Şeker");
		} catch (IOException e) {
			System.out.println("Dosya açılırken veya yazarken hata oluştu");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Bilinmeyen hata");
		}finally {
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatırken hata oluştu");
					e.printStackTrace();
				}
			}
		}
		System.out.println("Bye");
	}

}
