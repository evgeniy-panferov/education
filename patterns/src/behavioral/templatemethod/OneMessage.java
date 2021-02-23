package behavioral.templatemethod;

public class OneMessage extends Message {
    @Override
    protected void differentMessage() {
        System.out.println("How are you?");
    }

    @Override
    protected void anotherMessage() {
    }
}
