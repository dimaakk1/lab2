package patterns.structural.adapter;

public class ThirdPartyPayment {
    void sendPayment(double amount) {
        System.out.println("Оплата через сторонню систему: " + amount + " USD");
    }
}
