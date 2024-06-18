package Tests.Test2.Test;

import java.util.ArrayList;

public class Product {
    private static ArrayList<Product> productList = new ArrayList<>();
    private String name;
    private String description;
    private double price;
    private static int idCounter = 0;
    private int id;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = ++idCounter;
        productList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty!");
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be negative or zero!");
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public static void deleteProduct(int id) {
        Product productToDelete = null;
        for (Product product : productList) {
            if (product.getId() == id) {
                productToDelete = product;
                break;
            }
        }
        if (productToDelete == null) {
            throw new IllegalArgumentException("Product not found!");
        }
        productList.remove(productToDelete);
        System.out.println("Product with ID " + id + " deleted.");
    }
}
