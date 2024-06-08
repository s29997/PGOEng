package PGO9.Task3;

import java.time.LocalDate;

public class Employee extends Person {
    private int hireDate;
    private String companyName;
    private double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return LocalDate.now().getYear() - hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireDate() {
        return hireDate;
    }

    public String getCompanyName() {
        return companyName;
    }
}

