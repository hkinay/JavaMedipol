package Ders11;

public class ThreadSafe {

    private int count = 0;
    public synchronized void artir(){
        count++;
    }

    public void ThreadCalistir(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    artir();

                }


            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    artir();
                }
            }
        });

        thread1.start();
        thread.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        System.out.println("Count değişkeninin değeri " + count);

    }

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.ThreadCalistir();
    }
}
