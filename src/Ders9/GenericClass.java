package Ders9;

import java.util.ArrayList;

public class GenericClass <T>{
    private ArrayList<T> listem = new ArrayList<>();

    public void addList(T obje){
        this.listem.add(obje);
    }

    public ArrayList<T> getListem(){
        return this.listem;
    }
}

