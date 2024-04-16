package PGO4;
import java.util.ArrayList;
import java.util.List;
public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> grades = new ArrayList<>();
    private static int maxAmountOfGrades = 20;
    private static double[] allowedGradeValues = {2, 3.5, 3, 3.5, 4, 4.5, 5};
    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }
    public void addGrades(double grade) {
        if (grades.size() < maxAmountOfGrades) {
            if (isAllowedGrade(grade)) {
                grades.add(grade);
            } else {
                throw new IllegalArgumentException("Value of the grade (" + grade + ") is not corresponding with the allowed ones.");
            }
        } else {
            throw new IllegalArgumentException("It's not possible to add more grades than " + maxAmountOfGrades);
        }
    }
    public double calculateAverageGrade(double grade) {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Grades are missing");
        }
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            grade = grades.get(i);
            sum += grade;
        }
        return sum / grades.size();
    }
    private boolean isAllowedGrade(double grade) {
        for (double allowedGrade : allowedGradeValues) {
            if (allowedGrade == grade) {
                return true;
            }
        }
        return false;
    }
}