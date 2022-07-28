package collections.Stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stringStack =new Stack<>();
        stringStack.push("Iskander");
        stringStack.push("Roma");
        stringStack.push("Kostya");
        stringStack.push("Max");
//        System.out.println(stringStack);
//        System.out.println(stringStack.pop());
//        System.out.println(stringStack.pop());
//        System.out.println(stringStack.pop());
//        System.out.println(stringStack.pop());
//        System.out.println(stringStack);
//        System.out.println(stringStack.pop());


        System.out.println(stringStack.peek());
        System.out.println(stringStack.peek());
        System.out.println(stringStack.peek());
        System.out.println(stringStack.peek());
        while (!stringStack.isEmpty()){
            System.out.println(stringStack.pop());
            System.out.println(stringStack);
        }






    }
}
