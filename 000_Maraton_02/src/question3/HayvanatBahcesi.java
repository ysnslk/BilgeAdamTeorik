package question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HayvanatBahcesi {

	static List<Hayvan> hBahcesi = new ArrayList<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		hBahcesi.add(m);
	}

	public void bahceyeSurungenEkle(Surungen s) {
		hBahcesi.add(s);
	}

	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}

	public void hayvaninCinsiniBul(String hayvanAdi) {

		boolean kontrol = false;
		for (Hayvan h : hBahcesi) {
			if (h.getAd().equalsIgnoreCase(hayvanAdi)) {
				System.out.println(hayvanAdi + " bir " + h.getCins());
				kontrol = true;
				break;
			}
		}
		if (!kontrol) {
			System.out.println(hayvanAdi + " isimli hayvan hayvanat bahçesinde bulunmuyor...!");
		}
	}

	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		boolean kontrol = false;
		for (Hayvan h : hBahcesi) {
			if (h.getAd().equalsIgnoreCase(hayvanAdi)) {
				System.out.println(h);
				kontrol = true;
				break;
			}
		}
		if (!kontrol) {
			System.out.println(hayvanAdi + " isimli hayvan hayvanat bahçesinde bulunmuyor...!");
		}

	}

	public void hayvaniHareketEttir(String hayvanAdi) {
		String cins = "";
		String ad = "";
		int index = 0;
		for (int i = 0; i < hBahcesi.size(); i++) {
			if (hBahcesi.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				cins = hBahcesi.get(i).getCins();
				ad = hBahcesi.get(i).getAd();
				index = i;
			}
		}

		if (cins.equals("Memeli")) {
			MemeliHayvan m = (MemeliHayvan) hBahcesi.get(index);
			m.yuru();
		} else if (cins.equals("Surungen")) {
			Surungen s = (Surungen) hBahcesi.get(index);
			s.surun();
		}

	}

	public static void main(String[] args) {

		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Neşeli", 120, 200, true));
		Yilan yilan = new Yilan("Piton", 50, 450, true);
		Aslan aslan = new Aslan("Ateşli", 100, 150, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		yilan.sesCikar();
		aslan.sesCikar();
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Piton");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Ateşli");
		hayvanatBahcesi.hayvaninCinsiniBul("Piton");
		hayvanatBahcesi.hayvaninCinsiniBul("Neşeli");
		hayvanatBahcesi.hayvaniHareketEttir("Piton");
		hayvanatBahcesi.hayvaniHareketEttir("Ateşli");

	}
}
