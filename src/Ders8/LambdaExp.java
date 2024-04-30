package Ders8;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.function.Consumer;

interface Deneme{
    void yazdir();
}

interface Hesaplama{
    int islem (int a, int b);
}


interface StringFunction{
    String run(String str);
}

interface FonkArayuz
{
    void Hesaplama (int x);

    default void normalHesaplama ()
    {
        System.out.println("Bu default hesaplamadır");
    }
}

public class LambdaExp {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(9);
        sayilar.add(8);
        sayilar.forEach((u) ->{
            System.out.println(u);
        });

        System.out.println("----- Consumer Örneği ----");

        Consumer<Integer> method = (n) -> {
            if(n%2==0)
                System.out.println(n);
              };
        sayilar.forEach(method);

        StringFunction ünlem = (s) -> s + "!";
        StringFunction soru = (s) -> s + "?";
        yaziFormati("Merhaba " , ünlem);
        yaziFormati("Merhaba " , soru );

FonkArayuz obj = (int y) -> System.out.println(2*y);

obj.Hesaplama(10);
obj.normalHesaplama();


        System.out.println("-----------ÇOK PARAMETRELİ LAMBDA---------------");
        Hesaplama topla = (int x , int y) -> x+y;
        Hesaplama carpma = (int x , int y) -> x*y;
        Hesaplama bolme = (int g , int h) -> g/h;
        LambdaExp lobj = new LambdaExp();

        System.out.println("Toplama sonucu : " + lobj.islem(3,4,topla));
        System.out.println("Çarpma sonucu : " + lobj.islem(4,5,carpma));
        System.out.println("Bölme sonucu : " + lobj.islem(39,3,bolme));

        dene(()-> System.out.println("Bunu yazdır"));



       }

    public static void yaziFormati (String str, StringFunction format){
        String sonuc = format.run(str);
        System.out.println(sonuc);

    }
    private int islem (int a , int b, Hesaplama k){
        return  k.islem(a,b);

    }

    private static void dene (Deneme a){
        a.yazdir();
    }





}


