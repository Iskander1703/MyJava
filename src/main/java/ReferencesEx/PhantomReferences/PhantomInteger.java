package ReferencesEx.PhantomReferences;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomInteger extends PhantomReference<Integer> {
   PhantomInteger(Integer referent, ReferenceQueue<? super Integer> queue)
        {
            super(referent, queue);
        }

        public void close()
        {
            System.out.println("Bad Integer totally destroyed!");
        }

}
