package structural.facade;

public class Facade {
    private Tractor tractor = new Tractor();
    private Driver driver = new Driver();
    private Refuel refuel = new Refuel();

    public void letsDig() {
        driver.ready();
        refuel.fillTheTank();
        tractor.digging(refuel);
    }
}
