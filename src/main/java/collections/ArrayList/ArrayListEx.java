package collections.ArrayList;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Искандер");
        arrayList.add("Рома");
        arrayList.add("Саня");
        arrayList.add("Миша");
        ArrayList<String> arrayList2=new ArrayList<>();
        List<String> arrayList3=new LinkedList<>();
        arrayList2.add("Искандер");
        arrayList2.retainAll(arrayList3);
        arrayList3.indexOf(1);

        arrayList.retainAll(arrayList2);
        System.out.println(arrayList);

    }
}
