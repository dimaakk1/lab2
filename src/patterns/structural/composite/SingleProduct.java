package patterns.structural.composite;

public class SingleProduct implements Product {
    private final String name;

    public SingleProduct(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Товар: " + name);
    }
}

