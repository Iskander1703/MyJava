import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        Employee employee1 = new Employee("Iskander", lock);
        Employee employee2= new Employee("Vanya", lock);
        Employee employee3 = new Employee("Sanya P.", lock);
        Employee employee4 = new Employee("Sanya H.", lock);
        Employee employee5 = new Employee("Roma", lock);
        Employee employee6 = new Employee("Misha ", lock);
    }

}

class Employee extends Thread{
    String name;
    private Lock lock;

    public  Employee(String name, Lock lock){
        this.name=name;
        this.lock=lock;
        this.start();
    }

    public void run(){
        System.out.println(name+" ждет...");
        lock.lock();
        System.out.println(name+" пользуется банкоматом...");
        try {
            Thread.sleep(2000);
            System.out.println(name+" завершил свой дела...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
