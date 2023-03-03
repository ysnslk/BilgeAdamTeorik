package com.yasinsolak;

public class CheckedExceptionsMain {

	public static void main(String[] args) {
		/*
		 * Checked exceptionlar direk Exception sınıfından türerler. Bunlar program
		 * compile edilirken yakalanması ve handle edilmesi (ilgilenilmesi) zorunlu
		 * exceptionlardır. Bu tarz exceptionlar mutlaka kod run edilmeden try - catch
		 * blokları içinde handle edilmelidir. Aksi halde compile hatası alırsınız ,
		 * programı çalıştıramazsınız (Run edemezsiniz)
		 * 
		 * 
		 * Not : Checked Exceptionlar runtime Exceptiondan türemezler
		 * 
		 * 
		 */
		System.out.println(1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(2);
	}

}
