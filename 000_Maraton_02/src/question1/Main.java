package question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Rehber> rehberList = new ArrayList<>();
		Rehber rhb;
		String[] array = null;
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("rehber.txt")))) {

			while (sc.hasNextLine()) {
				String okunanSatir = sc.nextLine();
				array = okunanSatir.split(";");
				rhb = new Rehber(array[0].trim(), array[1].trim(), array[2].trim());
				rehberList.add(rhb);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Telefon numarasını bulmak istediğiniz kişinin adını giriniz");
		String ad = sc.next();
		System.out.println("Lütfen Telefon numarasını bulmak istediğiniz kişinin soyadını giriniz");
		String soyad = sc.next();
		String adSoyad = ad + " " + soyad;

		for (Rehber string : rehberList) {
			if (string.getAdSoyad().equalsIgnoreCase(adSoyad)) {
				System.out.println("Telefon Numarası : " + string.getTel());
				break;
			} else {
				System.out.println("Böyle bir telefon numarası kayıtlı değil!!!");
				break;
			}
		}

	}

}
