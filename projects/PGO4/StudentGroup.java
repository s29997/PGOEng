package PGO4;
import java.util.ArrayList;
import java.util.List;
public class StudentGroup {
    public String groupName;
    public  List<String> students;

    public StudentGroup(String groupName) {
        this.groupName=groupName;
        this.students=new ArrayList<>();
    }
    public void addStudents(String student) {
        int allowedGroupSize = 15;
        if (students.size() >= allowedGroupSize) {
            throw new IllegalStateException("There is already maximum amount of students in the group. Cannot add more students(");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student is already in the group!");
        }
        students.add(student);
    }
}