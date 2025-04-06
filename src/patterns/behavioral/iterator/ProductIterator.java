package patterns.behavioral.iterator;

import java.util.List;

public class ProductIterator implements Iterator {
    private final List<String> products;
    private int index = 0;

    public ProductIterator(List<String> products) {
        this.products = products;
    }

    public boolean hasNext() {
        return index < products.size();
    }

    public String next() {
        return hasNext() ? products.get(index++) : null;
    }
}
