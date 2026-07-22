package se.lexicon.service;

import se.lexicon.model.Beverage;
import se.lexicon.model.Fruit;
import se.lexicon.model.Product;
import se.lexicon.model.Snack;
import se.lexicon.validator.Coin;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    private int balance;

    public VendingMachine() {
        products = new ArrayList<>();
        products.add(new Fruit(1, "Banana", 15, 5, "Brasil"));
        products.add(new Beverage(2, "Loka", 25, 3, 330));
        products.add(new Snack(3, "Chocolate", 30, 2, 200));
        balance = 0;
    }

    public void insertCoin(int coin) {
        if (Coin.COINS.contains(coin)) {
            balance += coin;
        } else {
            throw new IllegalArgumentException("Coins can only be of value 1, 2, 5, 10, 20 or 50");
        }
    }
}
