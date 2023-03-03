package com.yasinsolak;

import java.io.IOException;

//Checked Exception sınıflarından birini türeteceğiz
public class AsiriHizException extends IOException {

	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {

		System.out.println("Bu bir Aşırı Hız Exception Checked ' ıdır.");
	}

}
