package collections.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s="мадам";
        List<Character> list=new LinkedList<>();
        for (char a: s.toCharArray()){
            list.add(a);
        }
        ListIterator<Character> listIterator1=list.listIterator();
        ListIterator<Character> listIterator2=list.listIterator(list.size());
        while (listIterator1.hasNext() && listIterator2.hasPrevious()){

            System.out.println(listIterator1.next());
            System.out.println(listIterator2.previous());
//            if (listIterator1.next().equals(listIterator2.previous())){
//                System.out.println("Это не полиндром");
//               return;
//            }
        }

        System.out.println("Это полиндром");



    }
}
