package PGO8;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.user = null;
    }

    public ShoppingCart(User user) {
        this.products = new ArrayList<>();
        this.user = user;
    }

    public ShoppingCart(User user, List<Product> products) {
        this.products = products;
        this.user = user;
    }

    public void addProduct(Product product) {
        if (product.getNumberOfPieces() > 0) {
            this.products.add(product);
            product.changeNumberOfPieces(product.getNumberOfPieces() - 1);
        } else {
            System.out.println("Product out of stock");
        }
    }

    public void removeProduct(Product product) {
        if (this.products.remove(product)) {
            product.changeNumberOfPieces(product.getNumberOfPieces() + 1);
        } else {
            System.out.println("Product not in cart");
        }
    }


    public double pay() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
