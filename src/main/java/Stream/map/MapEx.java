package Stream.map;

import org.checkerframework.checker.units.qual.A;
import patterns.ServiceLocator.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("How are you?");
        arrayList.add("I m fine");
        arrayList.add("And you?");

//        for (int i=0;i<arrayList.size();i++){
//            arrayList.set(i, String.valueOf(arrayList.get(i).length()));
//        }

        System.out.println(arrayList);

        System.out.println(arrayList.stream().map(element -> element.length()).collect(Collectors.toList()));
        System.out.println(arrayList);

        int array[] = {5, 8, 3, 9, 1};
    int  array2[]=  Arrays.stream(array).map(a->{
          if (a%3==0){
             a=a/3;
          }
          return a;
      }).toArray();
      Arrays.stream(array).forEach(a-> System.out.println(a));
        Arrays.stream(array2).forEach(a-> System.out.println(a));

        Set<String> set=new TreeSet<>();
        set.add("Hello");
        set.add("How are you?");
        set.add("I m fine");
        set.add("And you?");
        System.out.println(set);

        Set<String> set1 =set.stream().map(new Function<String, String>() {

            @Override
            public String apply(String s) {
                s=s+"ajaraguju";
                return s;
            }
        }).collect(Collectors.toSet());

        System.out.println(set);
        System.out.println(set1);

      Set<String> set2= set.stream().map(a->a+="ajaraguja").collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);

    }
}
