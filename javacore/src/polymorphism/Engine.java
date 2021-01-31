package polymorphism;

public class Engine implements Action{
    @Override
    public void start() {
        System.out.println("Заводится");
    }

    @Override
    public void stop() { System.out.println("Глохнет"); }
}
