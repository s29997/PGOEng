package PGO5;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        if (numberOfPieces >= 0) {
            this.numberOfPieces = numberOfPieces;
        } else {
            System.out.println("Number of pieces cannot be less than 0.");
        }

    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }
}
