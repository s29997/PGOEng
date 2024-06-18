package Tests.Test2.Test;

import java.util.Date;
//bruhbruhbruh
public class SalesReport {
    public String generateClientInvoice(Client c, Date startDate, Date endDate) {

        return "Generated invoice for client: " + c.getFirstName() + " " + c.getLastName() +
                " from " + startDate.toString() + " to " + endDate.toString();
    }
}
