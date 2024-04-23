package PGO7;
import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentList = new ArrayList<>();

    public static void promoteAllStudents() {
        for (Student student : studentList) {
            if (!student.getStatus().equals("graduate")) {
                if (student.getCurrentSemester() < student.getStudies().getNumberOfSemesters()) {
                    student.promoteToNextSemester();
                } else {
                    student.setStatus("graduate");
                }
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Index Number: " + student.getIndexNumber());
            System.out.println("Status: " + student.getStatus());
            System.out.println("Current Semester: " + student.getCurrentSemester());
            System.out.println("Program Name: " + student.getStudies().getProgramName());
            System.out.println("Description: " + student.getStudies().getDescription());
            System.out.println("Number of Semesters: " + student.getStudies().getNumberOfSemesters());
            System.out.println("Max ITNs Allowed: " + student.getStudies().getMaxITNsAllowed());
            System.out.println("Grades: " + student.getGrades());
            System.out.println();
        }
    }

    public static void addStudent(Student student) {
        studentList.add(student);
    }
}