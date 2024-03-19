package Ders4.UniversityManagement;

public class LisansustuOgrenci implements StudentService{
    public String isimsoyisim;
    public int sttid;

    public LisansustuOgrenci(String isimsoyisim, int sttid) {
        this.isimsoyisim = isimsoyisim;
        this.sttid = sttid;
    }

    @Override
    public void dersAlma() {

    }

    @Override
    public void ucretOde() {

    }

    @Override
    public void devamliMi() {

    }

    @Override
    public void bilgiGoster() {
        System.out.printf("Öğrenci Bilgileri isim : %s, numara : %d",isimsoyisim,sttid);

    }
}
