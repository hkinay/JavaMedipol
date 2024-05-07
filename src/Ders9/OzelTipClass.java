package Ders9;

public class OzelTipClass <kenditipim>{
    public final String uniKisaAd = "MEDIPOL";
    kenditipim maas;


    private  String calisanid;
    String isim , soyisim;

    public String getCalisanId(){
        int i = isim.length()/2+1;
        int v = soyisim.length()/2 + 1;

        this.calisanid = uniKisaAd + "." + isim.substring(i) + soyisim.substring(v);
     return calisanid.toLowerCase();
    }


}
