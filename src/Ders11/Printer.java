package Ders11;


// Karakter yazdiran runable sinifini uygulayan bir sinif ornegi
public class Printer implements Runnable{
    private char karakter;
    private int yazimSayisi;
    private int i;

    // Sinifa ait parametresiz yapilandirici
    public Printer() {
    }

    // Sinifa ait parametre alan yapilandirici
    public Printer(char karakter, int yazimSayisi) {
        this.karakter = karakter;
        this.yazimSayisi = yazimSayisi;
    }


    // Runable arabiriminin run metodu override edildi.
    @Override
    public void run() {
        for (int j = 0; j < yazimSayisi; j++) {
            System.out.println(karakter);

        }

    }
}
