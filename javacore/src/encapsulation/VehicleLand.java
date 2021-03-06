package encapsulation;

/*
 Инкапсуляция.
 Основой инкапсуляции является класс.
 Механизм языка, позволяющий ограничить доступ одних компонентов программы к другим.
 Языковая конструкция, позволяющая связать данные с методами, предназначенные для обработки данных.
 Позволяет объединить данные и методы для работы с этими данными, а также скрыть реализацию от пользователя.
 Примеры инкапсуляции это геттеры и сеттеры, доступ к api.
 Мы сами решаем, какие данные будут открыты пользователю, в геттерах и сеттерах, можем задать ограничения на передаваемые и возвращаемые значения.
 */

public class VehicleLand {

    private String name;

    public void move() {
        System.out.println("moving");
    }

    public void brake() {
        System.out.println("stopping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
