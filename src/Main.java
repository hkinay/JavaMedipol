import Ders3.Audi;
import Ders3.Audition;
import Ders3.OOPCar;
import Ders6.Linkedlistler;

import java.util.Iterator;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //LinkedList Örnekleri

        Linkedlistler kitap1 = new Linkedlistler("Ahmet","Kaplan",2.3,1999);
        Linkedlistler kitap2 = new Linkedlistler("Yaşar","Kemal",5,2000);
        LinkedList<Linkedlistler> kitaplar = new LinkedList<>();

        kitaplar.add(kitap1);
        kitaplar.add(kitap2);

       for(Linkedlistler a : kitaplar){
           System.out.println(a.ad+" " + a.soyad+ " " + a.version+ " " + a.yil);
       }

       kitaplar.push(kitap1);












       /* //Dependency Injection
        Scanner al = new Scanner(System.in);
        System.out.println("Mesajınız : ");
        String mesaj = al.nextLine();

     //   String mesaj = "Merhaba dependency Injection";

        SmsProvider turkcell = new TurkcellSmsProvider();
        SmsService smsService = new SmsService(turkcell);
        smsService.smsGonder(mesaj);

        SmsProvider vodafone = new VodafoneSMSProvider();
        SmsService smsService2 = new SmsService(vodafone);
        smsService2.smsGonder(mesaj);
*/










        /*Fonksiyonlar.nesnesiz();
        Fonksiyonlar fonksiyonlar = new Fonksiyonlar();
        fonksiyonlar.nesneli();

        String a= fonksiyonlar.getOzelnesne(); //Fonksiyonlar sınıfından gelecek
        fonksiyonlar.setOzelnesne("Yeni nesne");
        String b = fonksiyonlar.getOzelnesne();

        System.out.println("Eski nesne " + a);
        System.out.println("Yeni nesne " + b);

        int k = Fonksiyonlar.topla(3,6);

        Fonksiyonlar.max(4,10);
        Fonksiyonlar.min(4,9);

        int faktor = Fonksiyonlar.faktoriyel(6);
        System.out.println(faktor);*/

        System.out.println("--------------Inheritance Örneği---------------");

        Audi audi = new Audi("34E59",10,20,255,"Lacivert");

        audi.bilgiGoster();
        audi.move();

        System.out.println("--------------Polymorphism Örneği---------------");
        OOPCar oopCar = new Audi("4343",45,46,454,"Siyah");

        oopCar.move();
        Audition audition = new Audition("4343",45,46,454,"Siyah");
        audition.bilgiGoster();




        }
    }
