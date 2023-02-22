package com.yasinsolak;

public class Sekreter extends Personel {

	private long tel1SeriNo;
	private long tel2SeriNo;
	
	// Hiçbişi yazmasanızda otomatik oluşturulur.
	public Sekreter() {
		//super();//=> Siz super() yazmasanızda java otomatik olarak buraya görünmez bir super ekler.

	}
	//Alt sınıfıların constructorları mutlaka 1 tane üst sınıf constructorı çağırmak zorundadır.Extra cons otomatik çağırılmaz..!!
	//Siz üst sınıf cos çağırmazsanız java boş cons çağırır.
	public Sekreter(long tel1SeriNo) {
		super("Test",7);
		this.tel1SeriNo = tel1SeriNo;
		System.out.println("public Sekreter(long tel1SeriNo) Bu Cons çağırıldı.");
	}

	public long getTel1SeriNo() {
		return tel1SeriNo;
	}

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	public long getTel2SeriNo() {
		return tel2SeriNo;
	}

	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}

}
