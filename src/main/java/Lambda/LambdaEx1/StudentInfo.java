package Lambda.LambdaEx1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StudentInfo {
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



        System.out.println(studentArrayList);
        System.out.println("Sort with using lambda:");
        Collections.sort(studentArrayList, (s1, s2)->s1.age- s2.age);
        System.out.println(studentArrayList);

        StudentInfo studentInfo=new StudentInfo();
        System.out.println("--------------------------------------");
        System.out.println("Work with predicate functional interface:");
        System.out.println("--------------------------------------");
        studentInfo.testStudent2(studentArrayList, s-> s.age>20);
        System.out.println("--------------------------------------");
        studentInfo.testStudent2(studentArrayList, s-> s.sex=='f');
        System.out.println("--------------------------------------");
        studentInfo.testStudent2(studentArrayList, s-> s.sex=='m');
        System.out.println("--------------------------------------");
        studentInfo.testStudent2(studentArrayList, s-> s.course>3);
        System.out.println("--------------------------------------");


        System.out.println("Work without lambda:");
        System.out.println("--------------------------------------");
        studentInfo.testStudent(studentArrayList, new StudentChecksAge());

        System.out.println("--------------------------------------");
        System.out.println("Work with anonymous class without lambda:");
        studentInfo.testStudent(studentArrayList, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.sex=='f';
            }
        });
        System.out.println("--------------------------------------");

        System.out.println("Work without predicate functional interface and with lambda:");
        studentInfo.testStudent(studentArrayList, s->{return s.sex=='m';});
        System.out.println("--------------------------------------");
        studentInfo.testStudent(studentArrayList, s -> {return s.age<20;});
        System.out.println("--------------------------------------");
        studentInfo.testStudent(studentArrayList, s -> {return s.age==20;});

        System.out.println("--------------------------------------");

        System.out.println("Work with methods:");
        studentInfo.printStudentOverGrade(studentArrayList, 4.5);
        System.out.println("--------------------------------------");
        studentInfo.printStudentUnderAge(studentArrayList,22);
        System.out.println("--------------------------------------");
        studentInfo.printStudentMixCondition(studentArrayList, 19, 5.0, 'f');
        System.out.println("--------------------------------------");

        System.out.println("Work with \"or\" and \"and\" and \"negative\" predicates:");

        Predicate<Student> predicate1=a->a.age>20;
        Predicate<Student> predicate2=a->a.sex=='f';
        studentInfo.testStudent2(studentArrayList, predicate1.and(predicate2));
        System.out.println("--------------------------------------");
        studentInfo.testStudent2(studentArrayList, predicate1.or(predicate2));
        System.out.println("--------------------------------------");
        studentInfo.testStudent2(studentArrayList, predicate1.negate().and(predicate2.negate()));







    }

    public void printStudentOverGrade(ArrayList<Student> studentArrayList, double grade){
                for (Student student: studentArrayList){
                    if (student.avgGrade>grade){
                        System.out.println(student);
                    }
                }
    }

    public void printStudentUnderAge(ArrayList<Student> studentArrayList, int age){
        for (Student student: studentArrayList){
            if (student.age<age){
                System.out.println(student);
            }
        }
    }

    public void printStudentMixCondition(ArrayList<Student> studentArrayList, int age, double grade, char sex){
        for (Student student: studentArrayList){
            if (student.age>age && student.avgGrade<grade && student.sex==sex){
                System.out.println(student);
            }
        }
    }

    public void testStudent(@NotNull ArrayList<Student> studentArrayList, StudentChecks studentChecks){
        for (Student student: studentArrayList){
            if (studentChecks.check(student)){
                System.out.println(student);
            }
        }
    }

    public void testStudent2(ArrayList<Student> studentArrayList, Predicate<Student> predicate){
        for (Student student: studentArrayList){
            if (predicate.test(student)){
                System.out.println(student);
            }
        }
    }
}
