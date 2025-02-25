package Ders3;

public class Yoneticiler extends Calisanlar{

    public String Unidiploma;
    public int girisTarih;


    public Yoneticiler(String isim, String soyisim, String departman, String adres, String dtarih, String unidiploma, int girisTarih) {
        super(isim, soyisim, departman, adres, dtarih);
        this.Unidiploma = unidiploma;
        this.girisTarih = girisTarih;
    }

    @Override
    public int maasAl(int a) {
        int kidem = girisTarih / 100;
        int yoneticiMaas = a * kidem;
        int prim = 50000;
        return yoneticiMaas + prim;

    }
}
