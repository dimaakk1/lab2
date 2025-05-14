package patterns.behavioral.strategy;

public class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Оплата Криптою " + amount);
    }
}
