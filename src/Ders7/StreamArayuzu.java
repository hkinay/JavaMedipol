package Ders7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamArayuzu {
    public static void main(String[] args) {

        List<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Konya");
        sehirler.add("İzmir");
        sehirler.add("Manisa");

        Stream<String> stream = sehirler.stream();


        List result = sehirler.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            System.out.println(i);

        }







        stream.filter(s ->{
            System.out.println("filter: " + s);
            return s.endsWith("a");
        }).forEach(s ->{
            System.out.println(s);
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


        double sonuc = urunlerliste.stream().filter(p->p.getSktTarih().isBefore(LocalDate.now())).map(p->p.getStoksayisi()*(p.getFiyat() - p.getStoksayisi())).reduce(0.0,(add,val)->add+val);

        System.out.println("Ürün sonucu :" + sonuc);


        //MAX

        Optional<Urunler> enpahali = urunlerliste.stream().max((u1, u2) -> Double.compare(u1.getFiyat(),u2.getFiyat()));


        //MIN
        Optional<Urunler> enucuzUrun = urunlerliste.stream().min((u1,u2)-> Double.compare(u1.getFiyat(),u2.getFiyat()));


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


        //CONCAT
        Stream.concat(Stream.of(urunlerliste),Stream.of(sayilar)).filter(s->s.contains("Öz")).forEach(System.out::println);






//LIMIT

            urunlerliste.stream().limit(2).forEach(System.out::println);


            urunlerliste.stream();



    }





}
