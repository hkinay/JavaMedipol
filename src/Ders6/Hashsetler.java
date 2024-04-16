package Ders6;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hashsetler {

    public static void main(String[] args) {



        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Ahmet");
       hashSet.add("Mehmet");

        Iterator<String> ite = hashSet.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

   TreeSet <String> treeSet = new TreeSet<>();

        treeSet.add("ağaç1");
        treeSet.add("ağaç2");
        treeSet.add("ağaç3");

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
