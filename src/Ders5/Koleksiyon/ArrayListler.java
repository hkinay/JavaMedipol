package Ders5.Koleksiyon;

import java.util.ArrayList;

public class ArrayListler {
    public static void main(String[] args) {
        ArrayList<String> arabalar = new ArrayList<>();

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








    }



}
