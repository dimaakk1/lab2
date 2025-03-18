package patterns.structural;
import patterns.structural.adapter.*;
import patterns.structural.bridge.*;
import patterns.structural.composite.*;
import patterns.structural.decorator.*;
import patterns.structural.facade.*;
import patterns.structural.flyweight.*;
import patterns.structural.proxy.*;

public class Main {
    public static void main(String[] args) {
        // Adapter - Оплата через сторонню систему
        PaymentGateway payment = new PaymentAdapter(new ThirdPartyPayment());
        payment.pay(100);

        // Bridge - Доставка
        Order order = new Order(new ExpressDelivery());
        order.processOrder("Ноутбук");

        // Composite - Каталог товарів
        ProductCategory category = new ProductCategory();
        category.add(new SingleProduct("Смартфон"));
        category.add(new SingleProduct("Навушники"));
        category.showDetails();

        // Decorator - Декорація замовлення
        OrderProcessor decoratedOrder = new OrderWithGiftWrap(new BasicOrder());
        decoratedOrder.process();

        // Facade - Магазин
        OnlineStore store = new OnlineStore();
        store.purchaseItem("Книга", 25.99);

        // Flyweight - Кешування товарів
        ProductFactory factory = new ProductFactory();
        ProductFlyweight p1 = factory.getProduct("Монітор");
        ProductFlyweight p2 = factory.getProduct("Монітор");
        p1.show();
        p2.show();

        // Proxy - Перевірка доступу
        StoreAccess proxy = new StoreProxy(false);
        proxy.enterStore();
    }
}
