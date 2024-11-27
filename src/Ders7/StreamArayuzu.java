package Ders7;


import Ders8.LambdaExp;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

public class StreamArayuzu {
    public static void main(String[] args) {

       /* //kısa lambda gösterimi
       parametre -> expression

       param1 , param2 -> expression
               (param1, param2) -> {kod bloğu}

        //ARRAY İÇİNDEKİ SAYILARIN YAZDIRILMASI
        ArrayList<Integer> numaralar = new ArrayList<Integer>();
       numaralar.add(42);
       numaralar.add(34);
       numaralar.add(25);
       numaralar.add(41);
       numaralar.forEach((a)-> System.out.println(a));


       Hesaplama arayüzü eklenmeli
       Arayüz içine işlem methodu eklenmeli

        System.out.println("-----------ÇOK PARAMETRELİ LAMBDA---------------");
        Hesaplama topla = (int x , int y) -> x+y;
        Hesaplama carpma = (int x , int y) -> x*y;
        Hesaplama bolme = (int g , int h) -> g/h;
        LambdaExp lobj = new LambdaExp();

        System.out.println("Toplama sonucu : " + lobj.islem(3,4,topla));
        System.out.println("Çarpma sonucu : " + lobj.islem(4,5,carpma));
        System.out.println("Bölme sonucu : " + lobj.islem(39,3,bolme));*/

        List<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Konya");
        sehirler.add("İzmir");
        sehirler.add("Manisa");

        Stream<String> stream = sehirler.stream();

        Stream<String> sehirstream = sehirler.stream();


        System.out.println("-----------Listenin sıralanmış hali -----------");
        List result = sehirler.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            System.out.println(i);

        }

        System.out.println("-----------İ ile başlayanlar liste -----------");
        sehirstream.filter(n -> {;
        return n.startsWith("İ");}).forEach(n -> System.out.println(n) );

        System.out.println("------Sayılardan oluşan liste------------");
        ArrayList<Integer> numaralar = new ArrayList<Integer>();
        numaralar.add(42);
        numaralar.add(34);
        numaralar.add(25);
        numaralar.add(41);
        numaralar.add(34);
        //SAYILAR
        numaralar.stream().forEach(a -> System.out.println(a));
        //FİLTRELENMİŞ SAYILAR
        numaralar.stream().filter(sayi -> sayi > 30).forEach(sayi -> System.out.println(sayi));
        //YİNELENENLERİ KALDIR
        numaralar.stream().distinct().forEach(sayi -> System.out.println(sayi));
        //SIRALAMA
        numaralar.stream().sorted().forEach(sayi -> System.out.println(sayi));
        //TERSTEN SIRALAMA
        numaralar.stream().sorted(Comparator.reverseOrder()).forEach(sayi -> System.out.println(sayi));

        //ALLMATCH

        if(numaralar.stream().allMatch(a -> a%2==0)){
            System.out.println("Numaralardan hepsi çift");
        }else  {
            System.out.println("Numaralardan en az bir tanesi çift değil");
        }


        //ANYMATCH
        if(numaralar.stream().anyMatch(a ->a%2==0)){
            System.out.println("Numaralardan en az bir tanesi çift");
        }else  {
            System.out.println("Numaralardan hiçbiri çift değil");
        }



        System.out.println("-----------a ile biten şehir listesi -----------");
        stream.filter(s ->{
            System.out.println("Şehir: " + s);
            return s.endsWith("a");
        }).forEach(s ->{
            System.out.println("a ile biten şehir" + s);
        });
    //    stream.filter(s ->s.startsWith("Ma")).forEach(s -> System.out.println(s));



        //REDUCE

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            sayilar.add(i);

        }
        int toplam = sayilar.stream().reduce(0,(a,b) -> a+b );

        System.out.println(toplam);

        //COUNT

        System.out.println(sayilar.stream().count());

        System.out.println(sayilar.stream().filter(c -> c%2==0 ).count());

        //ALLMATCH

        if(sayilar.stream().allMatch(h->h%2==0 ))
            System.out.println("Gelenler çift");
        else
            System.out.println("Gelenlerin hepsi çift değil");

        //ANYMATCH

        if(sayilar.stream().anyMatch(h->h%2==0 ))
            System.out.println("Gelenler içinde çift var");
        else
            System.out.println("Çift değil");


        //AUTOBOXING UNBOXING

       List<Integer> liste = new ArrayList<>();
       liste.add(3); // autoboxing
        liste.add(4);

        liste.get(0); //unboxing


        //URUN OLUŞTURMA

        List<Urunler> urunlerliste = new ArrayList<>();

        urunlerliste.add(new Urunler("Çamaşır Deterjanı",200.99, LocalDate.of(2026,12,30),100));
        urunlerliste.add(new Urunler("Keçiboynuzu Özü",134.9,LocalDate.of(2025,12,20),20));
        urunlerliste.add(new Urunler("Iphone airpods",5900,LocalDate.of(2029,12,30),100));
        urunlerliste.add(new Urunler("USB Çoklayıcı",259.9,LocalDate.of(2027,11,01),100));



        double sonuc = urunlerliste.stream().filter(p->p.getSktTarih().isBefore(LocalDate.now())).map(p->p.getStoksayisi()*(p.getFiyat() - p.getStoksayisi())).reduce(0.0,(add,val)->add+val);

        System.out.println("Ürün sonucu :" + sonuc);


        //MAX

        Optional<Urunler> enpahali = urunlerliste.stream().max((u1, u2) -> Double.compare(u1.getFiyat(),u2.getFiyat()));


        //MIN
        Optional<Urunler> enucuzUrun = urunlerliste.stream().min((u1,u2)-> Double.compare(u1.getFiyat(),u2.getFiyat()));

        //İÇİNDE BARINDIRANI FİLTRELEME
        urunlerliste.stream().filter(p->p.getUrunadi().contains("Öz")).forEach(System.out::println);


        Scanner al = new Scanner(System.in);
        LocalDate taranantarih = LocalDate.parse(al.nextLine());

        urunlerliste.stream().filter(p->p.getSktTarih().isAfter(taranantarih)).forEach(System.out::println);


        //FINDANY

        if(sayilar.stream().findAny().isPresent())
            System.out.println("dolu");
        else
            System.out.println("boş");

        //FINDFIRST
        if(sayilar.stream().findFirst().isPresent())
            System.out.println("dolu");
        else
            System.out.println("boş");


        //CONCAT İKİ FARKLI AKIŞI BİRLEŞTİRİR
        Stream.concat(Stream.of(urunlerliste),Stream.of(sayilar)).filter(s->s.contains("Öz")).forEach(System.out::println);






//LIMIT

            urunlerliste.stream().limit(2).forEach(System.out::println);


            urunlerliste.stream();



    }





}
