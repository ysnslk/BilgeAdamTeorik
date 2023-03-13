package question4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {

	private final int EKONOMIFIYAT = 100;

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.print(getAd() + " " + getSoyad() + " Bilgileriniz --> ");
		for (HashMap.Entry<String, Integer> bilet : biletler.entrySet()) {
			System.out.print(bilet+	" ");
		}
		System.out.println();

	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {

		int normalFiyat = getBASEFIYAT() + EKONOMIFIYAT;

		if (biletler.containsKey(String.valueOf(firmaAdi))) {
			int fiyat = getBASEFIYAT() + normalFiyat;
			biletler.put(String.valueOf(firmaAdi), biletler.get(String.valueOf(firmaAdi)) + fiyat);
		} else {
			biletler.put(String.valueOf(firmaAdi), normalFiyat);
		}
		System.out
				.println(getAd() + " İsimli Yolcu " + firmaAdi + " Firmasınından Ekonomi biletiniz başarı ile alındı.");
		for (HashMap.Entry<String, Integer> bilet : biletler.entrySet()) {
			System.out.print(bilet + " ");
		}
		System.out.println();

	}

	@Override
	public void checkInYap() {
		if (isCheckin() == false) {
			System.out.println("Checkin yapılmıştır iyi yolculuklar");
			this.setCheckin(true);
		} else {
			System.out.println("Zaten Check in yapılmıştır.");
		}

	}

	@Override
	public void ucagaBin() {
		if (isCheckin() == true) {
			System.out.println(getAd() + " " + getKoltukNo() + " Uçağa Binebilirsiniz");
		} else {
			System.out.println("Lütfen ilk önce checkin yaptırın...!");
		}

	}
}
