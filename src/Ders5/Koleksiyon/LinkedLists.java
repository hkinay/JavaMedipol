package Ders5.Koleksiyon;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {


        LinkedList <String> envanterlistesi = new LinkedList<> ();

        envanterlistesi.add("Tuz");
        envanterlistesi.add("Şeker");
        envanterlistesi.add("Çay");

        envanterlistesi.addFirst("Baharat");
        envanterlistesi.addFirst("Yağ");

        System.out.println(envanterlistesi);

        envanterlistesi.remove("Yağ");
        envanterlistesi.removeFirst(); //listenin ilk elemanını siler
        envanterlistesi.removeLast(); //listenin son elemanını siler

        envanterlistesi.get(2);
        String ilkeleman = envanterlistesi.getFirst();
        String soneleman = envanterlistesi.getLast();

        //Arraylistlerdeki clear, set, contains, isEmpty methodlarını kullanabilir

        envanterlistesi.offer("Bayrak"); //Kuyruğun sonuna ekler
        envanterlistesi.offer("Etiket");

        envanterlistesi.poll();
        String ikincieleman = envanterlistesi.peek();

envanterlistesi.peekFirst(); //kuyruğun başı
envanterlistesi.peekLast(); // kuyruğun sonu



    }
}
