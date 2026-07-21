# Vending Machine Class Diagram

## Scenario

A vending machine stocks three categories of products: snacks, beverages, and fruits. Every product has a name, a
price, and a stock quantity. But each category also carries its own detail — a snack has a weight in grams, a beverage
has a volume in ml, and a fruit has a country of origin. When a product is displayed, it should describe itself
including that specific detail. The machine runs on coins. It accepts only the standard Swedish coin values: 1, 2, 5,
10, 20, and 50 kr. Any other value is rejected immediately and the balance does not change.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Main {
        - vm: VendingMachine
    }
    class VendingMachine {
        - products: List~Product~
    }
    class Product {
        <<abstract>>
        - id: int
        - name: String
        - price: int
        - quantity: int
        + describe()*
    }
    class Snack {
        - weight: int
    }
    class Beverage {
        - volume: int
    }
    class Fruit {
        - origin: String
    }
    class Coins {
        <<enumeration>>
        1, 2, 5, 10, 20, 50
    }

Main "1" o-- "1" VendingMachine: has
VendingMachine "1" o-- "1..*" Product: has
VendingMachine --> Coins: uses
Product <-- Snack
Product <-- Beverage
Product <-- Fruit
```
