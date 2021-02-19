package structural.facade;


/*
Паттерн фасад - структурный паттерн, который позволяет скрыть сложность системы путем сведения всех вызовов к одному объекту,
делегирующий их другим объектам системы.
 */
public class DiggerApp {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.letsDig();
    }
}
