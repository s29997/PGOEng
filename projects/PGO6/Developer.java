package PGO6;
import java.util.ArrayList;
public class Developer extends Employee {
    private ArrayList<Technology> knownTech;
    public Developer(
            String firstName,
            String lastName,
            String address,
            String email,
            String pesel,
            int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.knownTech = new ArrayList<>();
    }
    public void addTechnology(Technology technology) {
        knownTech.add(technology);
    }
    public int calculateSalary() {
        int salary = super.calculateBaseSalary();
        for (Technology tech : knownTech) {
            salary += tech.getBonus();
        }
        return salary;
    }
}