
package com.yasinsolak;

//Unchecked Exception sınıflarından birinde türetiyoruz
public class AsiriHizException extends ArithmeticException{

	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir Aşırı hız Unchecked Exception'ıdır. Yüksek Hız tespit edildi");
	}
	
	
}
