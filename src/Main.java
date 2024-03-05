import Ders1.Driver;
import Ders3.Audi;
import Ders3.Audition;
import Ders3.Fonksiyonlar;
import Ders3.OOPCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


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

        Audi audi = new Audi("34E59",10,20,255,"Lacivert");

        audi.bilgiGoster();
        audi.move();


        OOPCar oopCar = new Audi("4343",45,46,454,"Siyah");

        oopCar.move();
        Audition audition = new Audition("4343",45,46,454,"Siyah");
        audition.bilgiGoster();




        }
    }
