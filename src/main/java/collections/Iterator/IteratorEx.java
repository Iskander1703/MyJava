package collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Искандер");
        arrayList.add("Рома");
        arrayList.add("Саня");
        arrayList.add("Миша");

        Iterator<String> iterator= arrayList.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(arrayList);

//        for (String a: arrayList){
//            arrayList.remove(a);
//        }
    }
}
