package multithreading.reentrantlock;


public class CountRunnerInterrupt implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("I working");
        }
    }
}
