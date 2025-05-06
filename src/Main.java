import Ders1.Driver;
import Ders12.Ogrenci;
import Ders12.Urun;
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

import java.io.*;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvalidClassException {

        System.out.println("-----------Serileştirme-------------");

        Ogrenci ogrenci = new Ogrenci("Kemal",20,"Bilgisayar Programcılığı","132433");
        Ogrenci ogrenci1 = new Ogrenci("test",24,"Lojistik","3231");

        String dosAdi = "ogrenci.ser"; //.ser veya .dat uzantıları kullanılır
        String transietAdi = "ogrenci1.ser";


        //**Serileştirme (nesneyi dosyaya yazdırma)

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dosAdi);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream(transietAdi));


            objectOutputStream.writeObject(ogrenci);
            objectOutputStream1.writeObject(ogrenci1);

            System.out.println(ogrenci.getAd() + " adlı öğrenci serileştirildi ve " + dosAdi + " ile kaydedildi");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Ogrenci okunanOgrenci = null;

        FileInputStream fileInputStream = new FileInputStream(dosAdi);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        okunanOgrenci = (Ogrenci) objectInputStream.readObject();
        System.out.println(dosAdi + " dosyasından öğrenci bilgisi alındı");

        if (okunanOgrenci != null){
            System.out.println("Okunan öğrenci bilgileri : " + okunanOgrenci);
            System.out.println("Orijinal nesne ile aynı mı ? " + (ogrenci == okunanOgrenci));
            System.out.println("Okunan öğrenci adı " + okunanOgrenci.getAd());


        }


        System.out.println("---------Serileştirme Bitti---------");

        System.out.println("---------Externalizable ---------");

        Urun urun = new Urun("ABC124",500,"Logitech Mouse","Sessiz çalışan mavi");
        String dosyaAdi = "urun.ext";

        System.out.println("Original Ürün " + urun);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dosyaAdi));
        oos.writeObject(urun);

        Urun okunanUrun = null;

        ObjectInputStream oos1 = new ObjectInputStream(new FileInputStream(dosyaAdi));
        okunanUrun= (Urun) oos1.readObject();




        System.out.println("--------- Externalizable Bitti---------");

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
        fr.nesneli(); //Instance Method, Nesne gerektirdi


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













  /*      Scanner al = new Scanner(System.in);
        System.out.println("Mesajınız : ");
        String mesaj = al.nextLine();

     //String mesaj = "Merhaba dependency Injection";

        SmsProvider turkcell = new TurkcellSmsProvider();
        SmsService smsService = new SmsService(turkcell);
        smsService.smsGonder(mesaj);

        SmsProvider vodafone = new VodafoneSMSProvider();
        SmsService smsService2 = new SmsService(vodafone);
        smsService2.smsGonder(mesaj);
*/

        Fonksiyonlar.nesnesiz();//Static olduğu için sınıf üzerinden çağrılabildi.








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


        System.out.println("--------------Volkswagen ÖRNEĞİ------------");
        Volkswagen v1 = new Volkswagen("21551794V",100,20,190,"Gri","DSG");
        v1.move();
        v1.park();



        System.out.println("--------------AUDİ ÖRNEĞİ------------");
       Audi audi1 = new Audi("er3",34,23,100,"siyah","deri");
       Audi audi2 = new Audi();
       audi2.platenumber="434d";

        System.out.println("--------ÇALIŞAN ÖRNEĞİ ------------");
        Yoneticiler y1 = new Yoneticiler("Ahmet","Kaplan","İK","Beylikdüzü","1985","Medipol",2020);
        Memurlar m1 = new Memurlar("Jale","Yıldız","Pazarlama","Gebze","2005");

        y1.arabaKullan(true);
        m1.arabaKullan(true); // false dönecek



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
