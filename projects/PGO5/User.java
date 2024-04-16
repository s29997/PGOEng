package PGO5;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;

    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }

    public void convertToNormalAccount(String name, String lastName, String password) {
        if (this.isGuest) {
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            this.isGuest = false;
        } else {
            System.out.println("This is already a normal account.");
        }

    }

    public String getEmail() {
        return this.email;
    }

    public boolean isGuest() {
        return this.isGuest;
    }
}
