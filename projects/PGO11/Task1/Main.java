package PGO11.Task1;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Corolla", 2010));
        cars.add(new Car("Ford Mustang", 2015));
        cars.add(new Car("Chevrolet Camaro", 2012));
        cars.add(new Car("Honda Civic", 2018));
        cars.add(new Car("Tesla Model S", 2020));
        cars.add(new Car("BMW 3 Series", 2016));
        cars.add(new Car("Audi A4", 2019));
        cars.add(new Car("Mercedes-Benz C-Class", 2017));
        cars.add(new Car("Mazda 6", 2014));
        cars.add(new Car("Subaru Impreza", 2013));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
