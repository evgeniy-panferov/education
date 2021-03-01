package behavioral.strategy;

public class Cooking implements Working {
    @Override
    public void work() {
        System.out.println("Готовит");
    }
}
