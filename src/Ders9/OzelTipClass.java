package Ders9;

import java.util.List;
import java.util.Objects;

public class OzelTipClass <kenditipim>{

    //wildcards
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


    //Lower bound wildcard örneği
    //Integer ve üst sınıflardan alabilir (Number üst sınıf veya Object olabilir)
    public static void listeyeSayiEkle(List<? super Integer> listem, int k){
        for (int i = 0; i < listem.size(); i++) {
            listem.add(i * 10);

        }
        Object a = listem.get(0);

    }



}
