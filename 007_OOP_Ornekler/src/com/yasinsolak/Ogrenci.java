package com.yasinsolak;

public class Ogrenci {

	public int ogrenciNo;
	public String ad;
	public String soyad;
	public IletisimBilgileri iletisimBilgileri;
	

	
	

	@Override
	public String toString() {
		return "Öğrenci No : " + ogrenciNo + ", Ad : " + ad + ", Soyad : " + soyad + ", İletişim Bilgileri : "
				+ iletisimBilgileri;
	}





	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciNo = 100;
		ogrenci1.ad = "Ali";
		ogrenci1.soyad = "Özkan";
		ogrenci1.iletisimBilgileri = new IletisimBilgileri();
		ogrenci1.iletisimBilgileri.tel = 5554443322L;
		ogrenci1.iletisimBilgileri.adres ="Ihlamur Sok. No: 5 Çankaya/Ankara";
		System.out.println(ogrenci1.toString());

		// toString() Kullanımı : syso içine nesneyi yazarsak syso otomatik olarak
		// nesnenin toString() metodunu çağırır.
		System.out.println(ogrenci1);

		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciNo = 101;
		ogrenci2.ad = "Zeynep";
		ogrenci2.soyad = "Çalışkan";
		ogrenci2.iletisimBilgileri = new IletisimBilgileri();
		ogrenci2.iletisimBilgileri.tel = 5322223344L;
		ogrenci2.iletisimBilgileri.adres ="Manolya Apt  No: 5 Kadıköy/İstanbul";
		
		System.out.println(ogrenci2);
		
		
		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciNo = 102;
		ogrenci3.ad = "Ahmet";
		ogrenci3.soyad = "Kaya";
		ogrenci3.iletisimBilgileri = new IletisimBilgileri();
		ogrenci3.iletisimBilgileri.tel = 5426665588L;
		ogrenci3.iletisimBilgileri.adres ="Menekşe Apt. No: 65 Karşıyaka/İzmir";
		System.out.println(ogrenci3.toString());
		
		System.out.println("\n\n ***************\n\n");
		Ogrenci[] ogrenci = new Ogrenci[3];
		ogrenci[0]=ogrenci1;
		ogrenci[1]=ogrenci2;
		ogrenci[2]=ogrenci3;
		
		for (Ogrenci ogr : ogrenci) {
			System.out.println(ogr);
		}
		
		
	}

}
