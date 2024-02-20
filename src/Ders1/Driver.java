package Ders1;

import java.util.Random;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        //kosulOrnekleri();
        //donguOrnekleri();
        sayiTahminOyunu();
        /*
        Scanner nesne = new Scanner(System.in);
        System.out.println("Faktöriyel için bir sayı ver: ");
        int faktor = nesne.nextInt();
        int goster = faktoriyel(faktor);
        System.out.println(goster);
*/


    }

    private static void sayiTahminOyunu() {
        int hak = 3;

        Random random = new Random();
        int uretilen = random.nextInt(100);
        Scanner sayi = new Scanner(System.in);


        while (hak > 0){
            System.out.println("Sayı tahmin ediniz: ");
            int ksayi = sayi.nextInt();
            if (uretilen == ksayi){
                System.out.println("Tebrikler");
                break;
                
            }
            hak -= 1;

        }
    }

    public static void donguOrnekleri() {
        int i = 0;
        int toplam = 0;

        while(i < 10){
           i++;
           if (i%2==0){
               System.out.println(i);
               toplam +=i;
                   }

        }
        System.out.printf("Sayı toplamları %d%n",toplam);

int sayi = 1;
int faktor = 5;
int toplamfaktor = 1;

while (sayi <= faktor ){
    toplamfaktor *=sayi;
    ++sayi;


}
        System.out.printf("Faktör toplamı %d",toplamfaktor);


        for (int j = 0; j < 10; j++) {
            if (j % 2 == 1){
                System.out.println(j);
            }

        }
        String isim = "Medipol Üniversitesi";

        for (int j = 0; j < isim.length(); j++) {
            System.out.print(j + " ") ;

        }


    }
    public static int faktoriyel(int sayi){
        if(sayi == 1 || sayi == 0){
            return 1;
        }
        else {
            return sayi * faktoriyel(sayi - 1);
        }

    }

    private static void kosulOrnekleri() {
        //KOŞULLAR
     /* int a = 5;
  if (a<4){
      System.out.println("a sayısı 4 den küçüktür.");
  }else if (a<6) {
      System.out.println("a sayısı 6 dan küçüktür");

  } else{
      System.out.println("a sayısı 6 dan büyüktür");
  }
*/
        Scanner al = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int yas = al.nextInt();

        if (yas>=18){
            System.out.println("Ehliyet alabilirsiniz.");
        }
        else if (yas >=21) {
            System.out.println("E ehliyeti alabilirsiniz.");

        }else{
            System.out.println("ehliyet alamazsınız");
        }

        int gun = al.nextInt();
        switch (gun){
            case 4:
                System.out.println("bugün perşembedir");
                break;


            case 5:
                System.out.println("bugün cumadır.");
                break;


            default:
                System.out.println("doğru gün sayısı girilmedi");
        }

    }

}
