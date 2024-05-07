package Test1;

public class Yacht extends Watercraft {
    private int length;
    private String luxuryLevel;
    public Yacht(String color, String model, String registrationNumber, Integer yearOfProduction, int length, String luxuryLevel) {
        super(color, model, registrationNumber, yearOfProduction);
        this.length = length;
        this.luxuryLevel = luxuryLevel;
    }
///
    private void setLength(int length) {
        if (length<=0) {
            throw new IllegalArgumentException("too short bruh");
        }else{
            this.length = length;
        }
    }

    private void setLuxuryLevel(String luxuryLevel) {
        this.luxuryLevel = luxuryLevel;
    }
///
    public int getLength() {
        return length;
    }
    public String getLuxuryLevel() {
        return luxuryLevel;
    }
///
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(length);
        System.out.println(luxuryLevel);
    }
}
