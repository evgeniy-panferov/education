package behavioral.templatemethod;

/*
Шаблонный метод - поведенческий паттерн, в котором мы прописываем методы с одинаковым функционалом, и если функционал разнится,
 то выносим в абстрактный метод, где в классах наследниках уже реализовываем нам нужный функционал.
 */
public class MessageRunner {
    public static void main(String[] args) {
        Message oneMessage = new OneMessage();
        Message secondMessage = new SecondMessage();
        oneMessage.sendMessage();
        secondMessage.sendMessage();
    }
}
