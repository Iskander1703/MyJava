package Stream.distinct;

import java.util.ArrayList;
import java.util.List;

public class DistinctEx {
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

    }
}
