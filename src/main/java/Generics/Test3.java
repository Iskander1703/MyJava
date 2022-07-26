package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list2=new ArrayList<Integer>();
//        List<Object> list=new ArrayList<Integer>();

        List<?> list=new ArrayList<String>();
//        list.add("привет");
//        list.add("пока");

        List<Double> list1=new ArrayList<>();
        list1.add(3.14);
        list1.add(6.33);
        list1.add(11.18);
        showList(list1);

        List<String> list2=new ArrayList<>();
        list2.add("привет");
        list2.add("пока");
        list2.add("как дела?");
        showList(list2);

        List<? extends Number> whatIsIt =new ArrayList<Integer>();
//        whatIsIt.add(8.50);

        List<Integer> list3=new ArrayList<>();
        list3.add(13);
        list3.add(11);
        list3.add(63);
        showList(list3);

        sumFromArrList(list3);

        sumFromArrList(list1);

//        sumFromArrList(list2);



    }

    public static void showList(List<?> a){
        System.out.println(a);
    }

    public static void sumFromArrList(List<? extends Number> a){
        double sum=0;
        for (Number a1: a){
            sum+=a1.doubleValue();
        }
        System.out.println(sum);
    }

}
