package java8;

import java.util.List;

public class Buyer {
    private String name;
    private List<String> products;

    public Buyer(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public Buyer(List<String> products) {
        this.products = products;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
