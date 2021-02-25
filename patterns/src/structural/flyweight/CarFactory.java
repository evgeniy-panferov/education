package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private Map<String, Car> carMap = new HashMap<>();

    public Car getCar(String carName) {
        Car car = carMap.get(carName);
        if (car == null) {
            switch (carName) {
                case "BMW":
                    car = new BMW();
                    break;
                case "Skoda":
                    car = new Skoda();
                    break;
                case "Lada":
                    car = new VAZ();
                    break;
            }
            carMap.put(carName, car);
        }
        return car;
    }
}
