package java8.streams;

import java8.Seller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Утюг", "Телевизор"));

        List<String> collect = seller.getProducts()
                .stream()
                .filter(x -> x.length() > 4)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
