package patterns.structural.decorator;

public class OrderWithGiftWrap implements OrderProcessor {
    private final OrderProcessor order;

    public OrderWithGiftWrap(OrderProcessor order) {
        this.order = order;
    }

    public void process() {
        order.process();
        System.out.println("Додано подарункове пакування");
    }
}
