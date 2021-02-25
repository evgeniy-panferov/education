package behavioral.mediator;

/*
Медиатор - поведенческий паттерн, который выступает в качестве посредника в общении между различными модулями,
инкапсулируя их взаимодействие. Предотвращает прямое воздействие различных компонентов между собой.

 */
public class ChatRunner {

    public static void main(String[] args) {
        SimpleChat simpleChat = new SimpleChat();

        User admin = new Admin(simpleChat, "Admin");
        User alex = new SimpleUser(simpleChat, "Alex");
        User peter = new SimpleUser(simpleChat, "Peter");

        simpleChat.setAdmin(admin);
        simpleChat.addUser(alex);
        simpleChat.addUser(peter);

        alex.sendMessage("from Alex");
        System.out.println("----------------------------------------------------------");
        admin.sendMessage("from Admin");
    }
}
