package Stream.count;

import java.util.ArrayList;
import java.util.List;

public class CountEX {
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
        System.out.println(integerList.stream().count());
        System.out.println(integerList.stream().distinct().count());

    }
}
