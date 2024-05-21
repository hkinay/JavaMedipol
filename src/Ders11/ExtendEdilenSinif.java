package Ders11;

public class ExtendEdilenSinif extends  Thread{

    public void run(){

        try {
            System.out.println("Thread" + Thread.currentThread().getId() + " çalışıyor." );
        }catch (Exception e){
            System.out.println("Hata yakalandı.");
        }



    }
}
