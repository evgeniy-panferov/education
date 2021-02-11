package java8.streams;

import java8.Seller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndDistinct {
    public static void main(String[] args) {

        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Утюг", "Телевизор"));

        List<String> collect = seller.getProducts()
                .stream()
                .sorted((p1, p2) -> p1.length() > p2.length() ? 1 : -1)
                .collect(Collectors.toList());

        List<String> collect1 = seller.getProducts()
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);
    }
}
