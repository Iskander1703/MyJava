package Stream.minAndMax;

import java.util.ArrayList;

public class minAndMaxEx {
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

       Student min= studentArrayList.stream().min((s1, s2)->s1.getAge()-s2.getAge()).get();
        Student max= studentArrayList.stream().max((s1, s2)->s1.getAge()-s2.getAge()).get();
        System.out.println(min);
        System.out.println(max);
    }
}
