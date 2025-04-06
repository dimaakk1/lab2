package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyCustomers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
