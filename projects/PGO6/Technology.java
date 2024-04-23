package PGO6;
public class Technology {
    private String name;
    private int bonus;

    // Constructor
    public Technology(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    // Getter for bonus
    public int getBonus() {
        return bonus;
    }
}