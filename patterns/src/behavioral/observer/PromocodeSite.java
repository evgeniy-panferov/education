package behavioral.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PromocodeSite implements Observed {
    List<Promocode> promocodes = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addPromocode(Promocode... promocode) {
        this.promocodes.addAll(Arrays.asList(promocode));
        notifyObservers();
    }

    public void removePromocode(Promocode promocode) {
        this.promocodes.remove(promocode);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer... observer) {
        this.subscribers.addAll(Arrays.asList(observer));
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.promocodes);
        }
    }
}
