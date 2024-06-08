package PGO11.Task1;
public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Car "+ "model: " + model + ", year: " + year + '}';
    }
}