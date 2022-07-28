package collections.Map;

import HashCodeEquals.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap=new TreeMap<>();
        TreeMap<Student, Double> treeMap2=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getName().compareTo(t1.getName());
            }
        });
        Student st1=new Student("Iskander", "Tabaev", 4);
        Student st2=new Student("Roman", "Stepanov", 3);
        Student st3=new Student("Max", "Goglazin", 6);
        Student st4=new Student("Sanya", "Pustinskii", 2);
        Student st5=new Student("Sanya", "Khmara", 4);
        Student st6=new Student("Kostya", "Bondarenko", 4);
        Student st7=new Student("Misha", "Sheglinskih", 3);
        Student st8=new Student("Dmitrii", "Andreev", 1);
        Student st9=new Student("Ivan", "Tropin", 5);

        treeMap.put(st1, 3.33);
        treeMap.put(st2, 4.42);
        treeMap.put(st3, 4.95);
        treeMap.put(st4, 4.5);
        treeMap.put(st5, 4.7);
        treeMap.put(st6, 4.9);
        treeMap.put(st7,3.9);
        treeMap.put(st8, 4.5);
        treeMap.put(st9, 3.6);

        treeMap2.put(st1, 3.33);
        treeMap2.put(st2, 4.42);
        treeMap2.put(st3, 4.95);
        treeMap2.put(st4, 4.5);
        treeMap2.put(st5, 4.7);
        treeMap2.put(st6, 4.9);
        treeMap2.put(st7,3.9);
        treeMap2.put(st8, 4.5);
        treeMap2.put(st9, 3.6);

        System.out.println(treeMap);
        System.out.println(treeMap2);
        System.out.println(treeMap.containsKey(new Student("Ivan", "Tropin", 5)));


    }
}