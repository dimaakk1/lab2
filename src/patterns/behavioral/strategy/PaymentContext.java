package patterns.behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            System.out.println("Спосіб оплати не встановлено!");
            return;
        }
        strategy.pay(amount);
    }
}
