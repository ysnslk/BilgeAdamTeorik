package com.yasinsolak.controller;

import java.util.Scanner;

import com.yasinsolak.repository.OgretmenRepository;
import com.yasinsolak.repository.entity.Ogrenci;
import com.yasinsolak.repository.entity.Ogretmen;

public class OgretmenController {
	
	private OgretmenRepository ogretmenRepository;

	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}

	public void ogretmenEkleme() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eklenecek öğretmenin adını giriniz : ");
		String ad = sc.nextLine();
		System.out.println("Eklenecek öğretmenin soyadını giriniz : ");
		String soyad = sc.nextLine();
		System.out.println("Eklenecek öğretmenin nosunu giriniz : ");
		int tcKimlik = sc.nextInt();
		Ogretmen ogretmen = new Ogretmen(tcKimlik, ad, soyad);

		this.ogretmenRepository.save(ogretmen);
	}

	public void ogretmenSil() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Silinecek öğretmenin nosunu giriniz : ");
		int id = sc.nextInt();
		
		this.ogretmenRepository.delete(id);
		
	}

	public void ogretmenGuncelle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Güncellenecek öğretmenin adını giriniz : ");
		String ad = sc.nextLine();
		System.out.println("Güncellenecek öğretmenin soyadını giriniz : ");
		String soyad = sc.nextLine();
		System.out.println("Güncellenecek öğretmenin TcKimlikNo giriniz : ");
		int id = sc.nextInt();
		Ogretmen ogretmen = new Ogretmen(id,ad, soyad);
		this.ogretmenRepository.update(ogretmen);
	}

	public void ogretmenBul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğretmenin TcKimlikNo giriniz : ");
		int id = sc.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz öğretmen : ");
		System.out.println(ogretmen);
	}

	public void ogretmenListesiniGoster() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*  Öğretmen Listesi *");
		System.out.println("*                   *");
		System.out.println("*********************");
		
		for (Ogretmen ogr : this.ogretmenRepository.findAll()) {
			System.out.println(ogr);
		}
	}

}
