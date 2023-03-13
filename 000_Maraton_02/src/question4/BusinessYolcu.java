package question4;

import java.util.HashMap;

public class BusinessYolcu extends Yolcu {

	private final int BUSINNESFIYAT = 200;
	private final int BUSINNESVIPFIYAT = 150;
	private boolean isVip;

	public BusinessYolcu(int id, String ad, String soyad, boolean isVip) {
		super(id, ad, soyad);
		this.isVip = isVip;
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.print(getAd() + " " + getSoyad() + " Bilgileriniz --> ");
		for (HashMap.Entry<String, Integer> bilet : biletler.entrySet()) {
			System.out.print(bilet + " ");
		}
		System.out.println();

	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		if (isVip) {
			setToplamFiyat(getBASEFIYAT() + BUSINNESFIYAT + BUSINNESVIPFIYAT);

		} else {
			setToplamFiyat(getBASEFIYAT() + BUSINNESFIYAT);
		}
		biletler.put(String.valueOf(firmaAdi), getToplamFiyat());
		System.out.println(
				getAd() + " İsimli Yolcu " + firmaAdi + " Firmasınından Bussines biletiniz başarı ile alındı.");
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
