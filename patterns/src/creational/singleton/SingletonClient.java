package creational.singleton;

/*
Singleton - порождающий паттерн, который гарантирует создание только одного экземпляра класса.
 */

public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setValue("abc");
        System.out.println(singleton.getValue());
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.getValue());

        EnumSingleton.INSTANCE.setValue("enumSingleton");

        EnumSingleton[] values = EnumSingleton.values();
        for (EnumSingleton enumSingleton : values) {
            System.out.println(enumSingleton.getValue());
        }

    }
}
