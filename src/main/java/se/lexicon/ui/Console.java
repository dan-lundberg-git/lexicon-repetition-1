package se.lexicon.ui;

import se.lexicon.model.Product;
import se.lexicon.validator.Color;

import java.util.List;

public class Console {
    public void printMenu(List<Product> products, int balance) {
        System.out.println(Color.COLOR_BLUE.getColor() + "Welcome to Lexicon Vending Machine");
        System.out.println("-------------------------------------------------------------");
        for (Product product : products) {
            System.out.printf("[%d] ", product.getId());
            System.out.printf("%-20s", product.getName());
            System.out.printf("- %d kr ", product.getPrice());
            System.out.printf("%-20s ", product.describeItem());
            System.out.printf("Stock: %d%n", product.getQuantity());
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Type [X] to quit the Lexicon Vending Machine." + Color.COLOR_DEFAULT.getColor());
        System.out.println(Color.COLOR_YELLOW.getColor() + "Balance: " + balance + " kr" + Color.COLOR_DEFAULT.getColor());
    }
}
