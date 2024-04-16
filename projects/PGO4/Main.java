package PGO4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGroup group1 = new StudentGroup(scanner.next());
        Student student1 = new Student(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
        group1.addStudents(student1.indexNumber);
    }
}
