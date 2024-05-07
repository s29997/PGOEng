package Test1;

public class Yacht extends Watercraft {
    private int loadCapacity;
    public Yacht(String brand, String model, String registrationNumber, Integer yearOfProduction, Integer LoadCapacity) {
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
