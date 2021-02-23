package behavioral.templatemethod;

public abstract class Message {

    public void sendMessage() {
        System.out.println("Hi!");
        differentMessage();
        anotherMessage();
        System.out.println("GoodBye!");
    }

    protected abstract void differentMessage();

    protected abstract void anotherMessage();
}
