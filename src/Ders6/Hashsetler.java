package Ders6;

import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.*;

public class Hashsetler {

    public static void main(String[] args) {

        //   Hashsetornegi();
          treeSetOrnegi();

     //   LinkedHashSetOrnegi();


    }
    private static void LinkedHashSetOrnegi() {
        LinkedHashSet <String> meyveler = new LinkedHashSet<>();

        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Portakal");
        meyveler.add("Muz");
        meyveler.add("Portakal");

        System.out.println(meyveler);

        //remove, contains, size, isEmpty

        String metin = "Evet, şimdi bu bir rastgele bir Metin normalde işte tasarımcılar kullanıyor. Bu tarz metinleri hani orada bir Metin olduğunu belirtmek için böyle bir ifade var. Baskı için kullanılan bir Metin yapısı bu. Ondan sonra şimdi bunu mesela ne diyelim bir.";

        String[] kelimeler = metin.split(" ");

        LinkedHashSet<String> benzersizKelimeler = new LinkedHashSet<>();
        for (String k : kelimeler){
            benzersizKelimeler.add(k.toLowerCase());

        }


        System.out.println("Benzersiz Kelimeler " + benzersizKelimeler);
    }

    private static void treeSetOrnegi() {
        TreeSet <String> treeSet = new TreeSet<>();

        treeSet.add("ağaç1");
        treeSet.add("ağaç2");
        treeSet.add("ağaç3");
        treeSet.add("ağaç4");


        //ileri doğru öteleme
        Iterator<String> tree = treeSet.iterator();
        while (tree.hasNext()){
            System.out.println(tree.next());
        }

        //Geriye doğru öteleme
        Iterator<String> tre = treeSet.descendingIterator();
        while(tre.hasNext()){
            System.out.println(tre.next());


        }

        //En düşük değer
        System.out.println("En düşük değer : " + treeSet.pollFirst());

        // ilk elemanı döner
        System.out.println("İlk elemanı döner : " + treeSet.first());

        //son elemanı döner
        System.out.println("Son elemanı döner : "+ treeSet.last());

        System.out.println("verilen elemandan düşük elemanı döner : " + treeSet.lower("ağaç3"));

        System.out.println("Verilen elemandan yüksek elemanı döner " + treeSet.higher("ağaç2"));

        //En yüksek değer
        System.out.println("En yüksek değer : " + treeSet.pollLast());

        //Tersten Sıralama
        System.out.println("Tersten sıralama : " + treeSet.descendingSet());


        System.out.println("HeadSet" + treeSet.headSet("ağaç2",true));

        System.out.println("Subset" + treeSet.subSet("ağaç1",false,"ağaç3",true));


        System.out.println("---------------TreeSet Örnekler ----------------------");
        TreeSet <String> harflerAgaci = new TreeSet<>();

        harflerAgaci.add("A");
        harflerAgaci.add("B");
        harflerAgaci.add("C");
        harflerAgaci.add("D");

        System.out.println("Başlangıç Seti" + harflerAgaci);
        System.out.println("İlk Değer " + harflerAgaci.headSet("İlk Değer"));
        System.out.println("HeadSet " + harflerAgaci.headSet("C"));
        System.out.println("Subset" + harflerAgaci.subSet("A","C"));
        System.out.println("TailSet" + harflerAgaci.tailSet("C"));


        TreeSet <Integer> tekrarsızyaslar = new TreeSet<>();

        tekrarsızyaslar.add(10);
        tekrarsızyaslar.add(5);
        tekrarsızyaslar.add(25);
        tekrarsızyaslar.add(5);
        tekrarsızyaslar.add(20);

        System.out.println("Girilen yaslar : " + tekrarsızyaslar);
    }

    private static void Hashsetornegi() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Ahmet");
        hashSet.add("Mehmet");
        hashSet.add("Hüseyin");
        System.out.println(hashSet);
        hashSet.remove("Hüseyin");

        //içerir mi
        boolean icerirMi = hashSet.contains("Mehmet"); //true döner
        hashSet.size(); //boyutunu verir

        // hashSet.clear(); // bütün elemanları siler





        Iterator<String> ite = hashSet.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        //DÖNGÜLER İLE KULLANIMI
        for (String a : hashSet){
            System.out.println(a);
        }

        // LİSTEDE TEKRARLANAN SAYILARIN KALDIRILMASI

        List<Integer> karisiksayilar = new ArrayList<>();
        karisiksayilar.add(3);
        karisiksayilar.add(5);
        karisiksayilar.add(7);
        karisiksayilar.add(5);
        karisiksayilar.add(7);

        HashSet<Integer> essizsayilar = new HashSet<>(karisiksayilar);
     /*   for (int u:karisiksayilar) {
            essizsayilar.add(u);

        }*/


        List<Integer> sonuc = new ArrayList<>(essizsayilar);


        System.out.println("Eşsiz Sayılar" + essizsayilar);






    }

    public static int mystery(String str){
        if (str.length() == 1) return 0;
        else {
            if(str.substring(0,1).equals("y")) return 1+
                    mystery(str.substring(1));
            else return mystery(str.substring(1));
            }
    }
}
