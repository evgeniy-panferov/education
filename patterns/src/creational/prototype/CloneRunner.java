package creational.prototype;

/*
Prototype - порождающий паттерн, который позволяет создавать клоны объектов, есть стандартная реализация в JDK интерфейс Cloneable.
 */
public class CloneRunner {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "200");
        Car cloneCar = (Car) car.clone();
        System.out.println(car);
        System.out.println(cloneCar);
        CarFactory carFactory = new CarFactory(car);
        Car toyotaClone = carFactory.makeCopy();
        System.out.println(toyotaClone);

        carFactory.setPrototype(new Car("Volkswagen", "250"));
        Car VWClone = carFactory.makeCopy();
        System.out.println(VWClone);
    }
}
