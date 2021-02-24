package behavioral.visiter;

/*
Посетитель - поведенческий паттерн, который позволяет добавлять в программу новые операции, не изменяя классов объектов,
 над которыми эти операции будут выполняться.
 */
public class ComputerRunner {
    public static void main(String[] args) {
        Program program = new ProgramElement();
        Visitor visitorEngineer = new EngineerVisitor();

        program.accept(visitorEngineer);
    }
}
