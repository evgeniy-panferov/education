package inheritance;

public class Main {
    public static void main(String[] args) {
        VehicleLand car = new Car();
        VehicleLand bike = new Motorcycle();

        car.move();
        bike.move();
        car.brake();
        bike.brake();
    }
}
