package Ders6;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stacklar = new Stack<>();
        stacklar.add("Eleman");


            //Ternary Operatörü
        System.out.println(stacklar.empty() ? "Boş":"Dolu");

    }
}
