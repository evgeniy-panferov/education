package behavioral.visiter;

public class EngineerVisitor implements Visitor {

    @Override
    public void visit(Game game) {
        System.out.println("Прошел мимо");
    }

    @Override
    public void visit(CAD cad) {
        System.out.println("Спроектировал новое оборудование");
    }

    @Override
    public void visit(Program program) {
        System.out.println("Запустил инженерные программы");
    }
}
