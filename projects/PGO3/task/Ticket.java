package PGO3.task;
public class Ticket {
    private String city;
    private int age;
    private boolean isResident;
    private boolean isThursday;

    public Ticket() {
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isResident() {
        return this.isResident;
    }

    public void setResident(boolean resident) {
        this.isResident = resident;
    }

    public boolean isThursday() {
        return this.isThursday;
    }

    public void setThursday(boolean thursday) {
        this.isThursday = thursday;
    }
}