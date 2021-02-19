package behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<Promocode> promocodes) {
        System.out.println(name + " We have some changes in promocodes" + promocodes);
    }
}
