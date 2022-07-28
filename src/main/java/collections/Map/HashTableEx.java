package collections.Map;

import HashCodeEquals.Student;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashMap=new Hashtable<>();
        Student st1=new Student("Iskander", "Tabaev", 4);
        Student st2=new Student("Roman", "Stepanov", 3);
        Student st3=new Student("Max", "Goglazin", 6);
        Student st4=new Student("Sanya", "Pustinskii", 2);
        Student st5=new Student("Sanya", "Khmara", 4);
        Student st6=new Student("Kostya", "Bondarenko", 4);
        Student st7=new Student("Misha", "Sheglinskih", 3);
        Student st8=new Student("Dmitrii", "Andreev", 1);
        Student st9=new Student("Ivan", "Tropin", 5);

        hashMap.put(3.33, st1);
        hashMap.put(4.42, st2);
        hashMap.put(4.95, st3);
        hashMap.put(4.5, st4);
        hashMap.put(4.7, st5);
        hashMap.put(4.9, st6);
        hashMap.put(3.9, st7);
        hashMap.put(4.5, st8);


        try {
            hashMap.put(null, st9);
        }
        catch (NullPointerException e){
            System.out.println("В HashTable ключ не может быть null");
        }

        try {
            hashMap.put(3.11, null);
        }
        catch (NullPointerException e){
            System.out.println("В HashTable значение не может быть null");
        }
    }
}
