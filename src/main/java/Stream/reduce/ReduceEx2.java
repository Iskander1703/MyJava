package Stream.reduce;

import java.util.ArrayList;
import java.util.List;

public class ReduceEx2 {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("How are you?");
        stringList.add("I m fine and you?");
        stringList.add("I m too");

      String dialog=  stringList.stream().reduce((acc, elem)-> acc+"\n"+"-"+elem).get();
        System.out.println(dialog);
    }
}
