package patterns.creational.prototype;

public class Prototype implements Cloneable {
    private String data;

    public Prototype(String data) {
        this.data = data;
    }

    public Prototype clone() {
        return new Prototype(this.data);
    }

    public void show() {
        System.out.println("Prototype with data: " + data);
    }
}
