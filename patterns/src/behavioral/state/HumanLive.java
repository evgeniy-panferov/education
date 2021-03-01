package behavioral.state;
/*
State(состояние) - поведенческий паттерн, который позволяет динамически изменять поведение объекта при смене его состояния.
Обеспечивает изменение поведения объекта во время выполнения.
 */
public class HumanLive {
    public static void main(String[] args) {
        Sleeping sleeping = new Sleeping();
        Human human = new Human();
        human.setActivity(sleeping);

        for (int i = 0; i < 30; i++) {
            human.doSomething();
        }
    }
}
