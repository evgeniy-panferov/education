package multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    ReentrantLock reentrantLock = new ReentrantLock();
    private int i = 0;
    private int j =0;

    public void countI() {
        reentrantLock.lock();
        i++;
    }

    public void countJ(){
        j++;
        reentrantLock.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
