package PGO8.Lecture;
import java.util.ArrayList;
public class garage {
    private String name;
    private String adress;
    private int MaxVehiclesCapacity;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public garage(String name, String adress, int maxVehiclesCapacity) {
        this.setName(name);
        this.setAdress(adress);
        this.setMaxVehiclesCapacity(maxVehiclesCapacity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMaxVehiclesCapacity(int maxVehiclesCapacity) {
        MaxVehiclesCapacity = maxVehiclesCapacity;
    }

    public int getMaxVehiclesCapacity() {
        return MaxVehiclesCapacity;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.size()>=getMaxVehiclesCapacity() ){
            throw new IllegalArgumentException("womp womp. not enough space");
        }else{
            vehicles.add(vehicle);
        }
    }
}

