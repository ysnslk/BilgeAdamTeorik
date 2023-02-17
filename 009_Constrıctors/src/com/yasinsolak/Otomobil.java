package com.yasinsolak;

public class Otomobil {
	public static String ARAC_TIPI = "Kara Aracı";

	// Otomobil sınıfından türetilecek her bir nesneniin
	// sahip olabileceği nesneye ait özellikler

	private String marka;// String nesneleri null olarak initialize edilir.
	private String model;
	private int yil;// Sayısal veri tipleri 0 larak initialize edilir.
	private int aracinKm;
	private Motor motor;// Otomobil sınıfının içinde farklı bir sınıf nesnesini üye değişken olarak
						// tutuyorum.

	// Parametre : Bir metodu parantez içindeki alığı değişkenlere denir.
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor motor) {
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		this.setAracinKm(aracinKm);
		this.setMotor(motor);
	}

	public Otomobil(String marka,String model) {
		this.setMarka(marka);
		this.setModel(model);
	}

	
	
	public Otomobil(String model, int yil, Motor motor) {
		this.setModel(model);
		this.setYil(yil);
		this.setMotor(motor);
	}

	public void araciSur(int km) {
		System.out.println("Araç " + km + " km yol yapıyor");
		aracinKm = aracinKm + km;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAracinKm() {
		return aracinKm;
	}

	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		if (motor != null) {
			this.motor = motor;
		} else {
			System.out.println("Otomobile takmaya çalışılan motor nesnesi yok");
		}

	}

	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", aracinKm=" + aracinKm + ", motor="
				+ motor + "]";
	}

}
