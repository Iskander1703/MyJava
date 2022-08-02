package Lambda.ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        List<String> strings= List.of("Hello", "How are you?", "I m fine", "And you?");
        strings.forEach(a-> System.out.println(a));
    }
}
