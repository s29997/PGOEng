package Test1;

public class Boat extends Watercraft {
    private String BoatType;
    private int Capacity;

    public Boat(String color, String model, String registrationNumber, Integer yearOfProduction, String boatType, int capacity) {
        super(color, model, registrationNumber, yearOfProduction);
        this.setBoatType(boatType);
        this.setCapacity(capacity);
    }
///
    private void setBoatType(String boatType) {
        BoatType = boatType;
    }
    private void setCapacity(int capacity) {
        if (Capacity <= 0) {
            throw new IllegalArgumentException("cant be negative weight");
        }else {
            Capacity = capacity;
        }
    }
///
    public String getBoatType() {
        return BoatType;
    }
    public int getCapacity() {
        return Capacity;
    }
///
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(BoatType);
        System.out.println(Capacity);
    }
}
