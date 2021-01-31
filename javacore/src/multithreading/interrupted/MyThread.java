package multithreading.interrupted;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MyThread implements Runnable{

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!Thread.currentThread().isInterrupted()){

            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
 class Program {

    public static void main(String[] args) {
        Executors.newCachedThreadPool(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        });
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread,"MyThread");
        t.start();
        try{
            Thread.sleep(150);
            t.interrupt();

            Thread.sleep(150);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}
