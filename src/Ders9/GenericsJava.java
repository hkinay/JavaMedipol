package Ders9;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class GenericsJava {
    public static void main(String[] args) {
        //Generic Olmayan Tanımlama
        List nonGenericList = new ArrayList(); //Tip belirtilmemiş Object kabul ediyor
        //Generic Tanımlama
        List<String> genericListe = new ArrayList<>();

        nonGenericList.add("String bir değer atamaya çalışıyorum.");
        nonGenericList.add("String Değer "+ 100 + " Integer " + 15.5 +" Double "+ " Nongenericlerde farklı tiplerden değer atanabilir");
        nonGenericList.add(321646546);
        nonGenericList.add(565.5);


        String k = (String) nonGenericList.get(0);  //cast gerekli
        Integer kf = (Integer) nonGenericList.get(2);

        genericListe.add("Genericlerde string belirtildiği için sadece String atanabilir");

        genericListe.add("<veriTipi> bu yapıya elmas denir");
        System.out.println("---NonGeneric---");
        System.out.println(nonGenericList.get(0) + "\n-> " + nonGenericList.get(1));

        System.out.println("*** Generic ***");
        System.out.println(genericListe.get(0) + "\n->" + genericListe.get(1));


        System.out.println( "--------- Class Cast Exception -------------");

        for (int i = 0; i < nonGenericList.size(); i++) {
            try{
                String value = (String) nonGenericList.get(i);
                System.out.println("*******" + value + "********");
            }catch (ClassCastException e){
                System.out.println("Class cast exception hatası " + e.hashCode());
            }

        }


        // KENDİ GENERIC CLASS ÖRNEĞİ KUTU
        Box<Integer> boxid = new Box<>();
        boxid.set(100);

        Box<String> boxsid = new Box<>();
        boxsid.set("bu bir string kutunun ilk elemanı");


        System.out.println("---------- Generic Class Örneği ----------");
        GenericClass<Integer> urunId = new GenericClass<>();
        GenericClass<String> urunAd = new GenericClass<>();

        urunId.addList(1001);
        urunId.addList(1002);
        urunId.addList(1003);

        urunAd.addList("Bebek Bezi");
        urunAd.addList("Deterjan");
        urunAd.addList("Klavye");

        ArrayList<Integer> urunIDs = urunId.getListem();
        ArrayList<String> urunAds = urunAd.getListem();

        for (int i = 0; i < urunAds.size(); i++) {
            System.out.println("Ürün Adı : " + urunAds.get(i) +"\nÜrün Barkodu : " +  urunIDs.get(i));

        }

        //Çoklu Key Value Parametreli Generic Class Örneği

        CokluTipParametreliSınıf<String,Integer> cokluTipParametreliSınıf = new CokluTipParametreliSınıf<>("Yaş" , 39);
        cokluTipParametreliSınıf.getKey();

        System.out.println("-------------OzelTip Class Örneği ---------");

        OzelTipClass<Integer> calisan = new OzelTipClass<>();
        calisan.isim = "Ahmet";
        calisan.soyisim = "Kaplan";
        calisan.maas = 54000;

        OzelTipClass<Double> calisan2 = new OzelTipClass<>();

        calisan2.isim = "Ayşe";
        calisan2.soyisim = "Tilki";
        calisan2.maas = 54000.555;

        System.out.println(calisan.getCalisanId() +" " + calisan.isim + calisan.soyisim + calisan.maas);
        System.out.println(calisan2.getCalisanId() +" "+ calisan2.isim + calisan2.soyisim + calisan2.maas);

        System.out.println("----------Sözlük Örneği --------------");

        IkiTipGenericClass<String,String> sozlugum = new IkiTipGenericClass<String,String>();
        IkiTipGenericClass<String,Integer> siniflistesi = new IkiTipGenericClass<String,Integer>();

        siniflistesi.AddDict("Hüseyin",25);
        siniflistesi.AddDict("Ayşe",36);

        sozlugum.AddDict("Elma","Apple");
        sozlugum.AddDict("Mukava","Nice");
        sozlugum.AddDict("Stark","Güçlü");
        sozlugum.AddDict("Patlıcan","Eggplant");

        System.out.println(sozlugum.getDict("Mukava")); //Nice
        System.out.println(sozlugum.getDict("Stark")); //Güçlü
        System.out.println(sozlugum.getDict("Patlıcan")); //Eggplant


        System.out.println(siniflistesi.getDict("Hüseyin")); //25





    }
    public int genericMethod (int a){
        return a;
    }

    public String genericStringMethod (String b){
        return b;
    }


    public static <T extends Comparable<T>> T eneleman(T [] dizi){
        if(dizi == null || dizi.length==0){
            return null;
        }
        T enBuyuk = dizi[0];

        for(int i = 0; i<dizi.length;i++){
            if(dizi[i].compareTo(enBuyuk)>0){
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }




}
