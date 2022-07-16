import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchrArrayEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<1000;i++){
            arrayList.add(i);
        }
        List<Integer> synchronizedList= Collections.synchronizedList(arrayList);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (synchronizedList) {
                    Iterator<Integer> integerIterator = synchronizedList.iterator();
                    while (integerIterator.hasNext()) {
                        System.out.println(integerIterator.next());
                    }

                }
            }
        });

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                    synchronizedList.remove(10);
            }
        });
        thread1.start();
        thread.start();

        thread.join();
        thread1.join();

    }
}

