package java8.functionalinterfaces;

import java8.Buyer;
import java8.Seller;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Телевизор"));

        Function<Seller, Buyer> sellerToBuyer = x -> {
            List<String> collect = x.getProducts()
                    .stream()
                    .map(product -> "Куплю " + product)
                    .collect(Collectors.toList());
            return new Buyer(x.getName(), collect);
        };

        Buyer buyer = sellerToBuyer.apply(seller);
        System.out.println(buyer);
    }
}
