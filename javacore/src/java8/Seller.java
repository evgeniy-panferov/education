package java8;

import java.util.List;

public class Seller {
    private String name;
    private List<String> products;

    public Seller(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public Seller(List<String> products) {
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
