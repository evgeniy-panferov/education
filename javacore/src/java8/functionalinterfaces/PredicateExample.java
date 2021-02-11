package java8.functionalinterfaces;

import java8.Seller;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Seller seller1 = new Seller("Лариса", Arrays.asList("Помада", "Духи", "Маска для лица", "Тональный крем"));
        Predicate<Seller> predicate = s -> s.getProducts().size() < 4;
        System.out.println(predicate.test(seller));
        System.out.println(predicate.test(seller1));
    }
}
