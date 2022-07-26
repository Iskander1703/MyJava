package collections.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsEx2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1=new StringBuilder("A");
        StringBuilder stringBuilder2=new StringBuilder("B");
        StringBuilder stringBuilder3=new StringBuilder("C");
        StringBuilder stringBuilder4=new StringBuilder("D");

        StringBuilder [] stringBuilders=new StringBuilder[]{
                stringBuilder1, stringBuilder2, stringBuilder3, stringBuilder4
        };

        List<StringBuilder> list = Arrays.asList(stringBuilders);
        System.out.println(list);

        stringBuilders[0].append("!!!");
        System.out.println(list);
    }
}
