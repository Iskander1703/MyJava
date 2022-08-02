package Stream.mapToInt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntEx {
    public static void main(String[] args) {
        Student st1 = new Student("Iskander", 'm', 21, 4, 3.33);
        Student st2 = new Student("Roma", 'm', 25, 4, 4.21);
        Student st3 = new Student("Masha", 'f', 18, 1, 4.7);
        Student st4 = new Student("Dasha", 'f', 21, 3, 4.6);
        Student st5 = new Student("Nikita", 'm', 18, 1, 5.00);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

      List<Integer> list =studentArrayList.stream().mapToInt(e->e.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(list);

        List<Double> doubles =studentArrayList.stream().mapToDouble(e->e.getAvgGrade()).boxed().collect(Collectors.toList());
        System.out.println(doubles);

        int sum=studentArrayList.stream().mapToInt(student -> student.getAge()).sum();
        System.out.println(sum);

        double average=studentArrayList.stream().mapToDouble(student -> student.getAvgGrade()).average().getAsDouble();
        System.out.println(average);

        int min=studentArrayList.stream().mapToInt(student -> student.getAge()).min().getAsInt();
        System.out.println(min);

        int max=studentArrayList.stream().mapToInt(student -> student.getAge()).max().getAsInt();
        System.out.println(max);


    }
}
