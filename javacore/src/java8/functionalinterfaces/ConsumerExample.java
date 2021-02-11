package java8.functionalinterfaces;

import java8.Seller;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Seller seller1 = new Seller("Петя", Arrays.asList("Масло", "Бензин", "ДТ"));

        Consumer<Seller> consumer = s -> {
            System.out.println("--------------------");
            System.out.println("Торговец - " + s.getName());
            s.getProducts()
                    .forEach(System.out::println);
            System.out.println("--------------------");
        };

        consumer.accept(seller);
        consumer.accept(seller1);
    }
}
