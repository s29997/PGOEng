package PGO5;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean isGuest;
    public User() {
        this.isGuest = false;
    }
    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }
    public void transfromUser(String name, String lastName, String password) {
        if (isGuest) {
            this.name = name;
            this.surname = lastName;
            this.password = password;
            this.isGuest = false;
        } else {
            System.out.println("This is already a user account.");
        }
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isGuest() {
        return isGuest;
    }
}
