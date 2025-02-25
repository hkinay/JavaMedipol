package Ders3;

public class Memurlar extends Calisanlar{
    public Memurlar(String isim, String soyisim, String departman, String adres, String dtarih) {
        super(isim, soyisim, departman, adres, dtarih);
    }

    @Override
    public boolean arabaKullan(boolean b) {
        b = false;
        return b;

    }

    @Override
    public int maasAl(int a) {
        int prim = 30000;

        return a + prim;


    }
}
