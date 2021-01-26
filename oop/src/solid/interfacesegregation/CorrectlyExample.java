package solid.interfacesegregation;

/*
 Interface segregation - разбиение больших интерфейсов на маленькие, в классе имплементирующем не должно быть не используемых методов интерфейса.
 * */

public class CorrectlyExample {

    public interface Motion extends Ride, Fly, Swim {

    }

    public interface Ride {
        void ride();
        void brake();
    }

    public interface Fly {
        void fly();
        void brake();
    }

    public interface Swim {
        void swim();
        void brake();
    }


    public class Car implements Ride {

        @Override
        public void brake() {
            System.out.println("Машина тормозит");
        }

        @Override
        public void ride() {
            System.out.println("Машина движется");
        }
    }

    public class Airplane implements Fly, Ride {

        @Override
        public void ride() {
            System.out.println("Самолет ездит по взлетной полосе");
        }

        @Override
        public void fly() {
            System.out.println("Самолет летает в небе");
        }

        @Override
        public void brake() {
            System.out.println("Самолет снижается и останавливается");
        }
    }

    public class Vessel implements Swim {

        @Override
        public void swim() {
            System.out.println("Судно плавает");
        }

        @Override
        public void brake() {
            System.out.println("Судно останавливается и бросает якорь");
        }
    }

    public class Human implements Motion{

        @Override
        public void ride() {
            System.out.println("Человек может ездить на автомобиле");
        }

        @Override
        public void fly() {
            System.out.println("Человек может летать на самолете");
        }

        @Override
        public void swim() {
            System.out.println("Человек может плавать");
        }

        @Override
        public void brake() {
            System.out.println("Человек может останавливаться");
        }
    }

}
