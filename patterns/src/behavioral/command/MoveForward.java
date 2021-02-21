package behavioral.command;

public class MoveForward implements Command {
    private Car car;

    public MoveForward(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.moveForward();
    }
}
