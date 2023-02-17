package com.yasinsolak;

public class Main {

	public static void main(String[] args) {

		Motor motor = new Motor();
		motor.setMotorHacmi(140000);
		// motor.saseNo = "MW4355";
		motor.setYakitTuketimi(10);
		System.out.println(motor);

		//
		Otomobil otomobil1 = new Otomobil();
		otomobil1.setAracinKm(0);
		otomobil1.setMarka("Opel");
		otomobil1.setModel("Insignia");
		otomobil1.setYil(2023);

		Motor motor1 = new Motor();
		motor1.setMotorHacmi(1500);
		motor1.setYakitTuketimi(10);

		otomobil1.setMotor(motor1);
		System.out.println(otomobil1);

		Motor motor2 = new Motor();
		motor2.setMotorHacmi(1800);
		motor2.setYakitTuketimi(12);
		otomobil1.setMotor(motor2);

		System.out.println("\nMotor Değiştikten Sonra");
		System.out.println(otomobil1);

		System.out.println();
		System.out.println(motor2.getMotorHacmi());
		System.out.println(otomobil1.getMotor().getMotorHacmi());

		System.out.println();

		Otomobil otomobil2 = new Otomobil();
		otomobil2.setMarka("Audi");
		otomobil2.setMarka("A3");
		otomobil2.setYil(2023);

		System.out.println(otomobil2.getMotor());

		Motor m = null;
		otomobil2.setMotor(m);
		// otomobil2.getMotor().setMotorHacmi(1400); Hata verir çünkü otomobil2 de hala
		// motor nesnesi yok. Sadece nesne referansı var.
		m = new Motor();
		otomobil2.setMotor(m);
		otomobil2.getMotor().setMotorHacmi(1400);
		System.out.println("Otomobil 2 Motor Hacmi :"+otomobil2.getMotor().getMotorHacmi());
	}

}
