package structural.facade;

public class Tractor {

    protected void digging(Refuel refuel) {
        if (refuel.hasFuel()) {
            System.out.println("Digging a hole");
        } else {
            System.out.println("Tractor can't digger, his tank is empty");
        }
    }
}
