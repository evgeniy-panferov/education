package abstraction;

/*
Абстрактный класс создается для определения некоторых общих черт производных от него классов, которые определяют конкретную его реализацию.
Объект абстрактного класса нельзя создать.
Данный класс имеет конструктор.
 */

public abstract class Shape {

    protected String color;

    public abstract void perimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
