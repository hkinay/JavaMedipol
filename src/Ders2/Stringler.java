package Ders2;

public class Stringler {

    public static void main(String[] args) {
        System.out.println("Hello");

        //Advanced Değişkenler

        String uni  = "Medipol Üniversitesi";
        String isim = "Ahmet";
        String isim2 = new String ("Ahmet");
        String name = new String("Ahm et ");
        String isim3 = "Ahmet";



        isim.length(); // uzunluk verir


        System.out.printf("istenilen karakteri almak için charAt %s%n", uni.charAt(8));

        if (isim == name) System.out.println("eşittir");
        else{
            System.out.println("eşit değil");
        }

        //Eşitlik Kontrolü

        boolean esit1 = isim.equals(isim2); //true
        boolean esit2 = isim == isim3; //true
        boolean esit3 = isim3 == isim2 ; //false
        boolean esit4 = isim.equals(isim3); //true


        boolean esit5 = isim.equalsIgnoreCase("mErHaBa"); //true



        System.out.println(isim.equals(name));
        System.out.println("İstenilen karakteri değiştirir replace : " + name.replace('t','d'));
        System.out.println("İstenilen karakteri keser substring " + isim.substring(1,4));
        System.out.println("İstenilen karakteri keser substring " + uni.substring(7));
        System.out.println("Büyük harf" + isim.toUpperCase());
        System.out.println("Küçük harf" + isim.toLowerCase());
        System.out.println("Boşluk kaldırma" + name.trim());
        isim.contains("t");
        isim.indexOf(3);

        String cevir = "436346";
        int sayi = Integer.parseInt(cevir); // stringi integere çevirdim

        String yenicevir = Integer.toString(sayi); // integeri stringe çevirdim
        String yeniicevir = String.valueOf(sayi); // stringe çevirir



        StringBuilder stringBuilder = new StringBuilder("StringBuilder Kullanıyorum");
        System.out.println(stringBuilder.reverse());

        //String birleştirme

        String yeniekleme = isim + " " + uni;
        String yeniekleme2 = isim.concat(" ").concat(uni);


        boolean arama = yeniekleme.endsWith("l"); //true
        boolean bastanarama = yeniekleme.startsWith("A"); //false



    }
}
