package java8.streams;

import java8.Seller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Seller seller1 = new Seller("Петя", Arrays.asList("Масло", "Бензин", "ДТ"));
        List<Seller> sellers = Arrays.asList(seller, seller1);

        List<String> map = sellers.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());

        List<String> flatMap = sellers.stream()
                .flatMap(s -> s.getProducts().stream())
                .collect(Collectors.toList());

        System.out.println(map);
        System.out.println(flatMap);
    }

}
