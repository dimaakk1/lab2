package patterns.structural.flyweight;

public class ProductFlyweight {
    private final String name;

    public ProductFlyweight(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Товар у кеші: " + name);
    }
}

