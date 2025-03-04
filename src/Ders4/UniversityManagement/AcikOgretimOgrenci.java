package Ders4.UniversityManagement;

public class AcikOgretimOgrenci implements StudentService{

    public  String acisim;
    public int acstid;
    public String acbolum;
    public float acgpa;

    public int acyas;

    public AcikOgretimOgrenci(String acisim, int acstid, String acbolum, float acgpa, int acyas) {
        this.acisim = acisim;
        this.acstid = acstid;
        this.acbolum = acbolum;
        this.acgpa = acgpa;
        this.acyas = acyas;
    }

    @Override
    public void dersAlma() {

        if (acyas < 35){
            System.out.println("Bu öğrenci tarih bölümünden ders alamaz");
        }else{
            System.out.println("açık öğretim öğrencisi bu methodla ders alır");
        }



    }

    @Override
    public void ucretOde() {
        System.out.println("Açık öğretim her dönem 2500 tl öder");

    }

    @Override
    public void devamliMi() {
        System.out.println("Açık öğretimde devam zorunluluğu yoktur");

    }

    @Override
    public void bilgiGoster() {
        System.out.printf("Öğrenci Bilgileri isim : %s, numara : %d, bölüm : %s, gpa: %f , yas:%d ",acisim,acstid,acbolum,acgpa,acyas);
        System.out.println();



    }
}
