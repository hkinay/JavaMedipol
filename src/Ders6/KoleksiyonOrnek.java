package Ders6;

import Ders5.Koleksiyon.Stacks;

import java.util.*;
import java.util.stream.Collectors;

public class KoleksiyonOrnek {
    public static void main(String[] args) {
        System.out.println(" --Arraylist Örneği --");
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Tiran");
        sehirler.add("Üsküp");
        sehirler.add("Priştine");
        sehirler.add("Podrogitsa");
        sehirler.add("Mostar");

        //Stream ile Listedeki şehirleri alfabetik olarak sıralama
        List<String> siralisehirler =sehirler.stream().sorted().collect(Collectors.toList());


        System.out.println(" --Linkedlist Örneği --");
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(5);
        integerLinkedList.add(9);
        integerLinkedList.add(10);
        integerLinkedList.add(3);
        integerLinkedList.add(1);
        integerLinkedList.add(89);

        integerLinkedList.addLast(12);
        integerLinkedList.addFirst(6);

        //Stream ile çift sayıları toplama

        int toplamcift = integerLinkedList.stream().filter(sayi -> sayi%2==0).mapToInt(Integer::intValue).sum();


        System.out.println(" --Vectör Örneği --");

        Vector<Double> gpa = new Vector<>();

        gpa.add(3.42);
        gpa.add(2.18);
        gpa.add(2.99);
        gpa.add(1.42);
        gpa.add(3.18);
        gpa.add(4.00);


        //Stream ile vektör listesinin ortalamasını bulma
        double ortalama = gpa.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        //Yazdırın

       //Stream ile vektör listesinden geçen öğrencilerin sayısı
        short gecenOgrsayisi = (short) gpa.stream().filter(gecme -> gecme >= 2.00).count();

        //Yazdır ve yeni stream yapısı kur

        System.out.println(" --Stack Örneği --");
        Stack <String> dersler = new Stack();
        dersler.add("İleri Java Uygulamaları");
        dersler.add("İleri C#");
        dersler.add("Python programlama");
        dersler.add("Bilgisayar Donanımı");
        dersler.add("İşletim Sistemleri");

        System.out.println("En üstteki Ders: " + dersler.peek() );
        System.out.println("Çıkarılan Ders: " + dersler.pop());
        System.out.println("Stack Dersler: " + dersler);

        //Stream ile derslerin karakter sayılarını gösterir
        int karaktersayi = dersler.stream().mapToInt(String::length).sum();

        //HashMap Örneği
        System.out.println(" --HashMap Örneği --");
        HashMap<String, Integer> pazarlistesi = new HashMap<>();

        pazarlistesi.put("Portakal",50);
        pazarlistesi.put("Elma",45);
        pazarlistesi.put("Karnıbahar",25);
        pazarlistesi.put("Balık",200);

        Map<String,Integer> pahali = pazarlistesi.entrySet().stream().filter(en -> en.getValue()>100).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
           Map<String,Integer> indirimlihali = pazarlistesi.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,entry -> (int)(entry.getValue()*0.85)));



       //List<Integer> indirimliste = pazarlistesi.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,en-> en.getValue()*0.9));


















    }
}
