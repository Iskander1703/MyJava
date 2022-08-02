package Stream.flatMap;


import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {

    public static void main(String[] args) {
        Student st1 = new Student("Iskander", 'm', 21, 4, 3.33);
        Student st2 = new Student("Roma", 'm', 21, 4, 4.21);
        Student st3 = new Student("Masha", 'f', 18, 1, 4.7);
        Student st4 = new Student("Dasha", 'f', 21, 3, 4.6);
        Student st5 = new Student("Nikita", 'm', 18, 1, 5.00);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        Faculty faculty1=new Faculty("Computer science");
        Faculty faculty2=new Faculty("Applied math");
        faculty1.addNewStudent(st1);
        faculty1.addNewStudent(st2);
        faculty1.addNewStudent(st3);
        faculty2.addNewStudent(st4);
        faculty2.addNewStudent(st5);

        List<Faculty> facultyList=new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);
        facultyList.stream().flatMap(a->
            a.getStudentArrayList().stream()).forEach(System.out::println);

    }
}
