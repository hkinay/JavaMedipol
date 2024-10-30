package Ders5.Koleksiyon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListler {
    public static void main(String[] args) {


        ArrayList<Integer> sayilar = new ArrayList<>();

        ArrayList<String> siniflistesi = new ArrayList();

        siniflistesi.add("Ahmet");

        //Hazır bir diziyi Arrayliste dönüştürme
        String [] hazirdizi = {"Ahmet", "Hasan","Ayşe","Berk"};
        ArrayList<String> yeniStringDizi = new ArrayList<>(Arrays.asList(hazirdizi));





        //Eleman Ekleme
        sayilar.add(34);
        sayilar.add(35);
        sayilar.add(36);
        sayilar.add(37);
        sayilar.add(34);
        sayilar.add(33);
        sayilar.add(43);

        //Belirli bir indekse eleman ekleme
        sayilar.add(2,42);

        System.out.println(sayilar);

        sayilar.remove(2);



        int c = sayilar.get(3);
        System.out.printf("Sayılar dizisindeki 3. eleman %d",c);

        //Boyut bulma
        System.out.println(sayilar.size());

        Collections.sort(sayilar);
        System.out.println(sayilar);


        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));

        }


        sayilar.set(1,32); // 1. indeksteki elemanı 32 ye günceller

        boolean varMi = sayilar.contains(35); // içerip içermediğine göre true yada false döner
        boolean bosmu = sayilar.isEmpty(); // boş ise true, değilse false döner

        sayilar.clear(); // liste tamamen silinir





      /*  ArrayList<String> arabalar = new ArrayList<>();

        arabalar.add("Audi");
        arabalar.add("Toyota");
        arabalar.add("TOGG");
        arabalar.add("Toyota");

        ArrayList<String> klasikArabalar = new ArrayList<>();

        klasikArabalar.add("Impala");
        klasikArabalar.add("Ford");




        System.out.println(arabalar.get(2));
        System.out.println(arabalar.size());
        arabalar.set(2,"Fiat");
        arabalar.set(0,"Volswagen");
        System.out.println(arabalar);
        arabalar.clear(); //Bütün liste silinir
        arabalar.remove(1);

        arabalar.indexOf("Toyota"); //ilk karşılaştığı indeks numarasını getirir
        arabalar.lastIndexOf("Toyota"); //listenin sonundan sayarak indeks numarasını getirir
        arabalar.addAll(klasikArabalar);
*/







    }



}
