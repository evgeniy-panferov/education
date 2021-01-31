package polymorphism;

public class PC implements Action{

    @Override
    public void start() {
        System.out.println("Включается");
    }

    @Override
    public void stop() {
        System.out.println("Выключается");
    }
}
