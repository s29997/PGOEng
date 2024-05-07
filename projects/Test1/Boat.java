package Test1;

public class Boat extends Watercraft {
    private boolean IsEletric;
    public Boat(String color, String model, String registrationNumber, Integer yearOfProduction, boolean IsElectric) {
        super(color, model, registrationNumber, yearOfProduction);
        this.setEletric(IsEletric);
    }
    public void setEletric(boolean eletric) {
        IsEletric = eletric;
    }
}
