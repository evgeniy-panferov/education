package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Product {
    private Integer sum;
    List<Product> products = new ArrayList<>();

    public void addProduct(Product... product) {
        products.addAll(Arrays.asList(product));
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public Integer price() {
        sum = 0;
        for (Product product : products) {
            sum += product.price();
        }
        return sum;
    }

    public void printSum() {
        System.out.println(sum);
    }
}
