package com.yasinsolak;

public class Main {
	
	//Anonymous Inner Class'lar Interface'ler kullanılarak da oluşturulabilir

	public static void main(String[] args) {

		IUcabilir ucanKaz = new IUcabilir() {

			@Override
			public void uc() {
				System.out.println("Kaz uçuyor");
			}
		};

		
		ucanKaz.uc();
		
		IUcabilir serce = new IUcabilir() {

			@Override
			public void uc() {
				System.out.println("Serce uçuyor");
			}
		};
		
		serce.uc();
	}
}
