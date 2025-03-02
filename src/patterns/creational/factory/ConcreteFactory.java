package patterns.creational.factory;

class ConcreteProductA implements Product {
    public void use() { System.out.println("Using Product A"); }
}

class ConcreteProductB implements Product {
    public void use() { System.out.println("Using Product B"); }
}