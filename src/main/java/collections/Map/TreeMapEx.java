package collections.Map;

import HashCodeEquals.Student;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap<Double, Student> treeMap=new TreeMap<>();
        Student st1=new Student("Iskander", "Tabaev", 4);
        Student st2=new Student("Roman", "Stepanov", 3);
        Student st3=new Student("Max", "Goglazin", 6);
        Student st4=new Student("Sanya", "Pustinskii", 2);
        Student st5=new Student("Sanya", "Khmara", 4);
        Student st6=new Student("Kostya", "Bondarenko", 4);
        Student st7=new Student("Misha", "Sheglinskih", 3);
        Student st8=new Student("Dmitrii", "Andreev", 1);
        Student st9=new Student("Ivan", "Tropin", 5);

        treeMap.put(3.33, st1);
        treeMap.put(4.42, st2);
        treeMap.put(4.95, st3);
        treeMap.put(4.5, st4);
        treeMap.put(4.7, st5);
        treeMap.put(4.9, st6);
        treeMap.put(3.9, st7);
        treeMap.put(4.5, st8);
        treeMap.put(3.6, st9);


        System.out.println(treeMap);

        treeMap.put(3.6, new Student("Ivan", "Tropin", 4));
        System.out.println(treeMap);
        treeMap.remove(3.6);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap);
        System.out.println(treeMap.tailMap(4.5));
        System.out.println(treeMap.headMap(4.0));

        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap.containsValue(new Student("Dmitrii", "Andreev", 1)));
    }
}
