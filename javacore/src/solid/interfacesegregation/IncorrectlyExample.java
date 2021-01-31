package solid.interfacesegregation;

/*
 Interface segregation - разбиение больших интерфейсов на маленькие, в классе имплементирующем не должно быть не используемых методов интерфейса.
 * */

public class IncorrectlyExample {

    public interface Motion {
        void brake();
        void ride();
        void fly();
        void swim();
    }

    public class Car implements Motion {

        @Override
        public void brake(){
            System.out.println("Машина тормозит");
        }

        @Override
        public void ride(){
            System.out.println("Машина ездит");
        }

        @Override
        public void fly(){}

        @Override
        public void swim(){}
    }
    public class Airplane implements Motion {

        @Override
        public void brake(){
            System.out.println("Самолет садится и останавливается");
        }

        @Override
        public void ride(){}

        @Override
        public void fly(){
            System.out.println("Самолет летает");
        }

        @Override
        public void swim(){}
    }

    public class Vessel implements Motion {

        @Override
        public void brake(){
            System.out.println("Судно бросает якорь");
        }

        @Override
        public void ride(){}

        @Override
        public void fly(){}

        @Override
        public void swim(){
            System.out.println("Лодка плавает");
        }
    }

}
