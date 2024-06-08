package PGO3.task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class TicketpriceTest {
    TicketpriceTest() {
    }
    @Test
    void calculateTicketPrice_AdultResident() {
        Ticket ticket = new Ticket();
        ticket.setCity("Warsaw");
        ticket.setAge(25);
        ticket.setResident(true);
        ticket.setThursday(false);
        Ticketprice calculator = new Ticketprice();
        double expectedPrice = 36.0;
        Assertions.assertEquals(expectedPrice, calculator.calculateTicketPrice(ticket));
    }
    @Test
    void calculateTicketPrice_ThursdayChild() {
        Ticket ticket = new Ticket();
        ticket.setCity("Krakow");
        ticket.setAge(8);
        ticket.setResident(false);
        ticket.setThursday(true);
        Ticketprice calculator = new Ticketprice();
        Assertions.assertEquals(0.0, calculator.calculateTicketPrice(ticket));
    }
    @Test
    void generateTicketDetails() {
        Ticket ticket = new Ticket();
        ticket.setCity("Gdansk");
        ticket.setAge(15);
        ticket.setResident(false);
        ticket.setThursday(false);
        Ticketprice calculator = new Ticketprice();
        String expectedDetails = "Data: Gdansk, 15 years old, weekday\nTicket price: 20.0 PLN, discount: 50.0%";
        Assertions.assertEquals(expectedDetails, calculator.generateTicketDetails(ticket, 20.0));
    }
    @Test
    void calculateDiscountPercentage_ChildOnThursday() {
        Ticket ticket = new Ticket();
        ticket.setCity("Warsaw");
        ticket.setAge(5);
        ticket.setResident(false);
        ticket.setThursday(true);
        Ticketprice calculator = new Ticketprice();
        Assertions.assertEquals(100.0, calculator.calculateDiscountPercentage(ticket));
    }
}