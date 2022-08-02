package Lambda.LambdaEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfEx {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Hello");
        stringList.add("How are you?");
        stringList.add("I m fine");
        stringList.add("And you");
        stringList.add("I m too");
        stringList.add("All ok?");

//        System.out.println(stringList);
//        stringList.removeIf(a->a.contains("?"));
//        System.out.println(stringList);
//
//        System.out.println(stringList);
//        stringList.removeIf(a->a.length()>7);
//        System.out.println(stringList);

//        System.out.println(stringList);
//        Predicate<String> predicate=a->a.length()>7;
//        Predicate<String> predicate2=a->a.contains("?");
//        stringList.removeIf(predicate.and(predicate2));
//        System.out.println(stringList);

        System.out.println(stringList);
        Predicate<String> predicate=a->a.length()>7;
        Predicate<String> predicate2=a->a.contains("?");
        stringList.removeIf(predicate.or(predicate2));
        System.out.println(stringList);
    }
}
