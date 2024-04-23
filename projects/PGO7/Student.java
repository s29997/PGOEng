package PGO7;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private static int studentCount = 0;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String email;
    private String address;
    private String indexNumber;
    private String status;
    private int currentSemester;
    private Map<String, Integer> grades;
    private Studies studies;

    public Student(String firstName, String lastName, String email, String address, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.birthdate = birthdate;
        this.indexNumber = "s" + (++studentCount);
        this.status = "candidate";
        this.currentSemester = 1;
        this.grades = new HashMap<>();
    }

    // Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Studies getStudies() {
        return studies;
    }

    public void setStudies(Studies studies) {
        this.studies = studies;
    }
    public void enrollStudent(Studies studies) {
        this.studies = studies;
    }

    public void addGrade(int grade, String subject) {
        this.grades.put(subject, grade);
    }
    public void promoteToNextSemester() {
        if (currentSemester < studies.getNumberOfSemesters()) {
            currentSemester++;
            if (currentSemester == studies.getNumberOfSemesters()) {
                status = "graduate";
            }
        }
    }
}