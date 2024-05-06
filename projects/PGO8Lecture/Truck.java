package PGO8Lecture;
public class Truck extends Vehicle {
    private int loadCapacity;
    public Truck(String brand, String model, String registrationNumber, Integer yearOfProduction, Integer LoadCapacity) {
        super(brand, model, registrationNumber, yearOfProduction);
        this.setLoadCapacity(loadCapacity);
    }
    public void setLoadCapacity(int loadCapacity){
        if (loadCapacity >= 0){
            this.loadCapacity = loadCapacity;
        }else{
            throw new IllegalArgumentException("wrong");
        }
    }
}
