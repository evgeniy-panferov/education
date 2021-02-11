package java8.streams;

import java8.Seller;

import java.util.Arrays;

public class AnyMatchAndAllMatch {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        boolean a = seller.getProducts()
                .stream()
                .anyMatch(x -> x.length() > 3);
        boolean b = seller.getProducts()
                .stream()
                .allMatch(x -> x.length() > 6);

        boolean c = seller.getProducts()
                .stream()
                .anyMatch(x -> x.length() > 6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
