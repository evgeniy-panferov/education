package behavioral.state;

public class Work implements Activity {

    @Override
    public void doSomething(Human human) {
        System.out.println("Работает");
        human.setActivity(new Hobby());
    }
}
