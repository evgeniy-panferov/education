package structural.composite;

public class Iphone implements Product {

    private Integer price;

    public Iphone(Integer price) {
        this.price = price;
    }

    @Override
    public Integer price() {
        return price;
    }
}
