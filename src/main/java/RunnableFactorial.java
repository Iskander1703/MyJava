import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    public static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Factorial factorial=new Factorial(11 );
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);

        System.out.println(RunnableFactorial.factorialResult);

    }
}

class Factorial implements Runnable{
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f<0){
            System.out.println("Вы ввели неверное число");
            return;
        }

        int result = 1;

        for (int i=1;i<=f;i++){
            result*=i;
        }

        RunnableFactorial.factorialResult=result;
    }
}
