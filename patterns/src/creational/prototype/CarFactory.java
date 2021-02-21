package creational.prototype;

public class CarFactory {
    private Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public void setPrototype(Car car) {
        this.car = car;
    }

    Car makeCopy() {
        return (Car) car.clone();
    }
}
