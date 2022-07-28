package collections.Map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap=new HashMap();
        hashMap.put(17889209, "Iskander Tabaev");
        hashMap.put(13567890, "Roman Stepanov");
        hashMap.put(56789045, "Max Goglazin");
        hashMap.put(95678902, "Kostya Bondarenko");

        hashMap.putIfAbsent(95678902, "Vlad Bashaev");

        System.out.println(hashMap);

        System.out.println(hashMap.get(17889209));

        System.out.println(hashMap.remove(17889209));
        System.out.println(hashMap);

        System.out.println(hashMap.containsValue("Max Goglazin"));
        System.out.println(hashMap.containsValue("Magomed Magomedov"));

        System.out.println(hashMap.containsKey(56789045));
        System.out.println(hashMap.containsValue(45030304));

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values() );

      for (Map.Entry<Integer, String> entry: hashMap.entrySet()){

//          System.out.println( entry.getClass().getDeclaredFields());
//
//          for (Field a: entry.getClass().getDeclaredFields()){
//              System.out.println(a);
//          }
//          break;
          System.out.println("Key: "+entry.getKey()+ " Value: "+entry.getValue());
      }


    }
}
