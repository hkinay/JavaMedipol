package Ders6;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stacklar = new Stack<>();
        stacklar.add("Eleman");


        Stack<Integer> stk = new Stack<>();
        boolean result = stk.empty();
        System.out.println("Is the stack empty?" + result);

        stk.push(11);
        stk.push(12);
        stk.push(13);
        System.out.println("Stacktaki elemanlar " + stk);
        result = stk.empty();
        System.out.println("Stack boş mu" + result);

        stk.pop();





            //Ternary Operatörü
        System.out.println(stacklar.empty() ? "Boş":"Dolu");

    }
    static void pushElement(Stack stack, int x){
        stack.push(x);
        System.out.println("Push -> " + x);



    }
    static  void popElement(Stack stack){
        stack.pop();
        System.out.println("Pop -> " + stack);

    }




}
