package patterns.structural.bridge;

public class ExpressDelivery implements DeliveryService {
    public void deliver(String item) {
        System.out.println("Експрес-доставка: " + item);
    }
}
