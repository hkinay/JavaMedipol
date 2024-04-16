package Ders7;

import java.time.LocalDate;

public class Urunler {

    public Urunler(String urunadi, double fiyat, LocalDate sktTarih, int stoksayisi) {
        this.urunadi = urunadi;
        this.fiyat = fiyat;
        this.sktTarih = sktTarih;
        this.stoksayisi = stoksayisi;
    }

    private String urunadi;
    private double fiyat;
    private LocalDate sktTarih;
    private int stoksayisi;

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public LocalDate getSktTarih() {
        return sktTarih;
    }

    public void setSktTarih(LocalDate sktTarih) {
        this.sktTarih = sktTarih;
    }

    public int getStoksayisi() {
        return stoksayisi;
    }

    public void setStoksayisi(int stoksayisi) {
        this.stoksayisi = stoksayisi;
    }
}
