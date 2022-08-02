package Stream.collect;

import java.util.*;
import java.util.stream.Collectors;

public class CollectEx {
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

        Map<Integer, List<Student>> map = studentArrayList.stream().map(a -> {
            a.setName(a.getName().toUpperCase(Locale.ROOT));
            return a;
        }).collect(Collectors.groupingBy(a -> a.getCourse()));


        for (Map.Entry<Integer, List<Student>> listEntry : map.entrySet()) {
            System.out.print(listEntry.getKey() + " course: ");
            System.out.println(listEntry.getValue());
        }

        Map<Boolean, List<Student>> map2 = studentArrayList.stream().map(a -> {
            a.setName(a.getName().toUpperCase(Locale.ROOT));
            return a;
        }).collect(Collectors.partitioningBy(a -> a.getAvgGrade() > 4.5));

        for (Map.Entry<Boolean, List<Student>> listEntry : map2.entrySet()) {
            if (listEntry.getKey() == false) {
                System.out.print("AVG Grade <4.5: ");
            } else {
                System.out.print("AVG Grade >4.5: ");
            }
            System.out.println(listEntry.getValue());
        }
    }


}
