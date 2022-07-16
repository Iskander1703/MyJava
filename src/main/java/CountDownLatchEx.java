import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch=new CountDownLatch(3);

    public static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Персонал пришел на работу.");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = "+countDownLatch.getCount());
    }

    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Все готово к Черной Пятнице.");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = "+countDownLatch.getCount());
    }

    public static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Гипермаркет готов к открытию");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = "+countDownLatch.getCount());
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Iskander", countDownLatch);
        new Friend("Sanya P.", countDownLatch);
        new Friend("Sanya H.", countDownLatch);
        new Friend("Misha", countDownLatch);
        new Friend("Kostya", countDownLatch);
        new Friend("Maxim", countDownLatch);
        new Friend("Roma", countDownLatch);
        new Friend("Vanya", countDownLatch);
        new Friend("Dima", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name+ " зашел(а) в гипермаркет и смотрит что бы такое купить...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
