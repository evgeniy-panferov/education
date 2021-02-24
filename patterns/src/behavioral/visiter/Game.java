package behavioral.visiter;

public class Game implements Program {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
