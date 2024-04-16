package PGO5;

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