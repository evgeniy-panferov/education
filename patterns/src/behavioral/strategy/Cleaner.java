package behavioral.strategy;

public class Cleaner implements Working {
    @Override
    public void work() {
        System.out.println("Убирается");
    }
}
