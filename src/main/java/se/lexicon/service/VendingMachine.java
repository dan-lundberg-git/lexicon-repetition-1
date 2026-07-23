package se.lexicon.service;

import se.lexicon.model.Beverage;
import se.lexicon.model.Fruit;
import se.lexicon.model.Product;
import se.lexicon.model.Snack;
import se.lexicon.validator.Coin;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Product> products;
    private int balance;

    public VendingMachine() {
        products = new ArrayList<>();
        products.add(new Fruit(1, "Banana", 15, 5, "Brazil"));
        products.add(new Beverage(2, "Sparkling Water", 20, 3, 330));
        products.add(new Snack(3, "Chocolate", 30, 2, 200));
        products.add(new Beverage(4, "Fanta", 20, 1, 330));
        products.add(new Snack(5, "Chips", 35, 4, 220));
        balance = 0;
    }

    public void insertCoin(int coin) {
        if (Coin.COINS.contains(coin)) {
            balance += coin;
        } else {
            throw new IllegalArgumentException("Coins can only be of value 1, 2, 5, 10, 20 or 50");
        }
    }

    public void purchaseItem(int id) {

    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int getBalance() {
        return balance;
    }
}
