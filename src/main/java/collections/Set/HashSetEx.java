package collections.Set;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> stringHashSet=new HashSet<>();
        stringHashSet.add("Iskander");
        stringHashSet.add("Roma");
        stringHashSet.add("Max");
        stringHashSet.add("Vanya");
        stringHashSet.add("Sanya");
        stringHashSet.add(null);

        System.out.println(stringHashSet);

        for(String s: stringHashSet){
            System.out.println(s);
        }

        stringHashSet.size();
        stringHashSet.remove("Iskander");
        stringHashSet.size();

        System.out.println(stringHashSet.isEmpty());

        System.out.println(stringHashSet.contains("Misha"));
        System.out.println(stringHashSet.contains("Vanya"));




    }
}
