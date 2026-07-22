package se.lexicon.model;

public abstract class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Product(int id, String name, int price, int quantity) {
        if (id < 0)
            throw new IllegalArgumentException("Id cannot be a negative number");
        this.id = id;

        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        this.name = name;

        if (price < 0)
            throw new IllegalArgumentException("Price cannot be a negative number");
        this.price = price;

        if (quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be a negative number");
        this.quantity = quantity;
    }

    public abstract String describeItem();
}
