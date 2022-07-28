package collections.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySerchEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(8);
        arrayList.add(-13);
        arrayList.add(11);
        arrayList.add(21);
        arrayList.add(-3);
        arrayList.add(33);
        arrayList.add(-11);
        arrayList.add(12);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 12));

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList );


        Integer [] arr={5, 7, 8, -11, -8, 11, 24, 3, -45, -33, 56, 77, 83};
        List<Integer> arrayList1= Arrays.asList(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 56)  );
    }
}
