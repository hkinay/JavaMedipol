package Ders3;

public abstract class Calisanlar {
    public String isim;
    public String soyisim;
    public String departman;
    public String adres;
    public String dtarih;


    public Calisanlar(String isim, String soyisim, String departman, String adres, String dtarih) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.departman = departman;
        this.adres = adres;
        this.dtarih = dtarih;
    }

    public int maasAl(int a){
        return a;
    }

    public boolean arabaKullan(boolean b){
        return b;
    }
}
