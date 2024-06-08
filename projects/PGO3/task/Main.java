package PGO3.task;
import java.util.Scanner;
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Are you a resident of Warsaw? (true/false): ");
        boolean isResident = scanner.nextBoolean();
        System.out.println("Is it Thursday? (true/false): ");
        boolean isThursday = scanner.nextBoolean();
        Ticket ticket = new Ticket();
        ticket.setCity(city);
        ticket.setAge(age);
        ticket.setResident(isResident);
        ticket.setThursday(isThursday);
        Ticketprice calculator = new Ticketprice();
        double ticketPrice = calculator.calculateTicketPrice(ticket);
        String ticketDetails = calculator.generateTicketDetails(ticket, ticketPrice);
        System.out.println(ticketDetails);
    }
}