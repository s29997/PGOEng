public class Main {
    public static void main(String[] args) {
        // Creating user accounts
        User guest1 = new User("guest1@example.com");
        User guest2 = new User("guest2@example.com");
        User user1 = new User("John", "Doe", "john@example.com", "password123");

        // Converting a guest account to a normal account
        guest1.convertToNormalAccount("Jane", "Smith", "password456");

        // Creating products
        Product product1 = new Product("Phone", 599.99, "PHN001");
        Product product2 = new Product("Laptop", 999.99, "LPT001", 10);
        Product product3 = new Product("Tablet", 299.99, "TBL001");

        // Changing the price of a product
        product1.setPrice(649.99);

        // Setting the number of pieces for a product
        product3.setNumberOfPieces(5);
    }
}