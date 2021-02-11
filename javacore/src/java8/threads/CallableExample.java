package java8.threads;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable task1 = () -> {
            String threadName = Thread.currentThread().getName();
            return threadName;
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> submit = executorService.submit(task1);
        System.out.println(submit.get());
        executorService.shutdown();
    }
}
