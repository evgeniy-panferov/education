package encapsulation;

public class Main {
    public static void main(String[] args) {
        VehicleLand car = new Car();
        VehicleLand bike = new Motorcycle();

        bike.setName("Harley");
        car.setName("Skoda");
        System.out.println(car.getName());
        System.out.println(bike.getName());

        car.move();
        bike.move();
        car.brake();
        bike.brake();

    }
}
