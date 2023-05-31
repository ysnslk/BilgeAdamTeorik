package org.example;

import org.example.entity.Ogrenci;
import org.example.entity.OgrenciNotu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {
    private static List<OgrenciNotu> notlar = List.of(
            OgrenciNotu.builder().ders("Java").not_no(1L).not(60).build(),
            OgrenciNotu.builder().ders("Java").not_no(2L).not(50).build(),
            OgrenciNotu.builder().ders("Java").not_no(3L).not(40).build(),
            OgrenciNotu.builder().ders("Java").not_no(4L).not(20).build(),
            OgrenciNotu.builder().ders("Java").not_no(5L).not(80).build(),
            OgrenciNotu.builder().ders("Java").not_no(6L).not(70).build(),
            OgrenciNotu.builder().ders("Java").not_no(7L).not(30).build(),
            OgrenciNotu.builder().ders("Java").not_no(8L).not(60).build(),
            OgrenciNotu.builder().ders("Java").not_no(9L).not(40).build(),
            OgrenciNotu.builder().ders("Java").not_no(10L).not(50).build(),
            OgrenciNotu.builder().ders("Java").not_no(11L).not(20).build(),
            OgrenciNotu.builder().ders("Java").not_no(12L).not(70).build(),
            OgrenciNotu.builder().ders("Java").not_no(13L).not(60).build(),
            OgrenciNotu.builder().ders("Java").not_no(14L).not(90).build(),
            OgrenciNotu.builder().ders("Java").not_no(15L).not(60).build()
    );
    private static List<Ogrenci> ogrenciler = List.of(
            Ogrenci.builder().okulNo("okl001").ad("Ali").sinif("1-A").notlar(notlar.subList(0,3)).build(),
            Ogrenci.builder().okulNo("okl002").ad("Bahar").sinif("2-B").notlar(notlar.subList(3,6)).build(),
            Ogrenci.builder().okulNo("okl003").ad("Deniz").sinif("4-A").notlar(notlar.subList(12,15)).build(),
            Ogrenci.builder().okulNo("okl004").ad("Tuğba").sinif("5-D").notlar(notlar.subList(7,10)).build()
    );
    public static void main(String[] args) {

        Map<String,List<OgrenciNotu>> ogrNot = ogrenciler.stream()
                .collect(Collectors.toMap(ogr -> ogr.getOkulNo(),ogr -> ogr.getNotlar()));
        System.out.println(ogrNot);
        System.out.println("\n*****************************************\n");
        Map<String,List<OgrenciNotu>> ogrNot2 = ogrenciler.stream()
                .collect(Collectors.toMap(Ogrenci::getOkulNo,Ogrenci::getNotlar));
        System.out.println(ogrNot2);
        System.out.println("*****************************************");

        ogrenciler.get(0).getNotlar().stream().mapToDouble(OgrenciNotu::getNot).average().ifPresent(System.out::println);

        List<Ogrenci> gecenOgrenciListesi = ogrenciler.stream()
                .filter(ogr -> ogr.getNotlar().stream().mapToDouble(OgrenciNotu::getNot).average().getAsDouble() > 50)
                .collect(Collectors.toList());
        System.out.println("*****************************************");
        System.out.println(gecenOgrenciListesi);

        System.out.println("*****************************************");

        ogrenciler.forEach(ogr -> {
            ogr.getNotlar().forEach(not -> {
                not.setNot(reverseNumber(not.getNot()));
            });
        });

        System.out.println(ogrenciler);
    }

    private static double reverseNumber(Integer number){
        String numberStr = number.toString();
        String reverseNumberStr = new StringBuilder(numberStr).reverse().toString();
        return double(reverseNumberStr);
    }
}