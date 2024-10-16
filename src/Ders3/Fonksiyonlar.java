package Ders3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Fonksiyonlar {


    //public
    //private
    //protected

    private String ozelnesne = "Özel nesne";
    private int yas = 15;

    public String bilgileriGoster(String a) {



        return a;

    }

    public String getOzelnesne() {
        return ozelnesne;
    }

    public void setOzelnesne(String ozelnesne) {
        this.ozelnesne = ozelnesne;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public static void nesnesiz() {
        System.out.println("nesnesiz static fonksiyondur");


    }

    public void nesneli() {



        System.out.println("nesne gerektiren static olmayan fonksiyon");


    }

      public static int topla(int a, int b) {

        // Bu kısım method içinde olacakların işlevi

        int toplam = a + b;
        return toplam;
    }

    public static int topla(int a, int b, int c) {

        return a + b + c;
    }

    public static int max(int x, int b) {
        if (x > b) return x;
        else return b;
    }

    public static int min(int x, int y) {
        int i = (x < y) ? x : y;//Ternary Operatörü
        return i;

    }

    public static void diziler() {
        int[] sayilar = {3, 7, 11, 18};

        Arrays.toString(sayilar); // sayı dizisini Stringe çevirdik


        for (int sayi : sayilar) { //Foreach ile dizi elemanlarına erişim sağladım
            sayi = sayi + 1;
        }


    }
//Recursive Fonksiyonu


    public static int faktoriyel(int faktorsayisi) {

            if (faktorsayisi == 0 || faktorsayisi == 1) {
                return 1;
            }
            return faktorsayisi + faktoriyel(faktorsayisi - 1);
        }




        //Built in function Gömülü Fonksiyonlar

    public static int random(int sayi){
        Random a = new Random();
        int uretilensayi = a.nextInt(7,77);
        a.nextInt(100);
        a.nextInt(34,99);


        double matematiksayisi = Math.random();




        return uretilensayi;
    }




    }




