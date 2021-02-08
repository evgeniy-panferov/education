package creational.singleton;

public class Singleton {

    private static Singleton singleton;
    private String value;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
