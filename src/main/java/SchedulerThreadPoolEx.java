import java.util.concurrent.*;

public class SchedulerThreadPoolEx {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        //C методом execute() работает точно так же как и ThreadPool
//        for (int i=0;i<20;i++){
//            executorService.execute(new Taska2());
//        }

//        C методом schedule() 2 параметр время спустя которое начнется работа потоков.
//        for (int i=0;i<20;i++){
//            executorService.schedule(new Taska2(), 3, TimeUnit.SECONDS);
//        }

        // метод scheduleAtFixedThread() выполняет одну и ту же задачу. 2 параметр спустя какое
        //время, 3 параметр, периодичность (входит во время работы программы)
//            executorService.scheduleAtFixedRate(new Taska2(), 3,1, TimeUnit.MILLISECONDS);

        // метод scheduleWithFixedDelay() выполняет одну и ту же задачу. 2 параметр спустя какое
        //время, 3 параметр, периодичность (не входит во время работы программы
//        executorService.scheduleWithFixedDelay(new Taska2(), 10000, 2, TimeUnit.MILLISECONDS);
//        Thread.sleep(20000);
//
//        executorService.shutdown();

        //Создает новые потоки по надобности и удаляет ненужны потоки без надобности
        ExecutorService executorService1 = Executors.newCachedThreadPool();

        for (int i=0;i<10;i++){
            executorService1.execute(new Taska2());
        }

        executorService1.shutdown();


    }

}

class Taska2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
