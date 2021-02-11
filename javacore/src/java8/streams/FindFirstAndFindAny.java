package java8.streams;

import java8.Seller;

import java.util.Arrays;
import java.util.Optional;

public class FindFirstAndFindAny {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Optional<String> first = seller.getProducts()
                .stream()
                .findFirst();
        Optional<String> any = seller.getProducts()
                .stream()
                .findAny();

        System.out.println(first.get());
        System.out.println(any.get());
    }
}
