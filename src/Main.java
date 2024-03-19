import Ders1.Driver;
import Ders3.Audi;
import Ders3.Audition;
import Ders3.Fonksiyonlar;
import Ders3.OOPCar;
import Ders5.DI.SmsProvider;
import Ders5.DI.SmsService;
import Ders5.DI.TurkcellSmsProvider;
import Ders5.DI.VodafoneSMSProvider;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Dependency Injection
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
