package collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> integerSet=new HashSet<>();
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(8);

        Set<Integer> integerSet2=new HashSet<>();
        integerSet2.add(7);
        integerSet2.add(4);
        integerSet2.add(5);
        integerSet2.add(3);
        integerSet2.add(8);

        Set<Integer> union=new HashSet<>(integerSet);
        union.addAll(integerSet2);
        System.out.println(union);

        Set<Integer> intesect=new HashSet<>(integerSet);
        intesect.retainAll(integerSet2);
        System.out.println(intesect);

        Set<Integer> except=new HashSet<>(integerSet);
        except.removeAll(integerSet2);
        System.out.println(except);
    }
}
