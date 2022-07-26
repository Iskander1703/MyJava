package Generics;

import java.util.ArrayList;

public class MyTest1 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        ArrayList<String> stringArrayList=new ArrayList<>();
        arrayList=stringArrayList;
        arrayList.add(8);
        System.out.println(stringArrayList);
        stringArrayList.add("9");
        System.out.println(stringArrayList);
        String s=String.valueOf(stringArrayList.get(0));
        System.out.println(s);
    }

    public <T> void  getThis(T trahnalnitel){

    }
}
