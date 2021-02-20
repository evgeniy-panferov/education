package creational.builder;
/*
Билдер - порождающий паттерн, который помогает нам избавиться от длинных конструкторов и создавать объект пошагово.
 */


public class CraneBuilderRunner {
    public static void main(String[] args) {
        Crane crane = new Crane.CraneBuilder("Water-ship crane")
                .setBoomReach(40)
                .setLiftingCapacity(5)
                .buildCrane();
        System.out.println(String.format("%s, which have boom reach %o meters and lifting capacity %o tons",
                crane.getTypeCrane(), crane.getBoomReach(), crane.getLiftingCapacity()));
    }
}
