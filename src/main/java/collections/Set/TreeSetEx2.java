package collections.Set;

import HashCodeEquals.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> studentSet=new TreeSet<>();
        Student st1=new Student("Iskander", "Tabaev", 4);
        Student st2=new Student("Roman", "Stepanov", 3);
        Student st3=new Student("Max", "Goglazin", 6);
        Student st4=new Student("Sanya", "Pustinskii", 2);
        Student st5=new Student("Sanya", "Khmara", 4);
        Student st6=new Student("Kostya", "Bondarenko", 4);
        Student st7=new Student("Misha", "Sheglinskih", 3);
        Student st8=new Student("Dmitrii", "Andreev", 1);
        Student st9=new Student("Ivan", "Tropin", 5);

        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);
        studentSet.add(st6);
        studentSet.add(st7);
        studentSet.add(st8);
        studentSet.add(st9);

        System.out.println(studentSet);

        System.out.println(studentSet.first());
        System.out.println(studentSet.last());

        Student student1=new Student("Zaur", "Tregulov", 3);
        Student student2=new Student("Masha", "Biktuganova", 4);
        System.out.println(studentSet.headSet(student1));
        System.out.println(studentSet.tailSet(student2));
        System.out.println(studentSet.subSet(student1,student2));
        System.out.println();

    }
}
