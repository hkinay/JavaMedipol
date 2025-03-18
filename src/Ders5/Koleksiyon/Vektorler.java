package Ders5.Koleksiyon;

import java.util.Iterator;
import java.util.Vector;

public class Vektorler {
    public static void main(String[] args) {
        Vector<String> isimler = new Vector<>();
        Vector<Integer> sayilar = new Vector<>();

        isimler.add("Kemal");
        isimler.addElement("Sibel");
        isimler.add(2,"Gökmen");

        System.out.println(isimler);

        isimler.remove("Gökmen");
        isimler.removeAllElements(); //Tüm elemanları temizler

        isimler.capacity(); //Vektörün mevcut kapasitesini döner
        isimler.size(); // Vektörün içindeki mevcut eleman sayısını döner
        isimler.ensureCapacity(10);

        isimler.indexOf("Sibel");
        isimler.lastIndexOf("Gökmen");


        //For döngüsü ile
        for (int i = 0; i < isimler.size(); i++) {

            System.out.println(isimler.get(i));

        }


        //Foreach
        for (String isim : isimler){
            System.out.println(isim);
        }


        //Iterator kullanarak ilerleme


        Iterator<String> iterator = isimler.iterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }





    }
}
