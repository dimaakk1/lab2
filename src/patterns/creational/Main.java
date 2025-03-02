package patterns.creational;

import patterns.creational.singleton.*;
import patterns.creational.factory.*;
import patterns.creational.abstractfactory.*;
import patterns.creational.builder.*;
import patterns.creational.prototype.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton instances are the same: " + (singleton1 == singleton2));

        // Factory Method
        Product productA = Factory.createProduct("A");
        productA.use();

        // Abstract Factory
        AbstractFactory factoryX = new FactoryX();
        AbstractProduct productX = factoryX.createProduct();
        System.out.println("Abstract Factory created: " + productX.getClass().getSimpleName());

        // Builder
        BuilderProduct productBuilt = new ProductBuilder()
                .setPartA("A1")
                .setPartB("B1")
                .build();
        productBuilt.use();

        // Prototype
        Prototype prototype1 = new Prototype("Data1");
        Prototype prototype2 = prototype1.clone();
        prototype1.show();
        prototype2.show();

       }
}
