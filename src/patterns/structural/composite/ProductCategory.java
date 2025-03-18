package patterns.structural.composite;
import java.util.ArrayList;
import java.util.List;

public class ProductCategory implements Product {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void showDetails() {
        for (Product product : products) {
            product.showDetails();
        }
    }
}
