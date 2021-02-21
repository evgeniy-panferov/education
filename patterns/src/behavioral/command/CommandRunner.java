package behavioral.command;
/*
Команда - поведенческий паттерн, который позволяет нам превращать вызовы метода в объекты и передавать их как аргументы.
 */

public class CommandRunner {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver(new MoveForward(car), new MoveBackWard(car), new Stop(car));
        driver.moveForwardCar();
        driver.moveBackWardCar();
        driver.stopCar();
    }
}
