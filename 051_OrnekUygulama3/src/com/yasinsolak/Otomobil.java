package com.yasinsolak;

import java.io.Serializable;

//POJO
public class Otomobil implements Serializable{

	private String marka;
	private String model;
	private int yil;
	private Motor motor;

	public Otomobil(String marka, String model, int yil) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
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
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + "]";
	}

}
