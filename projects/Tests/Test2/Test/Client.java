package Tests.Test2.Test;

import java.util.ArrayList;

public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double discount;
    private ArrayList<Subscription> subscriptions;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriptions = new ArrayList<>();
    }

    public Client(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subscriptions = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name can't be empty!");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name can't be empty!");
        }
        this.lastName = lastName;
    }

    public void applyDiscount(double discount) {
        if (discount <= 0 || discount > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100!");
        }
        this.discount = discount;
        System.out.println("Discount applied: " + discount + "%");
    }

    public ArrayList<Subscription> listActiveSubscriptions() {
        ArrayList<Subscription> activeSubscriptions = new ArrayList<>();
        for (Subscription sub : subscriptions) {
            if (sub.isActive()) {
                activeSubscriptions.add(sub);
            }
        }
        return activeSubscriptions;
    }

    public void upgradeLicense(SoftwareLicence license, String type) {
        for (Subscription subscription : subscriptions) {
            subscription.setActive();
        }
        System.out.println("License upgraded to: " + type);
    }
}
