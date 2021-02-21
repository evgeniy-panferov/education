package behavioral.command;

public class Driver {

    private Command moveForward;
    private Command moveBackWard;
    private Command stop;

    public Driver(Command moveForward, Command moveBackWard, Command stop) {
        this.moveForward = moveForward;
        this.moveBackWard = moveBackWard;
        this.stop = stop;
    }

    public void moveForwardCar() {
        moveForward.execute();
    }

    public void moveBackWardCar() {
        moveBackWard.execute();
    }

    public void stopCar() {
        stop.execute();
    }
}
