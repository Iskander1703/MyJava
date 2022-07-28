package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListEx {
    public static void main(String[] args) {
        Queue<String> stringQueue=new LinkedList<>();
        stringQueue.add("Iskander");
        stringQueue.add("Roma");
        stringQueue.add("Ivan");
        stringQueue.add("Max");
        stringQueue.add("Kostya");


        System.out.println(stringQueue.remove());
//        System.out.println(stringQueue.remove());
//        System.out.println(stringQueue.remove());
//        System.out.println(stringQueue.remove());
//        System.out.println(stringQueue.remove());

        System.out.println(stringQueue.element());
        System.out.println(stringQueue.peek());

    }
}
