package behavioral.command;

public class Stop implements Command {
    private Car car;

    public Stop(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }
}
