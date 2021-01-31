package abstraction;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.setColor("Red");
        triangle.setColor("Blue");
        circle.setRadius(5);
        triangle.setA(3);
        triangle.setB(6);
        triangle.setC(7);

        System.out.print(circle.getColor() + " ");
        circle.perimeter();
        System.out.print(triangle.getColor() + " ");
        triangle.perimeter();
    }
}
