package Ders5.Koleksiyon;

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
        System.out.println("Stack boş mu " + result);

        stk.pop(); //En üstteki elemanı çıkarır
        System.out.println(stk);

        int konum = stk.search(12);
        System.out.println(konum);




                    //Ternary Operatörü
        System.out.println(stacklar.empty() ? "Boş":"Dolu");

        String exp = "{[()]}";

        System.out.println(dengeliMi(exp));

    }


    public static boolean dengeliMi (String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if (ch==')' || ch == '}' || ch== ']'){
                if (stack.empty()) return false;
                char last = stack.pop();

                if((ch==')' && last !='(') || (ch=='}' && last != '{') || (ch==']' && last != '['))
                {
                    return  false;
                }
            }

        }

return stack.empty();



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
