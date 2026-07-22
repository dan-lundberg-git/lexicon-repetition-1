package se.lexicon.model;

public class Snack extends Product {
    private final int weight;

    public Snack(int id, String name, int price, int quantity, int weight) {
        super(id, name, price, quantity);

        if (weight < 0)
            throw new IllegalArgumentException("Weight cannot be a negative number");
        this.weight = weight;
    }

    @Override
    public String describeItem() {
        return "(" + this.getClass().getSimpleName() + ", " + weight + "g)";
    }
}
