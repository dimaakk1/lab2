package patterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Оплата карткою: " + amount + " USD");
    }
}