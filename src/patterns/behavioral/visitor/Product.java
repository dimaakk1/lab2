package patterns.behavioral.visitor;

public class Product implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
