package PGO10;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2020, 500, 20);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles/gallon");

        Truck truck = new Truck("Ford", "F-150", 2021, 600, 40, 2);
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles/gallon");
    }
}