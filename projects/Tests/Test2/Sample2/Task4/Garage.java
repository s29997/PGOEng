package Tests.Test2.Sample2.Task4;

import java.util.ArrayList;
import java.util.List;

class Garage {
    private List<Vehicle> cars;
    private int capacity;

    public Garage(int capacity) {
        this.cars = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addCar(Vehicle car) {
        if (cars.size() >= capacity) {
            throw new IllegalStateException("Garage is full.");
        }
        cars.add(car);
    }

    public List<Vehicle> getCars() {
        return cars;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
