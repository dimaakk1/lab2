package patterns.behavioral.templateMethod;

public abstract class OrderProcessor {
    public final void processOrder() {
        selectProduct();
        makePayment();
        deliver();
    }

    abstract void selectProduct();
    abstract void makePayment();
    abstract void deliver();
}