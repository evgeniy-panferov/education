package java8.streams;

import java8.Seller;

import java.util.Arrays;
import java.util.List;

public class CreateStream {
    public static void main(String[] args) {
        //https://habr.com/ru/company/luxoft/blog/270383/
        Arrays.asList("Вася", "Таня", "Настя").stream();// Создали stream из коллекции
        String[] names = {"Толя", "Алина", "Маша"};
        Arrays.stream(names);// создали stream из массива

        Seller seller = new Seller("Иван", Arrays.asList("Телефон", "Утюг", "Утюг", "Телевизор"));
        Seller seller1 = new Seller("Петя", Arrays.asList("Масло", "Бензин", "ДТ"));
        List<Seller> sellers = Arrays.asList(seller, seller1);


    }
}
