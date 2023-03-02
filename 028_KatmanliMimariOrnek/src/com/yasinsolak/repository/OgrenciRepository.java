package com.yasinsolak.repository;

import java.util.List;

import com.yasinsolak.repository.entity.Ogrenci;
import com.yasinsolak.utility.DataBase;

public class OgrenciRepository {

	public void save(Ogrenci ogrenci) {
		DataBase.ogrenciListesi.add(ogrenci);
	}

	public void delete(int id) {
		Ogrenci silinecekOgrenci = null;
		for (Ogrenci ogr : DataBase.ogrenciListesi) {
			if (ogr.getId() == id) {
				silinecekOgrenci = ogr;
				break;
			}
		}

		if (silinecekOgrenci != null) {
			DataBase.ogrenciListesi.remove(silinecekOgrenci);
		}
	}

	public void update(Ogrenci ogrenci) {
		for (int i = 0; i < DataBase.ogrenciListesi.size(); i++) {
			if (DataBase.ogrenciListesi.get(i).getId() == ogrenci.getId()) {
				DataBase.ogrenciListesi.get(i).setAd(ogrenci.getAd());
				DataBase.ogrenciListesi.get(i).setSoyad(ogrenci.getSoyad());
			}

		}
	}

	public Ogrenci findById(int id) {
		Ogrenci tempOgrenci = null;
		for (Ogrenci ogr : DataBase.ogrenciListesi) {
			if (ogr.getId() == id) {
				tempOgrenci = ogr;
				break;
			}
		}
		return tempOgrenci;
	}

	public List<Ogrenci> findAll() {
		return DataBase.ogrenciListesi;
	}

}
