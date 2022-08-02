package Stream.parallelStream;

import java.util.ArrayList;
import java.util.List;

public class parallelStreamEx {
    public static void main(String[] args) {
        List<Double> doubles=new ArrayList<>();
        for (int i=0;i<3;i++){
            doubles.add(Math.random()*100);
        }

        long time1=System.currentTimeMillis();
       Double sum=doubles.stream().reduce((acc, a)->acc+a).get();
        System.out.println(System.currentTimeMillis()-time1);
        System.out.println(sum);

        long time2=System.currentTimeMillis();
        Double sum2=doubles.parallelStream().reduce((acc, a)->acc+a).get();
        System.out.println(System.currentTimeMillis()-time1);
        System.out.println(sum);

        Double div1=doubles.stream().reduce((acc, a)->acc/a).get();
        System.out.println(div1);

        Double div2=doubles.parallelStream().reduce((acc, a)->acc/a).get();
        System.out.println(div2);

    }
}
