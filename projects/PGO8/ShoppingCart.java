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
        if (product.getStock() > 0) {
            this.products.add(product);
            product.setStock(product.getStock() - 1);
        } else {
            System.out.println("Product out of stock");
        }
    }

    // Method to remove a product
    public void removeProduct(Product product) {
        if (this.products.remove(product)) {
            product.setStock(product.getStock() + 1);
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

    // Main method to test the ShoppingCart class
    public static void main(String[] args) {
        // Create users
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Create products
        Product product1 = new Product("Product 1", 10, "34592405");
        Product product2 = new Product("Product 2", 15, "25352455");

        // Create shopping carts using different constructors
        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(user1);
        ShoppingCart cart3 = new ShoppingCart(user2, new ArrayList<>());

        // Add products to carts
        cart1.addProduct(product1);
        cart1.addProduct(product2);
        cart2.addProduct(product1);
        cart3.addProduct(product2);

        // Remove a product from cart1
        cart1.removeProduct(product1);

        // Pay for purchases
        System.out.println("Total price in cart1: $" + cart1.pay());
        System.out.println("Total price in cart2: $" + cart2.pay());
        System.out.println("Total price in cart3: $" + cart3.pay());
    }
}
