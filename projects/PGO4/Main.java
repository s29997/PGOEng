package PGO4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new StudentGroup(scanner.next());
        new Student(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
    }
}
