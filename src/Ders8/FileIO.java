package Ders8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

    static String dosyayolu = "C:\\Users\\husey\\OneDrive\\Desktop\\Medipol\\filejavayeni.txt";
    File dosya = new File(dosyayolu);
    public static void main(String[] args) throws IOException{

        dosyaYaz();

        System.out.println("--------DOSYA BİLGİLERİ -------------");
            FileIO fobj = new FileIO();
            File dosyam = fobj.dosya;

        if(dosyam.exists()){
            System.out.println("Dosya Adı : " + dosyam.getName());
            System.out.println("Dosyanın Yeri : " + dosyam.getAbsolutePath());
            System.out.println("Yazılabilir mi ? " + dosyam.canWrite());
            System.out.println("Okunabilir mi ? " + dosyam.canRead());
            System.out.println("Dosyanın Boyutu : " + dosyam.length());

        }
        else{
            System.out.println("Dosya Mevcut değil");
        }


        System.out.println("----------DOSYANIN İÇERİĞİ----------");
        dosyaOku();


        System.out.println("--------Dosya Silme-----------");
        dosyaSil(dosyam);



    }
    public static void dosyaYaz() throws IOException {
        FileWriter yazici = new FileWriter(dosyayolu);
                yazici.write("Bu dosyanın içerisine eklemek istiyorum. Dosyanın uzunluğu artıyor");
                yazici.close();

        System.out.println("Başarı ile eklendi.");

    }
    public static void dosyaOlustur(File file,String dosyayolu){

     file = new File(dosyayolu);
        try{
          if (file.createNewFile())
            {
                System.out.println("Dosya oluşturuldu. " + file.getName());
            }
            else {
                System.out.println("Dosya zaten var.");
            }
        }catch (IOException e){
            System.out.println("Bir hata oluştu "+ e);
            e.printStackTrace();
        }
    }

    public static void dosyaOku(){
        FileIO nesne = new FileIO();

                try{

            Scanner okuyucu = new Scanner(new File(nesne.dosyayolu));

            while (okuyucu.hasNextLine()){
                String veri = okuyucu.nextLine();
                System.out.println(veri);

            okuyucu.close();
            }

        }catch (IOException e){
            System.out.println("Bir hata oluştu");
            e.printStackTrace();
        }
    }

    public static void dosyaSil (File file){
        if(file.delete()){
            System.out.println("Dosya silindi" + "Silinen Dosya" + file.getName());
        }
        else {
            System.out.println("Dosya silme başarısız");
        }
    }

}
