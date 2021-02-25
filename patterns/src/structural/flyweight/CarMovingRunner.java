package structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
FlyWeight - структурный паттерн, который позволяет уменьшить количество объектов, путем совместного их использования.
Внутри таких объектов определено состояние, которое не меняется. Позволяет экономить память.
 */

public class CarMovingRunner {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        CarFactory carFactory = new CarFactory();

        cars.add(carFactory.getCar("BMW"));
        cars.add(carFactory.getCar("Skoda"));
        cars.add(carFactory.getCar("Lada"));

        List<String> autobahn = new ArrayList<>();
        autobahn.add("Germany");
        autobahn.add("Russian");
        autobahn.add("Ukraine");

        for (Car car : cars) {
            car.move(autobahn.get(new Random().nextInt(autobahn.size())));
        }

    }
}
