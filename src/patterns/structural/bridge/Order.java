package patterns.structural.bridge;

public class Order {
    protected DeliveryService deliveryService;

    public Order(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void processOrder(String item) {
        deliveryService.deliver(item);
    }
}
