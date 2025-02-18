import Ders1.Driver;
import Ders2.Diziler;
import Ders3.*;
import Ders5.DI.SmsProvider;
import Ders5.DI.SmsService;
import Ders5.DI.TurkcellSmsProvider;
import Ders5.DI.VodafoneSMSProvider;
import Ders6.Linkedlistler;
import Ders9.GenericClass;
import Ders9.GenericsJava;
import Ders9.SiralamaAlgoritmalari;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        Driver.carpimTablosu();



        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        System.out.print(pq.poll()+ " ");
        System.out.print(pq.poll()+ " ");
        System.out.print(pq.poll());

        Fonksiyonlar fr = new Fonksiyonlar();
        fr.getYas();
        fr.setYas(16);

        String r= fr.bilgileriGoster("Ahmet");
        fr.nesneli();


        Fonksiyonlar.nesnesiz();
        System.out.println(r);

      /*  //LinkedList Örnekleri

        Linkedlistler kitap1 = new Linkedlistler("Ahmet","Kaplan",2.3,1999);
        Linkedlistler kitap2 = new Linkedlistler("Yaşar","Kemal",5,2000);
        LinkedList<Linkedlistler> kitaplar = new LinkedList<>();

        kitaplar.add(kitap1);
        kitaplar.add(kitap2);

       for(Linkedlistler a : kitaplar){
           System.out.println(a.ad+" " + a.soyad+ " " + a.version+ " " + a.yil);
       }

       kitaplar.push(kitap1);
*/













        Scanner al = new Scanner(System.in);
        System.out.println("Mesajınız : ");
        String mesaj = al.nextLine();

     //String mesaj = "Merhaba dependency Injection";

        SmsProvider turkcell = new TurkcellSmsProvider();
        SmsService smsService = new SmsService(turkcell);
        smsService.smsGonder(mesaj);

        SmsProvider vodafone = new VodafoneSMSProvider();
        SmsService smsService2 = new SmsService(vodafone);
        smsService2.smsGonder(mesaj);












        Fonksiyonlar fonksiyonlar = new Fonksiyonlar();
        fonksiyonlar.nesneli();

      /*  String a= fonksiyonlar.getOzelnesne(); //Fonksiyonlar sınıfından gelecek
        fonksiyonlar.setOzelnesne("Yeni nesne");
        String b = fonksiyonlar.getOzelnesne();

        System.out.println("Eski nesne " + a);
        System.out.println("Yeni nesne " + b);*/

        int k = Fonksiyonlar.topla(3,6);

        Fonksiyonlar.max(4,10);
        Fonksiyonlar.min(4,9);

        int faktor = Fonksiyonlar.faktoriyel(6);
        System.out.println(faktor);





        System.out.println("--------------Inheritance Örneği---------------");

       Audi audi1 = new Audi("er3",34,23,100,"siyah","deri");
       Audi audi2 = new Audi();
       audi2.platenumber="434d";


        audi1.accelerate(10);
        audi1.accelerate(10,4);



        audi1.bilgiGoster();


        Renault reno1 = new Renault();

        reno1.colour = "Siyah";
        int b = reno1.accelerate(50);
       reno1.yil = "1988";

        System.out.println(reno1.colour);
        System.out.println(b);


        }
    }
