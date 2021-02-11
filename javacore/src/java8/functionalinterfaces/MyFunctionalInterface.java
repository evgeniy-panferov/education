package java8.functionalinterfaces;

import java8.Seller;

import java.util.Arrays;

public class MyFunctionalInterface {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));
        Printer printer = System.out::println;
        printer.print(seller);
    }
}
