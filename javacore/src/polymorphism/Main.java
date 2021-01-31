package polymorphism;


public class Main {
    public static void main(String[] args) {
      Action PC = new PC();
      Action engine = new Engine();

        PC.start();
        engine.start();
        PC.stop();
        engine.stop();
    }
}
