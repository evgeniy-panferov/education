package multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class CounterRunner implements Runnable {
    Resource resource;

    public CounterRunner(Resource resource, ReentrantLock reentrantLock){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            resource.countI();
        }
        for (int i = 0; i < 1000000; i++) {
            resource.countJ();
        }
    }
}
