package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ParametriziedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(3);
        System.out.println(genMethod.getSecondElement(arrayList));
        ArrayList<String> strings=new ArrayList<>();
        strings.add("Iskander");
        strings.add("Alan");
        strings.add("Masha");
       Comparator<String> comparator=new Comparator<String>() {
           @Override
           public int compare(String s, String t1) {
               return s.compareTo(t1);
           }
       };
        Collections.sort(strings, comparator);

        System.out.println(genMethod.getSecondElement(strings));


    }
}

class genMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
         return al.get(1);
    }
}
