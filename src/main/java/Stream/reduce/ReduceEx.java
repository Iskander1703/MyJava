package Stream.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);

        Integer a = integerList.stream().reduce((acc, element) ->
                acc * element).get();

        Integer c = integerList.stream().reduce(2,(acc, element) ->
                acc * element);

        System.out.println(a);
        System.out.println(c);


        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> b = integerList.stream().reduce((acc, element) ->
                acc * element);

        if (b.isPresent()) {
            System.out.println(b.get());
        } else {
            System.out.println("Not Present");
        }
    }
}
