package PGO5;
public class Main {
    public static void main(String[] args) {
        User guest1 = new User("guest1@example.com");
        new User("guest2@example.com");
        new User("John", "Doe", "john@example.com", "password123");
        guest1.convertToNormalAccount("Jane", "Smith", "password456");
        Product product1 = new Product("Phone", 599.99, "PHN001");
        new Product("Laptop", 999.99, "LPT001", 10);
        Product product3 = new Product("Tablet", 299.99, "TBL001");
        product1.setPrice(649.99);
        product3.setNumberOfPieces(5);
    }
}