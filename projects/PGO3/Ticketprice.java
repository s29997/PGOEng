package PGO3;
public class Ticketprice {
    public Ticketprice() {
    }

    public double calculateTicketPrice(Ticket ticket) {
        double basePrice = 40.0;
        double discount = this.calculateDiscount(ticket);
        return basePrice * (1.0 - discount);
    }

    public String generateTicketDetails(Ticket ticket, double ticketPrice) {
        String dayOfWeek = ticket.isThursday() ? "Thursday" : "weekday";
        String var10000 = ticket.getCity();
        return "Data: " + var10000 + ", " + ticket.getAge() + " years old, " + dayOfWeek + "\nTicket price: " + ticketPrice + " PLN, discount: " + this.calculateDiscountPercentage(ticket) + "%";
    }

    public double calculateDiscountPercentage(Ticket ticket) {
        return this.calculateDiscount(ticket) * 100.0;
    }

    private double calculateDiscount(Ticket ticket) {
        double discount = 0.0;
        if (this.isUnderAgeOrThursday(ticket)) {
            discount = 1.0;
        } else if (ticket.getAge() >= 10 && ticket.getAge() <= 18) {
            discount = 0.5;
        }

        if (ticket.isResident()) {
            discount += 0.1;
        }

        if (discount >= 1.0) {
            discount = 1.0;
        }

        return discount;
    }

    private boolean isUnderAgeOrThursday(Ticket ticket) {
        return ticket.getAge() < 10 || ticket.isThursday();
    }
}