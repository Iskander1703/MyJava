package comparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Iskander");
        arrayList.add("Sanya P.");
        arrayList.add("Sanya H");
        arrayList.add("Vanya");
        arrayList.add("Maxim");
        arrayList.add("Kostya");
        arrayList.add("Misha");
        arrayList.add("Dima");
        arrayList.add("Roma");
        Collections.sort(arrayList);
        for(String a:arrayList){
            System.out.println(a);
        }

    }
}
