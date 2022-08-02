package Stream.filter;

import Lambda.LambdaEx1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEx {
    public static void main(String[] args) {
        Student st1 = new Student("Iskander", 'm', 21, 4, 3.33);
        Student st2 = new Student("Roma", 'm', 21, 4, 4.21);
        Student st3 = new Student("Masha", 'f', 18, 1, 4.7);
        Student st4 = new Student("Dasha", 'f', 21, 3, 4.6);
        Student st5 = new Student("Nikita", 'm', 18, 1, 5.00);

        ArrayList<Student> studentArrayList = new ArrayList<>();

        Stream<Student> studentStream = Stream.of(st1, st2, st3);


        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        List<Student> students = studentArrayList.stream().filter(s -> {
            if (s.course == 3 || s.course == 4)
                return true;
            else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(students);

        Predicate<Student> predicate1 = a -> a.age > 19;
        Predicate<Student> predicate2 = a -> a.avgGrade > 4.5;

        List<Student> students2 = studentArrayList.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());
        System.out.println(students2);

    }
}
