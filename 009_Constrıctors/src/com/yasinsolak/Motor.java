package com.yasinsolak;
/* 
 * Constructor (Yapıcı Metod): Nesnelerin ilk oluşumunda çağırılan metod
 * Yazılımcı sınıf içinde constructor tanımlamazsa ,
 * Java o sınıf için boş bir constructor oluşturur.
 * Ancak :
 * Yazılımcı sınıf içine herhangi bir /birdenfazla parametre alan bir constructor tanımlarsa
 * Java otomatik bir constructor oluşturmaz.
 * Bu durumda boş constructor a ihtiyaç duyarsanız sizin manual olarak boş
 * construtor oluşturmanız gerekir.
 */

public class Motor {

	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi;

	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {
//		this.motorHacmi = motorHacmi;
//		this.saseNo = saseNo;
//		this.yakitTuketimi = yakitTuketimi;
		
		this.setMotorHacmi(motorHacmi);
		this.saseNo = saseNo;
		this.setYakitTuketimi(yakitTuketimi);
		
	}
	public Motor () {
		
	}

	public int getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi >= 800 && motorHacmi <= 10000) {
			this.motorHacmi = motorHacmi;
		} else {
			System.out.println(
					"Motor Hacmi 800 - 10000 Dışında girdiğiniz için otomatik olarak 800 şeklinde ayarlanmıştır.");
			this.motorHacmi = 800;
		}

	}

	public int getYakitTuketimi() {
		return yakitTuketimi;
	}

	public void setYakitTuketimi(int yakitTuketimi) {
		if(yakitTuketimi >=4 && yakitTuketimi<=25) {
			this.yakitTuketimi = yakitTuketimi;
		}
		else {
			System.out.println("Yakit tüketim değeri mantıklı sınırlar dışında. Muthemelen yanış değer girildi.Min değer ayarlanıyor.");
			this.yakitTuketimi = 4;
		}
		
	}

	public String getSaseNo() {
		return saseNo;
	}
	public void setBaziMotorBilgileri(int motorHacmi , int yakitTuketimi) {
		this.setYakitTuketimi(yakitTuketimi);
		this.setMotorHacmi(motorHacmi);
	}

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}

}
