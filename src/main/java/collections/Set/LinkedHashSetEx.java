package collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet <String> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add("Iskander");
        linkedHashSet.add("Roma");
        linkedHashSet.add("Sanya");
        linkedHashSet.add("Vanya");

        System.out.println(linkedHashSet);

        linkedHashSet.add("Kostya");

        System.out.println(linkedHashSet);
    }
}
