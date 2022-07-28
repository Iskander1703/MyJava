package multiThread;

public class WaitNotifyEx {
    public static final Integer ABOBA=0;
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ABOBA){
                    try {
                        System.out.println("Thread 1 started");
                        Thread.sleep(1000);
                        ABOBA.wait(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread 1 ended");
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ABOBA){
                    try {
                        System.out.println("Thread 2 started");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread 2 ended");
//                    ABOBA.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
