package collections.Map;

import HashCodeEquals.Student;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap=new LinkedHashMap<>(16, 0.75f, true);
        Student st1=new Student("Iskander", "Tabaev", 4);
        Student st2=new Student("Roman", "Stepanov", 3);
        Student st3=new Student("Max", "Goglazin", 6);
        Student st4=new Student("Sanya", "Pustinskii", 2);
        Student st5=new Student("Sanya", "Khmara", 4);
        Student st6=new Student("Kostya", "Bondarenko", 4);
        Student st7=new Student("Misha", "Sheglinskih", 3);
        Student st8=new Student("Dmitrii", "Andreev", 1);
        Student st9=new Student("Ivan", "Tropin", 5);

        linkedHashMap.put(3.33, st1);
        linkedHashMap.put(4.42, st2);
        linkedHashMap.put(4.95, st3);
        linkedHashMap.put(4.5, st4);
        linkedHashMap.put(4.7, st5);
        linkedHashMap.put(4.9, st6);
        linkedHashMap.put(3.9, st7);
        linkedHashMap.put(4.5, st8);
        linkedHashMap.put(3.6, st9);

        System.out.println(linkedHashMap);

        System.out.println( linkedHashMap.get(4.5));
        System.out.println(linkedHashMap.get(4.7));

        System.out.println(linkedHashMap);
    }
}
