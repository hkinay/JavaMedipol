package Ders9;


import java.util.ArrayList;
import java.util.List;

//Üst sınıf belirlendi
public class BoundGenerics <T extends Number>{
    private T number;


    private List<T> listem = new ArrayList<>();
    public void ekle (T eleman){
        listem.add(eleman);
    }


    private double getDoubleValue(){
        return number.doubleValue();
    }

    public BoundGenerics(T number) {
        this.number = number;
    }


    //Alt sınıf belirleme

    public static void addNumber(List<? super Integer> list){
        list.add(1);
        list.add(3);

    }




}







