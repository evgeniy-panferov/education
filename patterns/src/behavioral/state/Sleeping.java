package behavioral.state;

public class Sleeping implements Activity {
    @Override
    public void doSomething(Human human) {
        System.out.println("Спит");
        human.setActivity(new Work());
    }
}
