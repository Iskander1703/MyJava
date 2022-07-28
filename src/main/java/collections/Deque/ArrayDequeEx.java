package collections.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.addFirst(8);
        integerDeque.addFirst(3);
        integerDeque.addFirst(1);
        integerDeque.addLast(7);
        System.out.println(integerDeque);
//        System.out.println(integerDeque.pollFirst());
//        System.out.println(integerDeque.pollLast());
//        System.out.println(integerDeque.pollLast());
//        System.out.println(integerDeque.pollLast());
//        System.out.println(integerDeque.getFirst());
//        System.out.println(integerDeque.getLast());
//        integerDeque.clear();
//        System.out.println(integerDeque.peekFirst());
//        System.out.println(integerDeque.peekLast());

    }
}
