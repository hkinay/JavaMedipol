package Ders9;

public class GenericTipSınırlamalı <T extends Number & Comparable<T>>{

    private T data;

    public GenericTipSınırlamalı(T data) {
        this.data = data;
    }

    public void process (T input){
        if(data.compareTo(input) > 0){
            //yapılmak istenen işlem
        }
    }
}
