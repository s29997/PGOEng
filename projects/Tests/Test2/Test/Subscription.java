package Tests.Test2.Test;

public class Subscription {
    private String name;
    private String description;
    private double pricePerMonth;
    private int renewalPeriod;
    private boolean active;

    public Subscription(String name, String description, double pricePerMonth, int renewalPeriod) {
        this.name = name;
        this.description = description;
        this.pricePerMonth = pricePerMonth;
        this.renewalPeriod = renewalPeriod;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty!");
        }
        this.name = name;
    }

    public boolean isActive() {
        return this.active && this.renewalPeriod > 0;
    }
}
