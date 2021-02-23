package behavioral.templatemethod;

public class SecondMessage extends Message {
    @Override
    protected void differentMessage() {
        System.out.println("I'm glad to see you");
    }

    @Override
    protected void anotherMessage() {
        System.out.println("How are you?");
    }
}
