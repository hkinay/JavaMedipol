package Ders6;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapOrnek {

    private static HashMap <String, Integer> ogrenciNotları = new HashMap<>();

    public static void main(String[] args) {
        notEkle("Ahmet",100);

        System.out.println(notuGetir("Ahmet"));


    }
    public static void notEkle (String isim,int ogrencinot){
        ogrenciNotları.put(isim,ogrencinot);
    }

   public static int notuGetir (String isim){
        return ogrenciNotları.getOrDefault(isim , 0);
            }

     void notGuncelle(String isim, int yeniNot){
        ogrenciNotları.put(isim,yeniNot);
     }

     void notlariYazdir(){
         System.out.println("Tüm sınıf listesi " + ogrenciNotları);
     }

}
