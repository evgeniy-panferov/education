package behavioral.strategy;

/*
Стратегия (strategy) - поведенческий паттерн, предназначен для определения семейства алгоритмов, инкапсуляции каждого из них и обеспечения их взаимозаменяемости.
Позволяет подменять алгоритм во время работы.
 */
public class Restaurant {
    public static void main(String[] args) {
        UniversalWorker worker = new UniversalWorker();

        worker.setWorking(new Cooking());
        worker.work();

        worker.setWorking(new Cleaner());
        worker.work();

        worker.setWorking(new Waiter());
        worker.work();
    }
}
