package structural.flyweight;

public class VAZ implements Car {
    Integer maxSpeed = 180;
    String name = "Lada";

    @Override
    public void move(String highway) {
        System.out.println(String.format("%s is moving on the %s at a speed %d", name, highway, maxSpeed));
    }
}
