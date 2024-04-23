package PGO6;
import java.util.ArrayList;
public class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel; // social security number (PESEL)
    protected int yearOfEmployment;

    // Constructor
    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }
    public int calculateBaseSalary() {
        int baseSalary = 3000 + (1000 * (2024 - yearOfEmployment)); // Assuming the current year is 2024
        return baseSalary;
    }
    public int calculateSalary() {
        return calculateBaseSalary();
    }
}