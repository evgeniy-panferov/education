package structural.facade;

public class Refuel {
    private boolean fuel = false;

    public boolean hasFuel() {
        return fuel;
    }

    protected void fillTheTank() {
        fuel = true;
    }

    protected void emptyTheTank() {
        fuel = false;
    }

}
