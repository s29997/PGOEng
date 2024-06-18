package Tests.Test2.Test;
import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Client c = new Client("John", "Smith");

        c.applyDiscount(15.0);

        Product p = new Product("Software XYZ", "BBB", 200.00);
        p.deleteProduct(p.getId());

        Subscription s = new Subscription("Software XYZ", "BBB", 200.00, 3);

        ArrayList<Subscription> activeSubscriptions = c.listActiveSubscriptions();

        for (Subscription sub : activeSubscriptions) {
            System.out.println("Active Subscription: " + sub.getName());

        SoftwareLicence s1 = new SoftwareLicence("Software ABC", "AAA", 120.00, "AAAA123", new Date(2024,1,2), "single-user");
        c.upgradeLicense(s1, "multi-user");

        SalesReport report = new SalesReport();
        String clientInvoice = report.generateClientInvoice(c, new Date(2023,1,1), new Date(2023, 12, 31));
        System.out.println("Client Invoice: " + clientInvoice);
        }
    }
}
