package abstraction;

public class Circle extends Shape {

    private int radius;

    @Override
    public void perimeter() {
        System.out.println(radius * 2 * Math.PI);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
