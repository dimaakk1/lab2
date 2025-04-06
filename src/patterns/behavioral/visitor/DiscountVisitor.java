package patterns.behavioral.visitor;

public class DiscountVisitor implements Visitor {
    public void visit(Product product) {
        System.out.println("Застосування знижки до товару");
    }
}
