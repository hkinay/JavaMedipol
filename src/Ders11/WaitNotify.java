package Ders11;

import java.util.Scanner;

public class WaitNotify {

    private Object lock = new Object();

    public void thread1fonksiyonu(){

        synchronized (lock){
            System.out.println("Thread4 çalıştırılıyor");

            System.out.println("Thread1 , Thread2 nin kendisini uyandırmasını bekliyor.. ");

        }

        try {
            lock.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Thread1 uyandı.");

    }

    public void thread2fonksiyonu(){

        Scanner scanner = new Scanner(System.in);

        synchronized (lock){
            System.out.println("Thread5 çalıştırılıyor");
            System.out.println("Devam etmek için herhangi bir tuşa basınız.");
            scanner.next();
            lock.notify();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }





        System.out.println("Thread2 uyandı.");
    }
}
