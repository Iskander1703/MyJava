import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class OneToMillionSum {
    public static final Long million = 1_000_000L;
    public static Long sum = 0L;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Long oneOfTenMillion = million / 10;
        List<Future<Long>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Long from = oneOfTenMillion * i + 1;
            Long to = oneOfTenMillion * (i + 1);
            futureList.add(executorService.submit(new PartSum(from, to)));
        }

        for (Future<Long> a : futureList) {
            sum += a.get();
        }
        executorService.shutdown();

        System.out.println("Total sum = " + sum);
    }
}

class PartSum implements Callable<Long> {
    Long from;
    Long to;
    Long partSum;

    public PartSum(Long from, Long to) {
        this.from = from;
        this.to = to;
        this.partSum = 0L;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            partSum += i;
        }

        System.out.println("Part Sum from: " + from + " to: " + to + " = " + partSum);
        return partSum;
    }
}


