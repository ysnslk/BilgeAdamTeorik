package com.yasinsolak;
/*    Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır. 
 *    Bu özellik, kodun nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.
 *    Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi    için bazı işlemler birleştirilerek tek bir işlem gibi gösterilir.
 *    Bu birleştirme işlemine kapsülleme denir.    
 *    Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.    
 *    Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan     anahtar kelimeler grubuna verilen isimdir (public, private, protected).        
 *    Metotlar ve değişkenler bir anahtar sözcük ile önceden bellirlenen sınırlar dahilinde kullanılabilir.    Bu anahtar kelimeler şu şekilde sıralanabilir : public, private, protected.
 *   
 */

public class Motor {

	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi;

	public int getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(int motorHacmi) {
		if(motorHacmi >= 800 && motorHacmi<=10000) {
			this.motorHacmi = motorHacmi;
		}
		else {
			System.out.println("Motor Hacmi 800 - 10000 Dışında girdiğiniz için otomatik olarak 800 şeklinde ayarlanmıştır.");
			this.motorHacmi = 800;
		}
		
	}

	public int getYakitTuketimi() {
		return yakitTuketimi;
	}

	public void setYakitTuketimi(int yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}

	public String getSaseNo() {
		return saseNo;
	}

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}

}
