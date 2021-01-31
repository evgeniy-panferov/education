package multithreading.uncaughtexceptionhandler;

public class TestThread implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException();

    }
}
