package java8.optional;

import java8.Seller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalExample {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Seller seller1 = new Seller("Петя", Arrays.asList("Телефон1", "Утюг1", "Телевизор1"));
        List<Seller> sellers = Arrays.asList(seller, seller1);


        Optional<Seller> first = sellers
                .stream()
                .findFirst();

        Function<Seller, String> function = Seller::getName;
        Optional<String> s = first.map(function);
        System.out.println(s.get());

        Consumer<Seller> consumer = System.out::println;
        first.ifPresent(consumer);
    }
}
