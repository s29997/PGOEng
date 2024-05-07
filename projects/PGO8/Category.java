package PGO8;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> products;

    // Constructor with no parameters
    public Category() {
        this.name = "Main Category";
        this.products = new ArrayList<>();
    }

    // Constructor with category name
    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Constructor with category name and list of products
    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    // Method to add a product
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // Method to remove a product
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
