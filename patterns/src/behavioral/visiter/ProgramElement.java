package behavioral.visiter;

public class ProgramElement implements Program {
    private Program[] programs;

    public ProgramElement() {
        this.programs = new Program[]{new CAD(), new Game()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Program program : programs) {
            program.accept(visitor);
        }
        visitor.visit(this);
    }
}
