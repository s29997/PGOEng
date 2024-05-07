package Test1;

public class Boat extends Watercraft {
    private String BoatType;
    private int Capacity;

    public Boat(String color, String model, String registrationNumber, Integer yearOfProduction, String boatType, int capacity) {
        super(color, model, registrationNumber, yearOfProduction);
        this.setBoatType(boatType);
        this.setCapacity(capacity);
    }

    public void setBoatType(String boatType) {
        BoatType = boatType;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}
