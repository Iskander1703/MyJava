package Stream.peek;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekEx {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(7);
        integerList.add(17);
        integerList.add(17);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);

        integerList.stream().distinct().forEach(System.out::println);

       List<Integer> list=integerList.stream().map(a->a+=10).peek(System.out::println).collect(Collectors.toList());
        System.out.println(list);

    }
}
