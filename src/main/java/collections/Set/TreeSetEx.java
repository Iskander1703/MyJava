package collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> stringSet=new TreeSet<>();
        stringSet.add("Iskander");
        stringSet.add("Roma");
        stringSet.add("Max");
        stringSet.add("Vanya");
        stringSet.add("Sanya");
//        stringSet.add(null);

        System.out.println(stringSet);

    }
}
