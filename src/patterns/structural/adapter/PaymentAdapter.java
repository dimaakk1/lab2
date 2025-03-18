package patterns.structural.adapter;

public class PaymentAdapter implements PaymentGateway {
    private final ThirdPartyPayment thirdPartyPayment;

    public PaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
        this.thirdPartyPayment = thirdPartyPayment;
    }

    public void pay(double amount) {
        thirdPartyPayment.sendPayment(amount);
    }
}
