package structural.composite;

public class Realme implements Product {

    private Integer price;

    public Realme(Integer price) {
        this.price = price;
    }

    @Override
    public Integer price() {
        return price;
    }
}
