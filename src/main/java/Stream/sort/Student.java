package Stream.sort;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable{
    private String name;
   public char sex;
    public int age;
    public int course;
    public double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }


    @Override
    public int compareTo(@NotNull Object o) {
        return this.course-course;
    }
}
