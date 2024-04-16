public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    // Constructor for creating a product with default number of pieces (0)
    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    // Constructor for creating a product with specified number of pieces
    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }

    // Method to change the price of the product
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to change the number of pieces
    public void setNumberOfPieces(int numberOfPieces) {
        if (numberOfPieces >= 0) {
            this.numberOfPieces = numberOfPieces;
        } else {
            System.out.println("Number of pieces cannot be less than 0.");
        }
    }

    // Getters for all parameters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }
}
