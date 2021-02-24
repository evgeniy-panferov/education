package behavioral.visiter;

public class CAD implements Program {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
