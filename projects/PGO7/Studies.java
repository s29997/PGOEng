package PGO7;
public class Studies {
    private String programName;
    private String description;
    private int numberOfSemesters;
    private int maxITNsAllowed;
    public Studies(String programName, String description, int numberOfSemesters, int maxITNsAllowed) {
        this.programName = programName;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNsAllowed = maxITNsAllowed;
    }
    public String getProgramName() {
        return programName;
    }
    public String getDescription() {
        return description;
    }
    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }
    public int getMaxITNsAllowed() {
        return maxITNsAllowed;
    }
}