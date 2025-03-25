package Ders8;

import Ders11.Printer;

public class LambdaOrnekOgrenci {

    private String isim;
    private Integer yas;
    private double notortalamasi;
    public LambdaOrnekOgrenci(String isim, Integer yas, double notortalamasi) {
        this.isim = isim;
        this.yas = yas;
        this.notortalamasi = notortalamasi;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public double getNotortalamasi() {
        return notortalamasi;
    }

    public void setNotortalamasi(double notortalamasi) {
        this.notortalamasi = notortalamasi;
    }

    public void bilgileriGoster(){

        System.out.println("Öğrenci adı " + this.isim);
        System.out.println("Öğrenci yaş" + this.yas);
            }


}

