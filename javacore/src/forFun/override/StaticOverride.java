package forFun.override;

public class StaticOverride {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A.run();
    }
}
