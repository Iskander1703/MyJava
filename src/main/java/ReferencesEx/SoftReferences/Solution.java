package ReferencesEx.SoftReferences;

import java.lang.ref.SoftReference;

public class Solution {
    public static void main(String[] args) {
        //создание объекта Cat
        Cat cat = new Cat();

//создание мягкой ссылки на объект Cat
        SoftReference<Cat> catRef = new SoftReference<Cat>(cat);

//теперь на объект ссылается только мягкая ссылка catRef.
        cat = null;

//теперь на объект ссылается еще и обычная переменная cat
        cat = catRef.get();

        System.out.println(catRef.get());
//очищаем мягкую ссылку
        catRef.clear();
        System.out.println(catRef.get());
        System.out.println(cat);
    }
}
