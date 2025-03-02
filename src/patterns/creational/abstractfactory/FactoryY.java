package patterns.creational.abstractfactory;

class FactoryY implements AbstractFactory {
    public AbstractProduct createProduct() { return new ProductY(); }
}
