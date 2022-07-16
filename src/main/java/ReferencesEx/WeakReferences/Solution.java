package ReferencesEx.WeakReferences;

import java.lang.ref.WeakReference;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //создание объекта Cat
        Cat cat = new Cat();

//создание слабой ссылки на объект Cat
        WeakReference<Cat> catRef = new WeakReference<Cat>(cat);

//теперь на объект ссылается только слабая ссылка catRef.
        cat = null;

        System.out.println(catRef.get());

//теперь на объект ссылается еще и обычная переменная cat
        System.gc();

//очищаем слабую ссылку
        Thread.sleep(1000);

        System.out.println(catRef.get());
    }
}
