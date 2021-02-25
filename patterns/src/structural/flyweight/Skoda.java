package structural.flyweight;

public class Skoda implements Car {
    Integer maxSpeed = 220;
    String name = "Skoda";

    @Override
    public void move(String highway) {
        System.out.println(String.format("%s is moving on the %s at a speed %d", name, highway, maxSpeed));
    }
}
