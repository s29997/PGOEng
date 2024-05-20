package PGO8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    User user1=new User("ab322@pjwstk.edu.pl");
        user1.transfromUser("Alice", "Baker", "45678");
        user1.setPassword("102938");
    User user2=new User("ab322@pjwstk.edu.pl");
        user2.transfromUser("Alice","Baker","45678");
        user2.setPassword("102938");
    User user3=new User("jk123@pjwstk.edu.pl");
        user3.transfromUser("Jakub", "Kowalski", "88888");
        user3.setPassword("77777");

        Product product1=new Product("cargo111", 999.90, "c123");
        product1.setPrice(799.90);
        product1.changePrice(649.99);
        product1.changeNumberOfPieces(5);

        Product product2=new Product("cargo222", 899.90, "c456");
        product2.setPrice(899.90);
        product2.changePrice(749.99);
        product2.changeNumberOfPieces(5);

        Product product3=new Product("cargo33", 999.90, "c789");
        product3.setPrice(999.90);
        product3.changePrice(849.99);
        product3.changeNumberOfPieces(5);

        displayUserInfo(user1);
        displayUserInfo(user2);
        displayUserInfo(user3);
        displayProductInfo(product1);
        displayProductInfo(product2);
        displayProductInfo(product3);

        // Create products
        Product product4 = new Product("Product 1", 10, "sdhthrth");
        Product product5 = new Product("Product 2", 15, "3563163156");
        Product product6 = new Product("Product 3", 20, "543613546234");

        Category mainCategory = new Category();
        Category electronicsCategory = new Category("Electronics");
        Category groceryCategory = new Category("Grocery", new ArrayList<>());

        mainCategory.addProduct(product5);
        electronicsCategory.addProduct(product4);
        groceryCategory.addProduct(product6);

        System.out.println(mainCategory.getName() + ": " + mainCategory.getProducts().size() + " products");
        System.out.println(electronicsCategory.getName() + ": " + electronicsCategory.getProducts().size() + " products");
        System.out.println(groceryCategory.getName() + ": " + groceryCategory.getProducts().size() + " products");

        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(user1);
        ShoppingCart cart3 = new ShoppingCart(user2, new ArrayList<>());

        cart1.addProduct(product1);
        cart1.addProduct(product2);
        cart2.addProduct(product1);
        cart3.addProduct(product2);

        cart1.removeProduct(product1);

        System.out.println("Total price in cart1: $" + cart1.pay());
        System.out.println("Total price in cart2: $" + cart2.pay());
        System.out.println("Total price in cart3: $" + cart3.pay());
    }
    public static void displayUserInfo(User user) {
        System.out.println("User Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Is Guest: " + user.isGuest());
        System.out.println();
    }
    public static void displayProductInfo(Product product) {
        System.out.println("Product Information:");
        System.out.println("Name: " + product.getName());
        System.out.println("Old Price: $" + product.getPrice());
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Number of Pieces: " + product.getNumberOfPieces());
        System.out.println();
    }
}