package java8.functionalinterfaces;

import java8.Seller;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Supplier<String> supplier = seller::getName;
        System.out.println(supplier.get());
    }
}
