package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private final Map<String, ProductFlyweight> productCache = new HashMap<>();

    public ProductFlyweight getProduct(String name) {
        return productCache.computeIfAbsent(name, ProductFlyweight::new);
    }
}
