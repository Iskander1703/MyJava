package collections.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMothodsEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Искандер");
        arrayList.add("Рома");
        arrayList.add("Саня");
        arrayList.add("Миша");
        System.out.println(arrayList.get(0));
        arrayList.set(1,"Абобус");
        System.out.println(arrayList);
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);


    }
}
