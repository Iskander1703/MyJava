import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ " started");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i<20;i++){
            executorService.submit(new Taska());
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(5, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+ " ended");
    }


}

class Taska implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
