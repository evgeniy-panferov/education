package behavioral.strategy;

public class Waiter implements Working {
    @Override
    public void work() {
        System.out.println("Обслуживает гостей");
    }
}
