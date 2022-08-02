package Lambda.Predicate;

import Lambda.LambdaEx1.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Student st1=new Student("Iskander", 'm', 21, 4, 3.33);
        Student st2=new Student("Roma", 'm', 21, 4, 4.21);
        Student st3=new Student("Masha", 'f', 18, 1, 4.7);
        Student st4=new Student("Dasha", 'f', 21, 3, 4.6);
        Student st5=new Student("Nikita", 'm', 18, 1, 5.00);

        ArrayList<Student> studentArrayList=new ArrayList<>();


        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        Predicate<Student> predicate1=a->a.age>20;
        Predicate<Student> predicate2=a->a.sex=='f';
        testStudent2(studentArrayList, predicate1.and(predicate2));
        System.out.println("--------------------------------------");
        testStudent2(studentArrayList, predicate1.or(predicate2));
        System.out.println("--------------------------------------");
      testStudent2(studentArrayList, predicate1.negate().and(predicate2.negate()));

    }

    public static void testStudent2(ArrayList<Student> studentArrayList, Predicate<Student> predicate){
        for (Student student: studentArrayList){
            if (predicate.test(student)){
                System.out.println(student);
            }
        }
    }
}
