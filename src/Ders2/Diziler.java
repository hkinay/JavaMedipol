package Ders2;

import java.util.Arrays;
import java.util.Scanner;

public class Diziler {

    public static void main(String[] args) {

        paraUstuVerme(94);

        // cokBoyutluDiziler();

        //   sayiSiralama();
  /*      int sayilar3 [] = {4,5,6,7,9};

        System.out.println(sayilar3); //ID

    }*/
    }
        private static void sayiSiralama () {

            int[] sayilar = {6, 7, 8, 8, 93, 123, 2};
            int[] sayilar2 = {3, 4, 5, 6, 6, 4, 53};

            int sayilar3[] = {4, 5, 6, 7, 9};

            System.out.println(sayilar2[5]);


            Arrays.sort(sayilar);
            int toplam = 0;
            for (int i = 0; i < sayilar.length; i++) {
                toplam += sayilar[i];

                System.out.print(sayilar[i]);

            }

            System.out.println(toplam);
            System.out.println("Aritmetik ortalaması : " + toplam / sayilar.length);
            System.out.println();
            System.out.println(sayilar3); //ID


            System.out.println(sayilar[sayilar.length - 1]); // En büyük eleman

            int enkucuk = sayilar[0]; //En küçük eleman

            //ortanca median
            //Ortanca sayıyı bulun
            // mean aritmetik ortalama

        }

        private static void cokBoyutluDiziler () {

            int[][] cokBoyutluOrnek = {{1, 2, 3, 4, 11}, {5, 6, 7, 8, 12}, {9, 10, 11, 12, 13}, {18, 19, 20, 21, 22}, {5}};

            System.out.println(cokBoyutluOrnek[0][2]); // 3 gelir,

            System.out.println(cokBoyutluOrnek[2][2]); // 11 gelir


        }

        public static void tekBoyutluDiziOrnekler () {

            String a = new String("Medipol");

            int[] intDizisi = {3, 4, 5, 6, 7, 8, 9};
            int intDizisi2[] = {6, 7, 8, 9, 10};
            int[] siralamaIcin = {9, 3, 88, 2, 4};

            Arrays.sort(siralamaIcin); // siralamaIcin = {2,3,4,9,88}
            Arrays.copyOfRange(siralamaIcin, 2, 4);
            Arrays.copyOf(intDizisi, 2);

            // a.charAt(3); //i gelir

            int[] intDizisi3 = new int[10];
            intDizisi3[0] = 4;
            intDizisi3[2] = 6;

            intDizisi3[13] = 5; //Indexoutofbounds hatası alınır

            int toplam = 0;
            for (int i = 0; i < intDizisi2.length; i++) {
                System.out.print(intDizisi2[i] + " ");
                toplam += intDizisi2[i];
            }

            System.out.println();
            System.out.println("Toplam : " + toplam);


            for (int i = 0; i < a.length(); i++) {
                System.out.print(a.charAt(i) + " ");

            }

//FOREACH DÖNGÜSÜ - DİZİLERDE KULLANILABİLİR.
            for (int number : intDizisi) {
                System.out.println(number);
            }

            for (int x : siralamaIcin) {
                System.out.println(x * x);
            }

            for (int t : siralamaIcin) {

                if (t % 2 == 0) {
                    System.out.println(t);
                }
            }


        }

        private static void paraUstuVerme(int sayi) {
            int[] tedavulparalar = {200, 100, 50, 20, 10, 5, 1};

        /*elimde para miktarı var
        ilk indexe bölünecek
        kalan bulunup sıradaki elemana bölünecek*/

            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Para üstü miktarını söyleyiniz : ");
            int sayi = scanner.nextInt();*/

            for (int i = 0; i < tedavulparalar.length; i++) {
                if (sayi / tedavulparalar[i] != 0) {
                    System.out.println(sayi / tedavulparalar[i] + " adet " + tedavulparalar[i]);

                }
                sayi = sayi - (sayi / tedavulparalar[i] * tedavulparalar[i]);
            }




        /*for (int a : tedavulparalar){
            if (sayi/tedavulparalar[a]!=0){
                System.out.println(sayi/tedavulparalar[a] + "adet" + tedavulparalar[a]);
            }
            sayi = sayi - (sayi/tedavulparalar[a] * tedavulparalar[a]);
        }
*/


        }


    }


