package se.lexicon.model;

public class Fruit extends Product {
    private final String origin;

    public Fruit(int id, String name, int price, int quantity, String origin) {
        super(id, name, price, quantity);

        if (origin == null || origin.trim().isEmpty())
            throw new IllegalArgumentException("Origin cannot be null or empty");
        this.origin = origin;
    }

    @Override
    public String describeItem() {
        return "(" + this.getClass().getSimpleName() + ", " + origin + ")";
    }
}
