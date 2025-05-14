package patterns.behavioral.strategy;

public class UniversalCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " USD");
    }
}
