package com.yasinsolak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DosyaKopyalayici {

	public static List<Integer> dosyaIcerigiByteList = new ArrayList<>();

	public static void dosyadanOku(String dosyaAdi) {

		// FileInputStream dosyaları binary olarak okur ve yazar
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(dosyaAdi);
			int okunan;
			while ((okunan = fileInputStream.read()) != -1) {
				dosyaIcerigiByteList.add(okunan);

			}
			System.out.println("Dosya Okunuyor....");
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı..!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası..!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu..!");
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("File close sırasında bir hata oluştu..!");
					e.printStackTrace();
				}
			}
		}

	}

	public static void dosyayaKopyala(String dosyaAdi) {
		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(dosyaAdi);

			for (int yazilacakByte : dosyaIcerigiByteList) {
				fileOutputStream.write(yazilacakByte);
			}
			System.out.println("Dosya Kopyalanıyor....");
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı veya yazma hakkınız yok");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası oluştu ! Belirtilen dosyaya yazma işlemi yapılamadı.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("HATAAAA");
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatma hatası");
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		dosyadanOku("C:\\test3\\r2d2.jpg");
		dosyayaKopyala("C:\\test3\\r2d2_kopya1.jpg");
		dosyayaKopyala("C:\\test3\\r2d2_kopya2.jpg");
		dosyayaKopyala("C:\\test3\\r2d2_kopya3.jpg");
		System.out.println("Görüşürüz");
	}
}
