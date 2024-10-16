package Ders11;

public class Process extends Thread{
    public static void main(String[] args) throws InterruptedException {

        /*Printer printer = new Printer('A',2);
        Number number = new Number(10,3);
        Printer printer1 = new Printer('B',3);

        // is parcagina ait thread olusturalim

        Thread thread = new Thread(printer);
        thread.start();

        Thread thread1 = new Thread(number);
        thread1.start();

        Thread thread2 = new Thread(printer1);
        thread2.start();

        System.out.println("-----------------------------");

        int issayisi = 5;
        for (int i = 0; i < issayisi; i++) {
            ExtendEdilenSinif extendEdilenSinif = new ExtendEdilenSinif();
            extendEdilenSinif.start();

        }*/


        WaitNotify wn = new WaitNotify();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread1fonksiyonu();
            }
        });


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread2fonksiyonu();
            }
        });

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();


    }
}
