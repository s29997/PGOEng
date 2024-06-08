package PGO11.Task4;
import java.util.Scanner;

public class Main {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] numbers = new int[ARRAY_SIZE];
        fillArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                array[i] = 0;
            }
        }
    }
}