package me.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Shop {

    private String name;
    private HashMap<String, Product> products;

    public Shop(String name) {
        this.name = name;
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        this.products.put(product.getName().toLowerCase(), product);
    }

    public void buyProduct(String name, double balance, int amount)
            throws NoSuchElementException, ProductInsuffientStockException, InsufficientFundsException {
        if (name == null) {
            throw new NoSuchElementException("Cannot search with null");
        }

        // 1. Produkten hittas inte
        // 2. Hantera stora/små bokstäver
        Product product = this.products.get(name.toLowerCase());
        if (product == null) {
            throw new NoSuchElementException("Product '" + name + "' could not be found");
        }

        // 3. Produkten otillräckligt lager
        if (product.getStockAmount() < amount) {
            throw new ProductInsuffientStockException("Request product amount exceeds stock amount");
        }

        // 4. Saldot otillräckligt med pengar
        double totalPrice = product.getPrice() * amount;
        if (balance < totalPrice) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        product.decreaseStockAmount(amount);
        System.out.println("Produkt " + product.getName() + " köptes!");
    }

    public static Shop[] generateShops() {
        Shop[] shops = new Shop[2];

        // Första affären - Elektronikbutik
        Shop elektronikbutik = new Shop("TechZone Elektronik");

        // Lägg till elektronikprodukter
        elektronikbutik.addProduct(new Product("iPhone 15", 25, 12999.0));
        elektronikbutik.addProduct(new Product("Samsung Galaxy S24", 18, 11499.0));
        elektronikbutik.addProduct(new Product("MacBook Air M2", 12, 15999.0));
        elektronikbutik.addProduct(new Product("Dell XPS 13", 8, 13499.0));
        elektronikbutik.addProduct(new Product("iPad Pro", 20, 9999.0));
        elektronikbutik.addProduct(new Product("Apple Watch Series 9", 30, 4999.0));
        elektronikbutik.addProduct(new Product("AirPods Pro", 45, 2999.0));
        elektronikbutik.addProduct(new Product("Sony WH-1000XM5", 22, 3999.0));
        elektronikbutik.addProduct(new Product("Nintendo Switch", 35, 2999.0));
        elektronikbutik.addProduct(new Product("PlayStation 5", 5, 5999.0));
        elektronikbutik.addProduct(new Product("Xbox Series X", 7, 5499.0));
        elektronikbutik.addProduct(new Product("Samsung 55\" OLED TV", 6, 14999.0));
        elektronikbutik.addProduct(new Product("Logitech MX Master 3", 40, 899.0));
        elektronikbutik.addProduct(new Product("Mechanical Keyboard", 25, 1299.0));
        elektronikbutik.addProduct(new Product("USB-C Hub", 60, 599.0));
        elektronikbutik.addProduct(new Product("Webcam 4K", 33, 1999.0));
        elektronikbutik.addProduct(new Product("Bluetooth Speaker", 28, 1499.0));
        elektronikbutik.addProduct(new Product("Power Bank 20000mAh", 50, 799.0));
        elektronikbutik.addProduct(new Product("Gaming Monitor 27\"", 15, 3999.0));
        elektronikbutik.addProduct(new Product("External SSD 1TB", 24, 1199.0));

        // Andra affären - Livsmedelsbutik
        Shop livsmedelsbutik = new Shop("ICA Maxi Handla");

        // Lägg till livsmedelsprodukter
        livsmedelsbutik.addProduct(new Product("Mjölk 3%", 120, 18.50));
        livsmedelsbutik.addProduct(new Product("Ägg 12-pack", 80, 35.90));
        livsmedelsbutik.addProduct(new Product("Bröd Fullkorn", 45, 29.90));
        livsmedelsbutik.addProduct(new Product("Smör 500g", 60, 42.90));
        livsmedelsbutik.addProduct(new Product("Ost Gouda", 35, 89.90));
        livsmedelsbutik.addProduct(new Product("Kyckling 1kg", 25, 119.90));
        livsmedelsbutik.addProduct(new Product("Fläskkarré", 20, 149.90));
        livsmedelsbutik.addProduct(new Product("Lax 500g", 15, 189.90));
        livsmedelsbutik.addProduct(new Product("Bananer 1kg", 200, 19.90));
        livsmedelsbutik.addProduct(new Product("Äpplen 1kg", 150, 29.90));
        livsmedelsbutik.addProduct(new Product("Tomater", 100, 39.90));
        livsmedelsbutik.addProduct(new Product("Gurka", 80, 12.90));
        livsmedelsbutik.addProduct(new Product("Potatis 2kg", 60, 24.90));
        livsmedelsbutik.addProduct(new Product("Morötter 1kg", 90, 15.90));
        livsmedelsbutik.addProduct(new Product("Pasta 500g", 200, 12.90));
        livsmedelsbutik.addProduct(new Product("Ris 1kg", 75, 22.90));
        livsmedelsbutik.addProduct(new Product("Kött Köttfärs", 40, 89.90));
        livsmedelsbutik.addProduct(new Product("Yoghurt 1L", 65, 24.90));
        livsmedelsbutik.addProduct(new Product("Kaffe 500g", 55, 69.90));
        livsmedelsbutik.addProduct(new Product("Te Earl Grey", 85, 39.90));
        livsmedelsbutik.addProduct(new Product("Juice 1L", 95, 19.90));
        livsmedelsbutik.addProduct(new Product("Müsli 500g", 42, 49.90));
        livsmedelsbutik.addProduct(new Product("Honung 350g", 30, 54.90));
        livsmedelsbutik.addProduct(new Product("Olivolja 500ml", 28, 79.90));
        livsmedelsbutik.addProduct(new Product("Salt 1kg", 150, 9.90));

        shops[0] = elektronikbutik;
        shops[1] = livsmedelsbutik;

        return shops;
    }
}
