package com.yasinsolak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void dosyadanTekbirByteOkuma() {

		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("dosya.txt");
			char c = (char) fileInputStream.read();// 1 byte ı int olarak okur.Char a cast ederek çeviririz
			System.out.print(c);
			c = (char) fileInputStream.read();// 1 byte ı int olarak okur.Char a cast ederek çeviririz
			System.out.print(c);
			c = (char) fileInputStream.read();// 1 byte ı int olarak okur.Char a cast ederek çeviririz
			System.out.print(c);
			c = (char) fileInputStream.read();// 1 byte ı int olarak okur.Char a cast ederek çeviririz
			System.out.print(c);
			c = (char) fileInputStream.read();// 1 byte ı int olarak okur.Char a cast ederek çeviririz
			System.out.print(c);
			c = (char) fileInputStream.read();// 1 byte ı int olarak okur.Char a cast ederek çeviririz
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Dosya bulunamadı...");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Dosya okuma sırasında hata oluştu...");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu");
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Dosya kapatılırken hata oldu");
			}
		}
	}

	public static void dosyaninOrtasindanByteOkuma() {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("dosya.txt");

			fileInputStream.skip(8);
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			fileInputStream.skip(2);
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Dosya bulunamadı...");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Dosya okuma sırasında hata oluştu...");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu");
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Dosya kapatılırken hata oldu");
			}
		}
	}

	public static void dosyaninTumunuOkuma() {
		FileInputStream fileInputStream = null;
		int okunan;
		String metin = "";
		try {
			fileInputStream = new FileInputStream("dosya.txt");
			while ((okunan = fileInputStream.read()) != -1) {
				metin = metin + (char) okunan;
			}
			System.out.println(metin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Dosya bulunamadı...");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Dosya okuma sırasında hata oluştu...");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu");
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Dosya kapatılırken hata oldu");
			}
		}
	}
	
	public static void dosyaninBelirtilenKisminiOku(int start , int howMuch) {
		
	}

	public static void main(String[] args) {

		// dosyadanTekbirByteOkuma();
		//dosyaninOrtasindanByteOkuma();
		dosyaninTumunuOkuma();
		
		/*
		 * Ödev :
		 * Bir metod yazınız
		 * Bir dosyanın n. karakterinden başlayıp m tane karakter okusun ve ekrana yazsın
		 * dosyaninBelirtilenKisminiOku
		 */
		
		System.out.println("Hoşçakalın");

	}
}
