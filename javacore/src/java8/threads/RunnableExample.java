package java8.threads;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
