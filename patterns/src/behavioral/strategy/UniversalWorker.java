package behavioral.strategy;

public class UniversalWorker {

    private Working working;

    public void setWorking(Working working) {
        this.working = working;
    }

    public void work() {
        working.work();
    }
}
