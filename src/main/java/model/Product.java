package model;

public class Product {
    private String name;

    private double CostInCents;

    public Product(String name, double costInCents) {
        this.name = name;
        CostInCents = costInCents;
    }

    public String getName() {
        return name;
    }

    public double getCostInCents() {
        return CostInCents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostInCents(int costInCents) {
        CostInCents = costInCents;
    }
}
