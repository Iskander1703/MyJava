package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Искандер");
        arrayList.add("Рома");
        arrayList.add("Саня");
        arrayList.add("Миша");
        arrayList.add("Иван");

        ArrayList<String> arrayList1=new ArrayList<>(arrayList);

        arrayList.add("Евгений");

        System.out.println(arrayList);
        System.out.println(arrayList1);

        List<String> list2=List.copyOf(arrayList);
        System.out.println(list2);
        list2.add("Аджара Гуджу");//Exception

        //        ----------------------------------------------------------------------------

//        List<Integer> list=List.of(3, 8, 13);
//        System.out.println(list);
//        list.add(11);//Exception

//        Object [] array=arrayList.toArray();
//        String [] strings=arrayList.toArray(new String[0]);
//        for (String a: strings){
//            System.out.println(a);
//        }

//        ----------------------------------------------------------------------------

//        List<String> arrayList1=arrayList.subList(2,4);
//        System.out.println("ArrayList: "+arrayList);
//        System.out.println("SubList: " +arrayList1);
//
//        arrayList1.add("Максим");
//
//        System.out.println("ArrayList: "+arrayList);
//        System.out.println("SubList: " +arrayList1);
//
//        arrayList.add("Masha");
//
//        System.out.println("ArrayList: "+arrayList);
//        System.out.println("SubList: " +arrayList1);

        //        ----------------------------------------------------------------------------
//
//        ArrayList<String> arrayList2=new ArrayList<>();
//        arrayList2.add("Искандер");
//        arrayList2.add("Рома");
//        arrayList2.add("Иван");

//        arrayList.removeAll(arrayList2);
//        System.out.println(arrayList);
//
//        arrayList.retainAll(arrayList2);
//        System.out.println(arrayList);
//        System.out.println(arrayList.containsAll(arrayList2));





    }
}
