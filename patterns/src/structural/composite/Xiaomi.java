package structural.composite;

public class Xiaomi implements Product {

    private Integer price;

    public Xiaomi(Integer price) {
        this.price = price;
    }

    @Override
    public Integer price() {
        return price;
    }
}
