package collections.Queue;

import HashCodeEquals.Student;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        Student st1 = new Student("Iskander", "Tabaev", 4);
        Student st2 = new Student("Roman", "Stepanov", 3);
        Student st3 = new Student("Max", "Goglazin", 6);
        Student st4 = new Student("Sanya", "Pustinskii", 2);
        Student st5 = new Student("Sanya", "Khmara", 4);
        Student st6 = new Student("Kostya", "Bondarenko", 4);
        Student st7 = new Student("Misha", "Sheglinskih", 3);
        Student st8 = new Student("Dmitrii", "Andreev", 1);
        Student st9 = new Student("Ivan", "Tropin", 5);

        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        priorityQueue.add(st6);
        priorityQueue.add(st7);
        priorityQueue.add(st8);
        priorityQueue.add(st9);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll() );

    }
}
