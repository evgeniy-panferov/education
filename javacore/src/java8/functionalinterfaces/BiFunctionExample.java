package java8.functionalinterfaces;

import java8.Buyer;
import java8.Seller;

import java.util.Arrays;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        Seller sellerIvan = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Seller sellerPetya = new Seller("Петя", Arrays.asList("Масло", "Антифриз", "Бензин"));
        Buyer buyerNastya = new Buyer("Настя", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        BiFunction<Buyer, Seller, String> function = (s, b) -> {
            if (s.getProducts().equals(b.getProducts())) {
                return "Покупатель найден";
            }
            return "Покупатель не найден";
        };
        System.out.println(function.apply(buyerNastya, sellerIvan));
        System.out.println(function.apply(buyerNastya, sellerPetya));
    }
}
