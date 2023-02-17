package com.yasinsolak;

public class Main {

	public static void main(String[] args) {

		// Motor motor = new Motor();
		// motor.setMotorHacmi(1400);
		// motor.setYakitTuketimi(10);

		Motor motor = new Motor(1400, "MW1453", 10);
		System.out.println(motor);

		Motor motor2 = new Motor(15000, "25ABM214", 1200);
		System.out.println(motor2);

		motor2.setYakitTuketimi(1000);
		System.out.println(motor2);

		Otomobil otomobil1 = new Otomobil("BMW", "1.18", 2020, 57500, motor2);
		System.out.println(otomobil1);
		Otomobil otomobil2 = new Otomobil("Renault", "Clio", 2017, 120000, new Motor(1200, "AA213", 8));
		System.out.println(otomobil2);
		otomobil2.setAracinKm(122000);
		System.out.println(otomobil2);
		otomobil2.getMotor().setMotorHacmi(1800);;
		System.out.println(otomobil2.getMotor().getMotorHacmi());
	
		System.out.println();
		Otomobil otomobil3 = new Otomobil("Fiat","Egea");
		System.out.println(otomobil3);
		
		otomobil3.setMotor(new Motor(2000,"AAN1235",6));
		System.out.println(otomobil3.getMotor());
	
	
		
		
	}

}
