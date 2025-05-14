package patterns.lab6.factory;

import java.util.Map;
import java.util.function.Supplier;

public class Factory {
    private static final Map<String, Supplier<Product>> registry = Map.of(
            "A", () -> () -> System.out.println("Using Product A"),
            "B", () -> () -> System.out.println("Using Product B")
    );

    public static Product createProduct(String type) {
        Supplier<Product> supplier = registry.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("Unknown product type");
        }
        return supplier.get();
    }
}
