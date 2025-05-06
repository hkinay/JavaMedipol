package Ders12;


import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String ad;
    private int yas;
    private String bolum;
    private transient String sifre; // bu alan serileştirilmeyecek
    private transient int etkinlikId; // bu alan serileştirilmeyecek

    public Ogrenci(String ad, int yas, String bolum, String sifre) {
        this.ad = ad;
        this.yas = yas;
        this.bolum = bolum;
        this.sifre = sifre;
        this.etkinlikId = (int) (Math.random() * 100 ); // geçici değer

    }

    @Override
    public String toString() {
        return "Öğrenci Bilgileri{" + ad +" " + bolum +" " + etkinlikId + "}";
    }

    public String getAd() {
        return ad;
    }

    public int getYas() {
        return yas;
    }

    public String getBolum() {
        return bolum;
    }
}
