package Ders11;

public class Number implements Runnable{
    private int rakamlar;
    private int yazimSayisi;
    private int i;

    public Number() {
    }

    public Number(int rakamlar, int yazimSayisi) {
        this.rakamlar = rakamlar;
        this.yazimSayisi = yazimSayisi;
    }

    @Override
    public void run() {
        for (int j = 0; j < yazimSayisi; j++) {
            System.out.println(rakamlar);

        }
    }
}
