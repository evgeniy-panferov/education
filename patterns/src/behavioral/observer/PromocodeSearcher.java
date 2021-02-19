package behavioral.observer;

public class PromocodeSearcher {

    public static void main(String[] args) {
        PromocodeSite promocodeSite = new PromocodeSite();

        Promocode pyaterochka = new Promocode("Пятерочка", "123");
        Promocode magnit = new Promocode("магнит", "123");
        Promocode redAndWhite = new Promocode("Красное и белое", "Пиво, водка, балалайка");

        promocodeSite.addPromocode(pyaterochka, magnit, redAndWhite);

        Subscriber vasya = new Subscriber("Вася");
        Subscriber petya = new Subscriber("Петя");
        Subscriber tolya = new Subscriber("Толя");

        promocodeSite.addObserver(vasya, petya, tolya);

        Promocode mcdonalds = new Promocode("Макдоналдс", "Супер бутерброд");
        promocodeSite.addPromocode(mcdonalds);
        promocodeSite.removePromocode(magnit);
    }
}
