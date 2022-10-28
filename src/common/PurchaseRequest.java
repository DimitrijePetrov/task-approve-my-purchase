package common;

public class PurchaseRequest {
    private int id;
    private double cost;
    private Type type;

    public PurchaseRequest(int id, double cost, Type type) {
        this.id = id;
        this.cost = cost;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public Type getType() {
        return type;
    }
}
