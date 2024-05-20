package PGO8;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    // Constructor with no parameters
    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.user = null;
    }

    // Constructor with user account
    public ShoppingCart(User user) {
        this.products = new ArrayList<>();
        this.user = user;
    }

    // Constructor with user account and list of products
    public ShoppingCart(User user, List<Product> products) {
        this.products = products;
        this.user = user;
    }

    // Method to add a product
    public void addProduct(Product product) {
        if (product.getNumberOfPieces() > 0) {
            this.products.add(product);
            product.changeNumberOfPieces(product.getNumberOfPieces() - 1);
        } else {
            System.out.println("Product out of stock");
        }
    }

    // Method to remove a product
    public void removeProduct(Product product) {
        if (this.products.remove(product)) {
            product.changeNumberOfPieces(product.getNumberOfPieces() + 1);
        } else {
            System.out.println("Product not in cart");
        }
    }

    // Method to calculate total price
    public double pay() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
