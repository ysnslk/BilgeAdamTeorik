package com.yasinsolak.controller;

import java.util.Iterator;
import java.util.Scanner;

import com.yasinsolak.repository.OgrenciRepository;
import com.yasinsolak.repository.entity.Ogrenci;
import com.yasinsolak.utility.DataBase;

public class OgrenciController {

	private OgrenciRepository ogrenciRepository;

	public OgrenciController() {
		this.ogrenciRepository = new OgrenciRepository();
	}

	public void ogrenciEkleme() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eklenecek öğrencinin adını giriniz : ");
		String ad = sc.nextLine();
		System.out.println("Eklenecek öğrencinin soyadını giriniz : ");
		String soyad = sc.nextLine();
		System.out.println("Eklenecek öğrencinin nosunu giriniz : ");
		int id = sc.nextInt();
		Ogrenci ogrenci = new Ogrenci(ad, soyad, id);

		// a.)
		//DataBase.ogrenciListesi.add(ogrenci);

		// b:)
		this.ogrenciRepository.save(ogrenci);

	}

	public void ogrenciSil() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Silinecek öğrencinin nosunu giriniz : ");
		int id = sc.nextInt();
		
		this.ogrenciRepository.delete(id);
	}

	public void ogrenciGuncelle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Güncellenecek öğrencinin adını giriniz : ");
		String ad = sc.nextLine();
		System.out.println("Güncellenecek öğrencinin soyadını giriniz : ");
		String soyad = sc.nextLine();
		System.out.println("Güncellenecek öğrencinin no giriniz : ");
		int id = sc.nextInt();
		Ogrenci ogrenci = new Ogrenci(ad, soyad, id);
		this.ogrenciRepository.update(ogrenci);
	}

	public void ogrenciBul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğrenci numarasını giriniz : ");
		int id = sc.nextInt();
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz öğrenci : ");
		System.out.println(ogrenci);
	}

	public void ogrenciListesiniGoster() {
		System.out.println("*********************");
		System.out.println("*                   *");
		System.out.println("*  Öğrenci Listesi  *");
		System.out.println("*                   *");
		System.out.println("*********************");
		
		for (Ogrenci ogr : this.ogrenciRepository.findAll()) {
			System.out.println(ogr);
		}
	}

}
