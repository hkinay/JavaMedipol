package Ders6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapler {

    public static void main(String[] args) {

        HashMapOrnegi();
        TreeMapOrnegi();


           }

    private static void TreeMapOrnegi() {

        TreeMap<String , Integer> treeMap = new TreeMap<>();

        treeMap.put("Köknar" , 15);
        treeMap.put("Çınar" , 50);
        treeMap.put("Meşe" , 25);
        treeMap.put("Ardıç" , 30);

        treeMap.get("Çınar");
        treeMap.getOrDefault("Kayısı",0); // Kayısı olmadığı için 0 döner

        //firstKey ilk anahtarı döner
        treeMap.firstKey();
        //lastKey son anahtarı döner
        treeMap.lastKey();

        //çift olarak ilk
        treeMap.firstEntry();

        //çift olarak son
        treeMap.lastEntry();

        //aralıklı getirme
        TreeMap<String , Integer> araliklideger = (TreeMap<String, Integer>) treeMap.subMap("Çınar" , "Ardıç");

        System.out.println(araliklideger);

        //headMap verilen elemana kadar alır
        //tailMap verilen elemandan sonrasını alır
        //subMap belirli aralığı alır


        //tersten getirmek için descendingMap kullanılır

        treeMap.descendingMap();











    }

    private static void HashMapOrnegi() {
        HashMap<String,Integer> siniflistesi = new HashMap<>();


        siniflistesi.put("Ahmet" , 1001);
        siniflistesi.put("Ayşe", 1002);
        siniflistesi.put("Berk" , 1003);
        siniflistesi.put("Can", 1004);
        siniflistesi.put("Deniz" , 1005);
        siniflistesi.put("Emre" , 1006);


        int numara = siniflistesi.get("Emre");
        siniflistesi.remove("Berk");
        boolean varMi = siniflistesi.containsKey("Deniz");  //true

        //Tüm map listesini siler
        // siniflistesi.clear();

        siniflistesi.size();

        //Tüm Değerleri Getirir

        System.out.println(siniflistesi.values());



        for (Map.Entry<String , Integer > deger: siniflistesi.entrySet()){
            System.out.println(deger.getKey() +" = " +  deger.getValue());


        }

        //  siniflistesi.forEach((anahtar,deger)) ->System.out.println(anahtar + " = " + deger);


    }

}
