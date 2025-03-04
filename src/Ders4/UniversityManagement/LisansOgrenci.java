package Ders4.UniversityManagement;

public class LisansOgrenci implements StudentService{
    public  String isim;
    public int stid;
    public String bolum;
    public double gpa;

    public LisansOgrenci(String isim, int stid, String bolum, double gpa) {
        this.isim = isim;
        this.stid = stid;
        this.bolum = bolum;
        this.gpa = gpa;
    }

    @Override
    public void dersAlma() {
        System.out.println("Ders alıyor.");

    }

    @Override
    public void ucretOde() {
        System.out.println("lisans öğrencisi her dönem 1000 tl öder");


    }

    @Override
    public void devamliMi() {

    }

    @Override
    public void bilgiGoster() {
        System.out.printf("Öğrenci Bilgileri isim : %s, numara : %d, bölüm : %s, gpa: %d ",isim,stid,bolum,gpa);

    }
}
