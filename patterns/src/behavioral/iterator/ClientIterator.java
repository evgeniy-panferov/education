package behavioral.iterator;

/*
Итератор - паттерн, который дает возможность последовательно обходить элементы составных объектов, не раскрывая их внутреннего представления.
Применяется в коллекциях, какой бы не была структура коллекции, пользователь должен последовательно обходить ее элементы, чтобы чтобы проделывать с ними
какие-то действия.
Идея состоит в том, чтобы поведение обхода коллекции вынести в отдельный класс.
 */

public class ClientIterator {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        Iterator iterator = peopleArray.getIterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
