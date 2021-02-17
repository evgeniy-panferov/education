package multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        ReentrantLock reentrantLock = new ReentrantLock();
        CounterRunner counter = new CounterRunner(resource, reentrantLock);
        CountRunnerInterrupt countRunnerInterrupt = new CountRunnerInterrupt();
        Thread thread = new Thread(counter);
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(countRunnerInterrupt);
        thread.start();
        thread1.start();
        thread2.start();
        thread.join();
        thread1.join();
        System.out.println(resource.getI());
        System.out.println(resource.getJ());
        thread2.interrupt();
    }
}


