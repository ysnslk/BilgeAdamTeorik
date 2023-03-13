package question4;

public class Main {

	public static void main(String[] args) {
		Yolcu yolcu1 = new EkonomiYolcu(12, "Ahmet", "Şekerci");
		Yolcu yolcu2 = new BusinessYolcu(13, "Zeliha", "Uygun",true);
		Yolcu yolcu3 = new BusinessYolcu(14, "Mehmet", "Çalışkan",false);
		yolcu1.biletAl(EFirmaAdi.ADJ);
		yolcu1.biletAl(EFirmaAdi.ADJ);
		yolcu1.biletAl(EFirmaAdi.PEGASUS);
		yolcu1.biletAl(EFirmaAdi.ADJ);
		yolcu2.biletAl(EFirmaAdi.ADJ);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu3.biletAl(EFirmaAdi.ADJ);
		yolcu1.ucagaBin();
		yolcu2.ucagaBin();
		yolcu3.ucagaBin();
		yolcu1.checkInYap();
		yolcu1.checkInYap();
		yolcu2.checkInYap();
		yolcu3.checkInYap();
		yolcu1.ucagaBin();
		yolcu2.ucagaBin();
		yolcu3.ucagaBin();
		yolcu1.yolcuBilgileriniGetir();
		yolcu2.yolcuBilgileriniGetir();
		yolcu3.yolcuBilgileriniGetir();
		

	}

}
