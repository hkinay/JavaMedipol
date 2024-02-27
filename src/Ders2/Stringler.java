package Ders2;

public class Stringler {

    public static void main(String[] args) {
        System.out.println("Hello");

        //Advanced Değişkenler

        String uni  = "Medipol Üniversitesi";
        String isim = "Ahmet";
        String name = new String("Ahm et ");

        isim.length(); // uzunluk verir

        System.out.printf("istenilen karakteri almak için charAt %s%n", isim.charAt(3));

        if (isim == name) System.out.println("eşittir");
        else{
            System.out.println("eşit değil");
        }

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
        String yeniicevir = String.valueOf(sayi);

        StringBuilder stringBuilder = new StringBuilder("StringBuilder Kullanıyorum");

        System.out.println(stringBuilder.reverse());



    }
}
