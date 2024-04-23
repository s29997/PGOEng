package PGO6;
import java.util.ArrayList;
public class Manager extends Employee {
    private final ArrayList<Goal> goals;
    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goals = new ArrayList<>();
    }
    public void addGoal(Goal goal) {
        goals.add(goal);
    }
    public int calculateSalary() {
        int salary = super.calculateBaseSalary();
        for (int i = 0; i < goals.size(); i++) {
            Goal goal = goals.get(i);
            {
                if (goal.isAchieved()) {
                    salary += goal.getBonus();
                }
            }
        }
        return salary;
    }
}
