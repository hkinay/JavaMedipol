package Ders4.UniversityManagement;

import java.sql.SQLOutput;

public class OnlisansOgrenci implements StudentService{

    String isim;
    int ogrenciid;

    String telefon;

    public OnlisansOgrenci(String isim, int ogrenciid, String telefon, String dogumtarihi) {
        this.isim = isim;
        this.ogrenciid = ogrenciid;
        this.telefon = telefon;
        this.dogumtarihi = dogumtarihi;
    }

    String dogumtarihi;
    @Override
    public void dersAlma() {

        System.out.println("40 kredi alabilir.");

    }

    @Override
    public void ucretOde() {
        System.out.println("1000 tl ödeyecek");

    }

    @Override
    public void devamliMi() {
        System.out.println("Devam zorunluluğu yok");

    }

    @Override
    public void bilgiGoster() {
        System.out.println("Önlisans Öğrenci Bilgisi");
        System.out.printf("İsim %s, Numara %d, Doğum Tarihi %s",isim,ogrenciid,dogumtarihi);



    }
}
