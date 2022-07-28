package collections.LinkedList;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student student1=new Student("Iskander", 4);
        Student student2=new Student("Max", 5);
        Student student3=new Student("Kostya", 4);
        Student student4=new Student("Roma", 3);
        Student student5=new Student("Sanya", 2);
        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);

        System.out.println(studentLinkedList );

    }
}
