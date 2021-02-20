package structural.composite;

/*
Паттерн компоновщик - позволяет сгруппировать множество объектов в древовидную структуру и работать с ними как с одним объектом.
 */
public class CompositeApp {
    public static void main(String[] args) {
        Iphone iphone4 = new Iphone(10000);
        Iphone iphone21 = new Iphone(100000);
        Xiaomi mi5 = new Xiaomi(5000);
        Xiaomi miBiDiRedmiSuperPuperZoom1 = new Xiaomi(89000);
        Realme x3SuperZoom = new Realme(20000);

        Composite composite = new Composite();
        composite.addProduct(iphone4, iphone21);

        Composite composite1 = new Composite();
        composite1.addProduct(mi5, miBiDiRedmiSuperPuperZoom1, x3SuperZoom);
        composite1.addProduct(composite);
        composite1.price();
        composite1.printSum();
    }
}
