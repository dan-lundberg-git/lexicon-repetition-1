package se.lexicon.model;

public class Beverage extends Product {
    private final int volume;

    public Beverage(int id, String name, int price, int quantity, int volume) {
        super(id, name, price, quantity);

        if (volume < 0)
            throw new IllegalArgumentException("Volume cannot be a negative number");
        this.volume = volume;
    }

    @Override
    public String describeItem() {
        return "(" + this.getClass().getSimpleName() + ", " + volume + "ml)";
    }
}
