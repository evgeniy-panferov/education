package behavioral.visiter;

public class GamerVisitor implements Visitor {

    @Override
    public void visit(Game game) {
        System.out.println("Поиграл в игрушки");
    }

    @Override
    public void visit(CAD cad) {
        System.out.println("Не стал запускать САПР");
    }

    @Override
    public void visit(Program program) {
        System.out.println("Запустил игровые программы");
    }
}
