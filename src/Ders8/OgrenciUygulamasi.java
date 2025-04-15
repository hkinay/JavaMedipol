package Ders8;

import java.util.ArrayList;
import java.util.List;

public class OgrenciUygulamasi {
    public static void main(String[] args) {

  /*      List<LambdaOrnekOgrenci> ogrenciList = new ArrayList<>();

        ogrenciList.add(new LambdaOrnekOgrenci("Ali",18,3.12));
        ogrenciList.add(new LambdaOrnekOgrenci("Ahmet",30,3.12));
        ogrenciList.add(new LambdaOrnekOgrenci("Zeynep",40,3.12));
        ogrenciList.add(new LambdaOrnekOgrenci("Ayşe",19,3.12));

        //Filtreleme

         ogrenciList.stream().filter(ogrenci -> ogrenci.getYas() >= 20).forEach(System.out::println);
*/

        List<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("snake");
        animals.set(2,"lizard");
        animals.add(1,"fish");
        animals.remove(3);
        System.out.println(animals);




    }

}
