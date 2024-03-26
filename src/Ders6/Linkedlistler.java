package Ders6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlistler {
    public String ad;
    public String soyad;
    public double version;

    public int yil;

    public Linkedlistler(String ad, String soyad, double version, int yil) {
        this.ad = ad;
        this.soyad = soyad;
        this.version = version;
        this.yil = yil;
    }



    public void denemeler(){

        LinkedList<String> listem = new LinkedList<>();

        listem.add("Elma");
        listem.add("Armut");
        listem.add("Kaşar");
        listem.addFirst("Listenin Başı ");
        listem.addLast("Listenin Sonu");


        Iterator<String> otele = listem.iterator();
        while (otele.hasNext()){
            System.out.println(otele.next());
        }

        listem.remove("Armut");
        listem.set(3,"Yeni Eleman");

        for (int i = 0; i < listem.size(); i++) {
            System.out.println(listem.get(i));

        }

//ISTISNA Exception Handling
try{
    //hata oluşabilecek kodlar
    Scanner al = new Scanner(System.in);
    System.out.println("Yaşınız : ");
    al.nextInt();

}
catch (Exception e){
    System.out.println("Yanlış sayı girdiniz. Yeniden deneyiniz. " + e);
}

int a = 10;
int b = 20;
if (a == b){
    throw new RuntimeException();
}





    }






}
