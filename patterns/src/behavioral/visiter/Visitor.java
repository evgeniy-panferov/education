package behavioral.visiter;

public interface Visitor {
    void visit(Game game);

    void visit(CAD cad);

    void visit(Program program);
}
