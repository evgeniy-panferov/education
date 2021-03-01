package behavioral.state;

public class Hobby implements Activity {

    @Override
    public void doSomething(Human human) {
        System.out.println("Время на хобби");
        human.setActivity(new Sleeping());
    }
}
