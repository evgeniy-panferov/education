package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat {
    private List<User> users = new ArrayList<>();
    private User admin;

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
