package HashCodeEquals;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> studentDoubleMap =new HashMap<>();
        Student st1=new Student("Iskander", "Tabaev", 4);
        Student st2=new Student("Roman", "Stepanov", 3);
        Student st3=new Student("Max", "Goglazin", 6);
        studentDoubleMap.put(st1, 3.43);
        studentDoubleMap.put(st2, 4.55);
        studentDoubleMap.put(st3, 4.9);

        Student st4=new Student("Max", "Goglazin", 6);

        System.out.println(st4.equals(st3));
        System.out.println(st4.hashCode());
        System.out.println(st3.hashCode());

        boolean result= studentDoubleMap.containsKey(st4);
        System.out.println(result);




    }
}
