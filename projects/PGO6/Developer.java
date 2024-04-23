package PGO6;
import java.util.ArrayList;
public class Developer extends Employee {
    private ArrayList<Technology> knownTechnologies;
    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.knownTechnologies = new ArrayList<>();
    }
    public void addTechnology(Technology technology) {
        knownTechnologies.add(technology);
    }
    public int calculateSalary() {
        int salary = super.calculateBaseSalary();
        for (Technology tech : knownTechnologies) {
            salary += tech.getBonus();
        }
        return salary;
    }
}