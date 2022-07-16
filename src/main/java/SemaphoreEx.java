import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new Person("Iskander", callBox));
        executorService.submit(new Person("Sanya P.", callBox));
        executorService.submit(new Person("Sanya H.", callBox));
        executorService.submit(new Person("Vanya", callBox));
        executorService.submit(new Person("Roma", callBox));
        executorService.submit(new Person("Dima", callBox));
        executorService.submit(new Person("Misha", callBox));
        executorService.submit(new Person("Kostya", callBox));
        executorService.submit(new Person("Maxim", callBox));
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            Thread.sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}
