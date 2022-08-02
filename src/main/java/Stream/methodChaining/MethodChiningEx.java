package Stream.methodChaining;

import java.util.Arrays;

public class MethodChiningEx {
    public static void main(String[] args) {
        int [] array={3,8,1,5,9,12,4,21,81,7,18};

      int b=  Arrays.stream(array).filter(a->a%2==1).map(a->{
            if (a%3==0){
                a=a/3;
            }
            return a;
        }).reduce((acc, elem)->acc+=elem).getAsInt();

        System.out.println(b );
    }
}
