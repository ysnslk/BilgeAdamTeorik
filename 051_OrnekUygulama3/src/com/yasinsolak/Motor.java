package com.yasinsolak;

import java.io.Serializable;

public class Motor implements Serializable{

	private int motorNo;

	public Motor(int motorNo) {
		this.motorNo = motorNo;
	}

	public int getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(int motorNo) {
		this.motorNo = motorNo;
	}

}
