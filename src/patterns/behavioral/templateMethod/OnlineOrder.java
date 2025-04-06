package patterns.behavioral.templateMethod;

public class OnlineOrder extends OrderProcessor {
    void selectProduct() {
        System.out.println("Вибір продукту онлайн");
    }
    void makePayment() {
        System.out.println("Оплата карткою онлайн");
    }
    void deliver() {
        System.out.println("Доставка до дому");
    }
}
