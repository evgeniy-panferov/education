package behavioral.command;

public class MoveBackWard implements Command {
    private Car car;

    public MoveBackWard(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.moveBackWard();
    }
}
