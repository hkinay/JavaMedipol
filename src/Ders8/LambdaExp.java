package Ders8;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

interface Deneme{
    void yazdir();
}

interface Hesaplama{
    int islem (int a, int b);
}

@FunctionalInterface
interface Calculation{
    int calculate (int x, int y);
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
        sayilar.add(11);
        sayilar.forEach((u) ->{
            System.out.println(u);
        });



        //Tek parametre ve tek ifade
        //Temel Lambda yazılımı
        //(parametre) -> {ifadeler}
//LAMBDA GÖRÜNÜMÜ
     //   (parametre) -> ifade veya {kod bloğu}

        Runnable basit = ()-> System.out.println("Merhaba Lambdaya Giriş");




        System.out.println("----- Consumer Örneği ----");

        //Parametre alan lambda
        Consumer<String> ornek = (a) -> System.out.println(a);

        Consumer<Integer> method = (n) -> {
            if(n%2==0)
                System.out.println(n);
              };
        sayilar.forEach(method);

        //Birden fazla parametre
        BiFunction<Integer,Integer,Integer> topla = (a,b) -> a + b;
    Calculation cross = (int a,int b) -> a * b;
    System.out.println(cross.calculate(4,5));

        StringFunction ünlem = (s) -> s + "!";
        StringFunction soru = (s) -> s + "?";
        yaziFormati("Merhaba " , ünlem);
        yaziFormati("Merhaba " , soru );

FonkArayuz obj = (int y) -> System.out.println(2*y);

obj.Hesaplama(10);
obj.normalHesaplama();


        System.out.println("-----------ÇOK PARAMETRELİ LAMBDA---------------");
        //Hesaplama topla = (int x , int y) -> x+y;
        Hesaplama carpma = (int x , int y) -> x*y;
        Hesaplama bolme = (int g , int h) -> g/h;
        LambdaExp lobj = new LambdaExp();

      //  System.out.println("Toplama sonucu : " + lobj.islem(3,4,topla));
        System.out.println("Çarpma sonucu : " + lobj.islem(4,5,carpma));
        System.out.println("Bölme sonucu : " + lobj.islem(39,3,bolme));

        dene(()-> System.out.println("Bunu yazdır"));


        //Hazır Fonksiyonel Arayüzler

        Predicate<Integer> ciftSayi = sayi -> sayi % 2 == 0;
        //Function<String,Integer> uzunluk = degisken -> degisken.length();
        Consumer<String> yazdir = str -> System.out.println(str);
        Supplier<Double> randomSayi = () -> Math.random();

        //STREAM API İLE LAMBDA

        List<String> meyveler = Arrays.asList("Elma","Armut","Kiraz","Ayva");

        //FİLTRELEME
        meyveler.stream().filter(meyve -> meyve.startsWith("A") ).forEach(System.out::println);

        //SIRALAMA
        meyveler.stream().sorted((a,b) ->a.length() - b.length()).forEach(System.out::println);

        //DÖNÜŞTÜRME
        List <Integer> uzunluklar = meyveler.stream().map(String::length).collect(Collectors.toList());

        //Stream Api ile İleri Seviye Lambda İşlemleri

        List<Integer> numbers = Arrays.asList(12,3,45,6,7,8,9);

        int toplam = sayilar.stream().reduce(0,(a,b)-> a+b);

        //Gruplandırma

        Map<Integer,List<String>> uzunlugunaGore = meyveler.stream().collect(Collectors.groupingBy(String::length));

        //PARALEL İŞLEME KISMINI BU NOKTADA İSTEYEN ÇALIŞABİLİR
        //ParalelStream


        //ÖRNEK UYGULAMA

        List<Urun> urunler = new ArrayList<>();
        Predicate<Urun> fiyatkontrol = urun -> urun.getFiyat() > 50 ;
        Consumer<Urun> zamYap = urun -> urun.setFiyat(urun.getFiyat()*1.2);

        urunler.stream().filter(fiyatkontrol).forEach(System.out::println);
        urunler.stream().peek(zamYap).map(Urun::getAd).forEach(System.out::println);



        //bir runnable Örneği
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim iç sınıf ile çalışan Thread");
            }
        });
        thread.start();

        Thread thread1 = new Thread(()-> System.out.println("lambda ile çalışan thread"));
        thread1.start();


        // bir consumer örneği

        List<String> kitaplar = Arrays.asList("Data","Bilişsel Psikoloji","Master Algoritma","Enstitü");

        Consumer <String> yazdir1 = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }

            @Override
            public Consumer<String> andThen(Consumer<? super String> after) {
                return Consumer.super.andThen(after);
            }
        };
        kitaplar.forEach(yazdir1);

        //Lambda ifadeli consumer

        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        kitaplar.forEach(stringConsumer);

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

class Urun{
    private String ad;
    private String skt;
    private double fiyat;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSkt() {
        return skt;
    }

    public void setSkt(String skt) {
        this.skt = skt;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }




}


