package patterns.creational.builder;

public class Builder {
    private String partA;
    private String partB;

    public Builder setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public Builder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public BuilderProduct build() {
        return new BuilderProduct(partA, partB);
    }
}
