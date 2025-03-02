package patterns.creational.builder;

public class BuilderProduct {
    private String partA;
    private String partB;

    public BuilderProduct(String partA, String partB) {
        this.partA = partA;
        this.partB = partB;
    }

    public void use() {
        System.out.println("Builder Product built with: " + partA + " and " + partB);
    }
}