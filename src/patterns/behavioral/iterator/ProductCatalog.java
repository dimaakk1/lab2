package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private final List<String> products = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
    }

    public Iterator getIterator() {
        return new ProductIterator(products);
    }
}
