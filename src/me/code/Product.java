package me.code;

public class Product {

    private String name;
    private int stockAmount;
    private double price;

    public Product(String name, int stockAmount, double price) {
        this.name = name;
        this.stockAmount = stockAmount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void decreaseStockAmount(int amount) {
        this.stockAmount -= amount;
    }

    public double getPrice() {
        return price;
    }
}
