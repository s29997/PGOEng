package PGO6;
public class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel;
    protected int yearOfEmployment;
    int currentYear = 2024;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateBaseSalary() {
        return 3000 + (1000 * (currentYear - yearOfEmployment));
    }
}
