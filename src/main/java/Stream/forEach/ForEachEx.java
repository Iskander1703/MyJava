package Stream.forEach;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        int [] array={5, 9, 3, 8, 1};
        List<Integer> list=new ArrayList<>();
        Arrays.stream(array).forEach(el->{
            el=el*2;
            System.out.println(el);
            list.add(el);
        });

        System.out.println(list.toString());

        Arrays.stream(array).forEach(Utils::myMethod);
    }
}
