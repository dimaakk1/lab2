package patterns.structural.facade;

public class OnlineStore {
    private final Warehouse warehouse = new Warehouse();
    private final PaymentSystem paymentSystem = new PaymentSystem();

    public void purchaseItem(String item, double price) {
        warehouse.checkStock(item);
        paymentSystem.processPayment(price);
        System.out.println("Замовлення оформлено");
    }
}
