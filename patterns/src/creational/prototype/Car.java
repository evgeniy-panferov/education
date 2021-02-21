package creational.prototype;

public class Car implements Copyable {
    private String name;
    private String maxSpeed;

    public Car(String name, String maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Object clone() {
        return new Car(name, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
