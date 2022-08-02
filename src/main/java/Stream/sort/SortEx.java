package Stream.sort;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEx {
    public static void main(String[] args) {
        Student st1 = new Student("Iskander", 'm', 23, 4, 3.33);
        Student st2 = new Student("Roma", 'm', 21, 4, 4.21);
        Student st3 = new Student("Masha", 'f', 18, 1, 4.7);
        Student st4 = new Student("Dasha", 'f', 21, 3, 4.6);
        Student st5 = new Student("Nikita", 'm', 19, 1, 5.00);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        List<Student> studentArrayList2=  studentArrayList.stream().sorted((a, b)-> a.age- b.age).collect(Collectors.toList());
        System.out.println(studentArrayList2);

        List<Student> studentArrayList3=  studentArrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(studentArrayList3);

    }
}
