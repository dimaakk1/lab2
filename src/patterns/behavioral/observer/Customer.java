package patterns.behavioral.observer;

public class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " отримав повідомлення: " + message);
    }
}
